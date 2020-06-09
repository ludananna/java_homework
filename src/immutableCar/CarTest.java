package immutableCar;


import java.util.Arrays;

import java.util.List;

public class CarTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Engine engine = new Engine("Diesel", 250, 60);

        List<Wheel> wheels = Arrays.asList(
                new Wheel(32, 15),
                new Wheel(32, 16),
                new Wheel(32, 17),
                new Wheel(32, 18)
        );

        Car car = new Car("BMW", "325", engine, wheels);

        Engine engine1 = car.getEngine();
        System.out.println("engine1 = " + engine1);
        engine1.setHorsePower(500);
        System.out.println("engine1 = " + engine1);
        System.out.println("engine = " + engine);


        List<Wheel> wheels1 = car.getWheels();
        wheels1.add(new Wheel(25, 16));
        System.out.println("wheels = " + wheels);
        System.out.println("wheels1 = " + wheels1);
    }
}
