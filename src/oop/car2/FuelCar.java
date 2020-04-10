package oop.car2;

public class FuelCar extends Car implements Tankable {
    public FuelCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void tank() {
        System.out.println( getManufacturer() + " model " + getModel() + " fuel car is filling up.");


    }


}
