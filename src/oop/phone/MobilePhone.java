package oop.phone;

public class MobilePhone {

    private String brand;
    private String model;
    private int batteryCapacity;
    private int batteryAmount;
    private int memory;
    private int freeMemory;

    public MobilePhone() {
    }

    public MobilePhone(String brand, int batteryCapacity, int memory) {
        this.brand = brand;
        this.batteryCapacity = batteryCapacity;
        this.batteryAmount = batteryCapacity;
        this.memory = memory;
        this.freeMemory = memory;
    }

    public MobilePhone(String brand, String model, int batteryCapacity, int batteryAmount, int memory, int freeMemory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.batteryAmount = batteryAmount;
        this.memory = memory;
        this.freeMemory = freeMemory;
    }

    public void installApplication(String appName, int appSize) {
        if (appSize > freeMemory) {
            System.out.println("Application " + appName + " can't be installed on " + brand + ". There are no enough memory");
        } else {
            freeMemory = freeMemory - appSize;
            System.out.println("Application " + appName + " has been installed on " + brand + ". Remain memory: " + freeMemory + " MB");
        }
    }

    public void use(String appName, int hours) {
        int usedBattery = hours * 100;
        if (batteryAmount == 0) {
            System.out.println("Application " + appName + " can't be run on " + brand + ". Phone discharged.");
        } else if (batteryAmount >= usedBattery) {
            batteryAmount = batteryAmount - usedBattery;
            System.out.println("Application " + appName + " has been ran for " + hours + " hours on " + brand + ". Remain battery capacity: " + batteryAmount + " mAh");
        } else {
            System.out.println("Application " + appName + " has been ran for " + (batteryAmount / 100) + " hours on " + brand + ". Phone has been discharged.");
            batteryAmount = 0;
        }
    }

    public void charge() {
        batteryAmount = batteryCapacity;
        System.out.println(brand + " has been charged. Remain battery capacity: " + batteryCapacity + " mAh");
    }
}
