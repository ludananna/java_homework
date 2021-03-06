package oop.car2;

public class CarTester {
    public static void main(String[] args) {

        Car tesla = new ElectricCar("Tesla", "S");
        Car honda = new FuelCar("Honda", "Accord");
        Car toyota = new HybridCar("Toyota ", "Prius");


        Car[] cars = {tesla, honda, toyota};
        for (Car car : cars) {
            checkCar(car);
        }
    }

    private static void checkCar(Car car) {
        if (car instanceof Tankable) {
            ((Tankable) car).tank();
        }
        if (car instanceof Chargable) {
            ((Chargable) car).charge();
        }
    }
}
