package oop.phone;

public class MobilePhoneTester {
    public static void main(String[] args) {
        MobilePhone samsung = new MobilePhone("Samsung", "Galaxy S9", 1000, 500); //Where 1000 - is battery capacity, and 500 is memory amount;
        samsung.installApplication("Google maps", 100);
        samsung.installApplication("Tinder", 200);
        samsung.installApplication("Pokemon GO", 250);
        samsung.use("YouTube", 5);
        samsung.use("Facebook", 6);
        samsung.use("Angry Birds", 2);
        samsung.charge();
        samsung.use("Angry Birds", 2);
    }
}