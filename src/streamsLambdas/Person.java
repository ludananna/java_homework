package streamsLambdas;

import java.time.LocalDate;

public class Person
{
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private GenderEnum sex;
    private int salary;
    private Address address;

    public Person(String firstName, String lastName, LocalDate birthDay, GenderEnum sex, int salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.sex = sex;
        this.salary = salary;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public GenderEnum getGender() {
        return sex;
    }

    public int getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getSalary() != person.getSalary()) return false;
        if (getFirstName() != null ? !getFirstName().equals(person.getFirstName()) : person.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(person.getLastName()) : person.getLastName() != null)
            return false;
        if (getBirthDay() != null ? !getBirthDay().equals(person.getBirthDay()) : person.getBirthDay() != null)
            return false;
        if (getGender() != null ? !getGender().equals(person.getGender()) : person.getGender() != null) return false;
        return getAddress() != null ? getAddress().equals(person.getAddress()) : person.getAddress() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getBirthDay() != null ? getBirthDay().hashCode() : 0);
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        result = 31 * result + getSalary();
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", gender='" + sex + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

}
