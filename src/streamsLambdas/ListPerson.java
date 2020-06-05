package streamsLambdas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Robert", "Baratheon", LocalDate.of(1951, 1, 11), GenderEnum.male, 6000, new Address("Krakow"));
        Person p2 = new Person("Jaime", "Lannister", LocalDate.of(1980, 2, 12), GenderEnum.male, 10000, new Address("Casterly Rock"));
        Person p3 = new Person("Catelyn", "Stark", LocalDate.of(1955, 3, 13), GenderEnum.female, 8000, new Address("Winterfell"));
        Person p4 = new Person("Cerseia", "Lannister", LocalDate.of(1980, 2, 12), GenderEnum.female, 4000, new Address("Casterly Rock"));
        Person p5 = new Person("Daenerys", "Targaryen", LocalDate.of(1990, 4, 14), GenderEnum.female, 5500, new Address("Krakow"));
        Person p6 = new Person("Jorah", "Mormont", LocalDate.of(1940, 5, 15), GenderEnum.male, 7000, new Address("Krakow"));
        Person p7 = new Person("Viserys", "Targaryen", LocalDate.of(1979, 6, 16), GenderEnum.male, 1000, new Address("Krakow"));
        Person p8 = new Person("Jorah", "Mormont", LocalDate.of(1965, 7, 17), GenderEnum.male, 7000, new Address("Krakow"));
        Person p9 = new Person("Sansa", "Stark", LocalDate.of(2005, 8, 18), GenderEnum.female, 3000, new Address("Krakow"));
        Person p10 = new Person("Arya", "Stark", LocalDate.of(2007, 9, 19), GenderEnum.female, 2000, new Address("Krakow"));

        List<Person> persons = List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        // System.out.println(persons.size() + ") persons = " + persons);


        List<Person> personsYoungerThan65FromStream = persons.stream()
                .filter(person -> (LocalDate.now().getYear() - person.getBirthDay().getYear() < 65))
                .sorted(Comparator.comparing(Person::getFirstName)
                        .reversed())
                .collect(Collectors.toList());

        System.out.println(personsYoungerThan65FromStream.size() + ") personsYoungerThan65FromStream = " + personsYoungerThan65FromStream);

        List<Person> womanWithSalaryLess5000 = persons.stream()
                .filter(person -> person.getGender().equals(GenderEnum.female))
                .filter(person -> person.getSalary() < 5000)
                .sorted(Comparator.comparing(Person::getBirthDay))
                .collect(Collectors.toList());
        System.out.println(womanWithSalaryLess5000.size() + ") womanWithSalaryLess5000 = " + womanWithSalaryLess5000);


        List<Person> personsYoungerThan18FromKrakow = persons.stream()
                .filter(person -> (LocalDate.now().getYear() - person.getBirthDay().getYear() < 18))
                .filter(person -> person.getAddress().getCity().equals("Krakow"))
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());
        System.out.println(personsYoungerThan18FromKrakow.size() + ")personsYoungerThan18FromKrakow = " + personsYoungerThan18FromKrakow);


        List<Person> personsNotFromKrakow = persons.stream()
                .filter(person -> !(person.getAddress().getCity().equals("Krakow")))
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
        System.out.println(personsNotFromKrakow.size() + ")personsNotFromKrakow = " + personsNotFromKrakow);

        double averageSalary = persons.stream()
                .mapToDouble(Person::getSalary)
                .average()
                .getAsDouble();
        System.out.println("averageSalary = " + averageSalary);

        long womenFromKrakow = persons.stream()
                .filter(person -> (person.getAddress().getCity().equals("Krakow")))
                .filter(person -> person.getGender().equals(GenderEnum.female))
                .count();
        System.out.println("womenFromKrakow = " + womenFromKrakow);


        long menOlder65 = persons.stream()
                .filter(person -> person.getGender().equals(GenderEnum.male))
                .filter(person -> (LocalDate.now().getYear() - person.getBirthDay().getYear() > 65))
                .count();
        System.out.println("menOlder65 = " + menOlder65);


        Person oldestPerson = persons.stream()
                .min(Comparator.comparing(Person::getBirthDay))
                .get();
        System.out.println("oldestPerson = " + oldestPerson);


        Person youngerPersonFromKrakow = persons.stream()
                .filter(person -> (person.getAddress().getCity().equals("Krakow")))
               .max(Comparator.comparing(Person::getBirthDay))
                .get();
        System.out.println("youngerPersonFromKrakow = " + youngerPersonFromKrakow);


        double totalSalary = persons.stream()
                .mapToDouble(Person::getSalary)
                .sum();
        System.out.println("totalSalary = " + totalSalary);


        boolean firstLetterA = womanWithSalaryLess5000.stream()
                .anyMatch(person -> person.getFirstName().startsWith("A"));
        System.out.println("firstLetterA = " + firstLetterA);

        boolean containsLetterA = womanWithSalaryLess5000.stream()
                .allMatch(person -> person.getLastName().contains("a"));
        System.out.println("containsLetterA = " + containsLetterA);

    }
}



