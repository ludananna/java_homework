package oop.car2;

public class HybridCar extends Car implements Tankable , Chargable {
    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void tank() {
        System.out.println(getManufacturer() + " model " + getModel() + " hybrid car is filling up.");

    }

    @Override
    public void charge() {
        System.out.println(" hybrid car is charging");

    }

}
