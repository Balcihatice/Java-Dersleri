package day21accessmodifiersinheritance.day28abstraction;

public class Dog extends Mammal {
Dog dog = new Dog();

    @Override
    public void eat() {
        System.out.println("Dogs eat");
    }

    @Override
    public void move() {
        System.out.println("Dogs move");
    }
}
