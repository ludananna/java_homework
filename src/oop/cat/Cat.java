package oop.cat;

public class Cat {

    private String name;
    private boolean hungry;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
        this.hungry = true;
    }

    public void eat(String eat) {
        if (hungry) {
            System.out.println(name + " is eating " + eat);
            this.hungry = false;
        } else {
            System.out.println(name + " is not hungry");
        }

    }

    public void sleep(int time) {
        if (!hungry) {
            System.out.println(name + " is going to sleep for " + time + (" hours."));
            this.hungry = true;
        } else {
            System.out.println(name + " is hungry");
        }
    }

    public void play(String play) {
        System.out.println(name + " is playing around with " + play);
    }

    public void isHungry() {
        if (hungry) {
            System.out.println(name + " is hungry");
        } else {
            System.out.println(name + " is not hungry");
        }
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}








