package day21accessmodifiersinheritance.day28abstraction;

public class Bird extends Animal {


    Bird bird = new Bird();

    @Override
    public void eat() {
        System.out.println("Bird eat");
    }

    @Override
    public void move() {
        System.out.println("Birds move");
    }
}
