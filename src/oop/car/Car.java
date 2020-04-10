package oop.car;

public class Car {

    private String name;
    private Engine engine;
    private int fuelTankCapacity;
    private int RemainingFuelAmount;

    public Car(String name, Engine engine, int fuelTankCapacity) {
        this.name = name;
        this.engine = engine;
        this.fuelTankCapacity = fuelTankCapacity;
        this.RemainingFuelAmount = fuelTankCapacity;
    }

    public void drive(int speed, int km) {
        int maxSpeed = engine.getHorsePower() * 2;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }


        if (engine.isStartedStatus()) {
            RemainingFuelAmount = RemainingFuelAmount - engine.getCapacity() * km / 10000;
            if (RemainingFuelAmount <= 0) {
                RemainingFuelAmount = 0;
                System.out.println("Car  " + name + "  has been driven for " + km + " km with speed " + speed + " km/h. Tank is empty");
            }
            System.out.println("Car " + name + " has been driven for " + km + " km with speed " + speed + "km/h. Remaining fuel: " + RemainingFuelAmount);
        } else {
            System.out.println("Car " + name + " cant be driven cause engine stopped");
        }
//        int i = (int) (RemainingFuelAmount * 5);
//        System.out.println(i);
//        if (i < km) {
//            km = i;
//        }


    }

    public void startEngine() {
        if (engine.isStartedStatus()) {
            System.out.println("Diesel engine has been started already in VW Golf");
        } else {
            engine.setStartedStatus(true);
            System.out.println("Car VW Golf is starting Diesel engine");
            System.out.println("Diesel engine has been started");
        }
    }

    public void stopEngine() {

        System.out.println("Car VW Golf is stopping Diesel engine");
        System.out.println("Diesel engine has been stopped");
        engine.setStartedStatus(false);
    }

    public void tank() {
        fuelTankCapacity=RemainingFuelAmount;
        System.out.println("Car " + name + " has been tanked up");
    }
}


//Create class Car.
////        Car has properties:
////        - name,
////        - Engine (look behind for Engine class),
////        - fuel tank capacity,
////        - remaining fuel amount.
////        Car can be tank(), which tanks up for full capacity.
////        Car can be drive(with speed, for N kilometers). Speed limited by Engine possibilities.
////        Car can startEngine().
////        Car can stopEngine();
////        For drive a car we should start engine first.
////        We can't start engine if it already started.
////        We can't stop engine if it already stop.