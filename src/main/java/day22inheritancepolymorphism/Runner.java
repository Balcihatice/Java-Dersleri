package day22inheritancepolymorphism;


public class Runner {
    public static void main(String[] args) {

        //Inheritance'da variable'lar secilirken Java object'in data type'ina bakar.
//Oncelikle istediginiz variable'i Object'in data type'i olan Class'da arar.
//O Class'da bulamamzsa Parent Class'lara bakar.
//Hicbir Parent Class'da bulamazsa hata verir


        Cat cat1 = new Cat();
        System.out.println(cat1.a); //14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);//45

        Mammal cat2 = new Cat();//13
        System.out.println(cat2.a);


        Animal cat3 = new Cat();//12
        System.out.println(cat3.a);

        //Object olusturken objectin data type child Classlardan secilemez
        // Inheritance de Method secilirken Java Constructor`a bakar
        //Oncelikle istediginiz metodu contructuri kullanilan Class`tan alir
        //O Classta bulamzsa Parent Class`lara bakar.Hic bir Parent Classta bulamazsa hata verir

        Cat cat4 = new Cat();
        cat4.eat();//Cat eat olacak
        cat4.drink();//Mammal drink


        Mammal cat5 = new Mammal();
        cat5.eat();//



        Animal cat6 = new Animal();
        cat6.eat();









    }
}
