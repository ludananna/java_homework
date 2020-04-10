package oop.car2;

public class ElectricCar extends Car implements Chargable {
    public ElectricCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.println(getManufacturer() + " model " + getModel() + " electric car is charging.");
    }


}
