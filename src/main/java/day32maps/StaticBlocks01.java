package day32maps;

public class StaticBlocks01 {

    public static double pi;

    //static block`lar ihtiyacimiz olan variable`larin class olusturma safhasinda elimizde olmasini saglar
    // static block`lar main methoddan ve diger tum methodlardan once calistirilir.(herseyden once calisir)
    //static blok`lar icinde sadece "static variable"`lara deger atanabilir.
    //birden fazla static blok varsa ustteki once calistirilir.

    static {
        System.out.println("static blok 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

    }
    static {
        pi = 3.14;
        System.out.println("static block 1");
    }


}
