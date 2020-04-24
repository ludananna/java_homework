package methodes.laptopcloning;

public class HardDrive {
    private String name;
    private String type;
    private int capacity;

    public HardDrive(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
// Create class HardDrive with properties: name, type, capacity.