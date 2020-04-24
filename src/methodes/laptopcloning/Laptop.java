package methodes.laptopcloning;

public class Laptop implements Cloneable{
    private String name;
    private Processor processor;
    private HardDrive hardDrive;
    private int displaySize;
    private int weight;
    private  int ramAmount;

    public Laptop(String name,Processor processor,HardDrive hardDrive, int displaySize, int weight, int ramAmount) {
        this.name = name;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.displaySize = displaySize;
        this.weight = weight;
        this.ramAmount = ramAmount;


    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Laptop cloned = (Laptop) super.clone();
        cloned.name = this.name;
        cloned.processor = this.processor;
        cloned.hardDrive = this.hardDrive;
        cloned.displaySize = this.displaySize;
        cloned.weight = this.weight;
        cloned.ramAmount = this.ramAmount;
        return cloned;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", processor=" + processor +
                ", hardDrive=" + hardDrive +
                ", displaySize=" + displaySize +
                ", weight=" + weight +
                ", ramAmount=" + ramAmount +
                '}';
    }
}

