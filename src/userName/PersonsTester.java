package userName;

import java.time.LocalDate;

public class PersonsTester {
    public static void main(String[] args) {

        Person p1 = new Person("Anna", "Kogut", LocalDate.of(2000, 3, 21));
        Person p2 = new Person("Hanna", "Wukanowich", LocalDate.of(1952, 6, 11));
        Person p3 = new Person("Zena", "Queen", null);


        System.out.println("p1.getUserName() = " + p1.getUserName());
        System.out.println("p2.getUserName() = " + p2.getUserName());
        System.out.println("p3.getUserName() = " + p3.getUserName());
    }
}