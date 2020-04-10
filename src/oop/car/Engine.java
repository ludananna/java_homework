package oop.car;

public class Engine {

    private String name;
    private int HorsePower;
    private int capacity;
    private boolean isStartedStatus;

    public Engine(String name, int HorsePower, int capacity) {
        this.name = name;
        this.HorsePower = HorsePower;
        this.capacity = capacity;
        this.isStartedStatus = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isStartedStatus() {
        return isStartedStatus;
    }

    public void setStartedStatus(boolean startedStatus) {
        isStartedStatus = startedStatus;
    }
    //    public void startEngine(boolean isStartedStatus) {
//        if (isStartedStatus = true) {
//            System.out.println("Car VW Golf is starting Diesel engine");
//        } else {
//
//            System.out.println("Car VW Golf cant be driven cause engine stopped");
//        }
//    }
//    public void stopEngine(boolean isStartedStatus){
//        if(isStartedStatus){
//            System.out.println("Car VW Golf is stopping Diesel engine");
//        }else {
//            System.out.println("Diesel engine has been stopped");
//        }
//    }
//    int hp = 0;
//
//    public void hp(int HorsePower, int speed) {


    }



//Create class Engine.
//        Engine has properties:
//        - name,
//        - horsepower,
//        - capacity,
//        - isStarted status.
//        Engine can be started or stopped.
//        Engine need 50 horsepower for each 100 km/h speed.
                //    0.5 horsepower for each 1 km/h speed.
//        Engine uses fuel 10 times more than his capacity for each 100 km. For example, if engine capacity is 2000 cm3 (2L) - it need 20L for 100km.
//                                                                                                                             2000 eed 0.2L for 1km.
                                                                                                    //                         1000     0.1