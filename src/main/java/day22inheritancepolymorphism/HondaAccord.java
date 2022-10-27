package day22inheritancepolymorphism;

import com.sun.management.HotSpotDiagnosticMXBean;

public class HondaAccord extends Honda {
   /*
   1) Siz Class olusturdugunuz da Java otomatik olarak gorunmez bir Constructor verir
   Cunku java Class`in bir kalip oldugunu ve object olusturmak icin yaratildigini ve object
   olusturmak icin Constructorun sart oldugunu bilir.
   2) Javanin otomatik olarak olusturdugu bu gorunmez Constructor`a default Constructor denir.
   3) Siz kendiniz herhangi bir Constructor olusturdugumuzda java default Constructri siler
   4) Bir Classta biden fazla Constructor olabilir. Fakat bu Constructorlarin parametreleri farkli olmalidir
   5) "this" keyword "Bu Class" anlamindadir." this.price" demek bu Clastaki "price" isimli variable demektir
   "this.price" syntex`i constructor`larin icinde kullanilir
   6) Constructor kullanarak variablelar uzerinde yaptigimiz degisimler sadece object uzerindeki variable larin degerlerini degistirir,
   Clasdaki variable degerlerini degistiremez


 */
//Constructor kaliptir >>> Kaliptan object olustururuz

    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord() {

    }


    public HondaAccord(int price) {

        this.price = price;   //bu calstaki price`i` benim verdigim price`a esitle
    }


    public HondaAccord(int price, int year) {

        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");
    }


    public HondaAccord(int price, int year, String make, String model) {
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }


}
