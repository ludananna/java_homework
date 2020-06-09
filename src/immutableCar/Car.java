package immutableCar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Car {
    private final String manufacturer;
    private final String model;
    private final Engine engine;
    private final List<Wheel> wheels;

    public Car(String manufacturer, String model, Engine engine, List<Wheel> wheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.wheels = Collections.unmodifiableList(wheels);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() throws CloneNotSupportedException {
        return (Engine) engine.clone();
    }

    public List<Wheel> getWheels() {
        return new ArrayList<>(wheels);
    }


    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }


}