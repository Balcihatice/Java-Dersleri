package day28abstraction;
/*
Bir method parent class`ta abstract method ise child class
o methodu overrid edip kullanmak zorundadir
Bu yuzdenherhangi bir fonksiyonu child class icin mecburu
yapmak istersek o methodu abstrac yapmaliyiz.
 */
public class Cat extends Mammal {

    Cat cat = new Cat();

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }

}
