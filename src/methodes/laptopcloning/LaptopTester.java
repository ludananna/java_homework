package methodes.laptopcloning;

public class LaptopTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        HardDrive hardDrive = new HardDrive("Barackuda","SSD",1);
        Processor processor = new Processor("Intell",2,4);


        Laptop laptop = new Laptop("HP",processor, hardDrive, 32,2,32);

        Laptop clonedLaptop = (Laptop) laptop.clone();
        System.out.println(clonedLaptop);

    }
}
