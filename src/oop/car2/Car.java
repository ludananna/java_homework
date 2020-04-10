package oop.car2;

public class Car {
    private String manufacturer;
    private String model;

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}



//   Create Car class. It has manufacturer and model properties. Create constructor, setters and getters.
//        Create interface Tankable with method tank()
//        Create interface Chargable with method charge()
//        Create class FuelCar, which extends Car and implements Tankable
//        Create class ElectricCar, which extends Car and implements Chargable
//        Create class HybridCar, which extends Car and implements Tankable and Chargable.
//        Create CarTester class. Create several instances of different cars.
//        Create array of cars. Put all the before created cars into that array.
//        Iterate over array.
//        Inside of loop check with instanceof operator:
//        - if car is Chargable - charge it;
//        - if car is Tankable - tank it.
