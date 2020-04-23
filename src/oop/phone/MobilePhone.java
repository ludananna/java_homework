package oop.phone;

import java.util.Objects;

public class MobilePhone {

    private String brand;
    private String model;
    private int batteryCapacity;
    private int batteryAmount;
    private int memory;
    private int freeMemory;

    public MobilePhone(String brand, String model, int batteryCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.batteryAmount = batteryCapacity;
        this.memory = memory;
        this.freeMemory = memory;
    }

    public void installApplication(String appName, int appSize) {
        if (appSize > freeMemory) {
            System.out.println("Application " + appName + " can't be installed on " + brand + " " + model + ". There are no enough memory");
        } else {
            freeMemory = freeMemory - appSize;
            System.out.println("Application " + appName + " has been installed on " + brand + " " + model + ". Remain memory: " + freeMemory + " MB");
        }
    }

    public void use(String appName, int hours) {
        int usedBattery = hours * 100;
        if (batteryAmount == 0) {
            System.out.println("Application " + appName + " can't be run on " + brand + " " + model + ". Phone discharged.");
        } else if (batteryAmount >= usedBattery) {
            batteryAmount = batteryAmount - usedBattery;
            System.out.println("Application " + appName + " has been ran for " + hours + " hours on " + brand + " " + model + ". Remain battery capacity: " + batteryAmount + " mAh");
        } else {
            System.out.println("Application " + appName + " has been ran for " + (batteryAmount / 100) + " hours on " + brand + " " + model + ". Phone has been discharged.");
            batteryAmount = 0;
        }
    }

    public void charge() {
        batteryAmount = batteryCapacity;
        System.out.println(brand + " has been charged. Remain battery capacity: " + batteryCapacity + " mAh");
    }
}
