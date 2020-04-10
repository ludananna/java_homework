package oop.cat;

public class CatTest {

    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        tom.eat("milk");
        tom.eat("mouse");
        tom.sleep(5);
        tom.isHungry();
        tom.eat("mouse");
        tom.isHungry();
        tom.play("ball");


        tom.eat("milk");
      //  Tom is eating milk
        tom.isHungry();
        tom.eat("mouse");
       // Tom is not hungry
        tom.sleep(5);
//        Tom is going to sleep for 5 hours
        tom.isHungry();
//        Tom is hungry
        tom.eat("mouse");
//        Tom is eating mouse
        tom.isHungry();
//        Tom is not hungry
        tom.play("ball");
//        Tom is playing around with ball
    }
}
