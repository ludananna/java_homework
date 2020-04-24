package methodes.laptopcloning;

public class Processor {
    private String name;
    private int frequency;
    private int numbersCores;

    public Processor(String name, int frequency, int numbersCores) {
        this.name = name;
        this.frequency = frequency;
        this.numbersCores = numbersCores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", numbersCores=" + numbersCores +
                '}';
    }
}
//Create class Processor with properties: name, frequency, number of cores.
