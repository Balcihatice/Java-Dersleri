package day24statickeywordencapsulation;

public class Car_Runner {
    /*
static keyword nedir?
static keyword class'a baglanmis class elemanlaridir
static class elemanlari butun Object'lerin ortak elamanidir.
static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
static Class elemanlarina Class uzerinden ulasilir.

static block`lar ihtiyacimiz olan variable`larin class olusturma safhasinda elimizde olmasini saglar
static block`lar main methoddan ve diger tum methodlardan once calistirilir.(herseyden once calisir)
static blok`lar icinde sadece "static variable"`lara deger atanabilir.
birden fazla static blok varsa ustteki once calistirilir.
 */

    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        System.out.println(car1.counter);
        System.out.println(car1.price);

        System.out.println(car2.counter);
        System.out.println(car2.price);

        System.out.println(car3.counter);
        System.out.println(car3.price);

        System.out.println(car4.counter);
        System.out.println(car4.price);

     //static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
     // static variable'lara Class'i kullanarak ulaşmak daha iyidir.
        System.out.println(Car.counter); //Sari renk gitti

    }

}
