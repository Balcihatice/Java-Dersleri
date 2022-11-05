package day02methodcreation;

public class Car {

     // pasif özellikler koyalım

    public String marka = "Honda";
    public int fiyat = 20000;


    public static void main(String[] args) {    // main metod variable ile metodların arasında olur

        /* Object nasıl oluşturulur

        1) class ismini yazınız
        2) object e bir isim veririnz : myHonda
        3) = işareti
        4) new keywordunu kullan >>>> şu objeyi yoktan var et diyoruz
        5) class ismi parantezle beraber yaz >>>> Car(): cooker olmadan beyefendi kek yiyemez
        bunu  ismi Constructor
        object oluşturmak için kalıp lazım java ya obje için kalıp: class ismini söyluyorum
        */

        Car myHonda = new Car(); // Car():constructor(mütehait) olmadan obje olmaz


        // myHonda. // nokta koyunca clastaki herşey objede görünür

        System.out.println(myHonda.fiyat); // object i kullanarak fiyatı ögrendik
        System.out.println(myHonda.marka);

        myHonda.hareketEt();// buna print  gerekmez .zaten içinde var
        myHonda.dur();

        //  Hadi diğer metodcreation object ini kullanalım
        MethodCreation obj = new MethodCreation();

        System.out.println(obj.toplamaYap(3, 5)); // 8.0
        System.out.println(obj.carpmaYap(2, 4,6));


    }

    // aktif özellik yapalım: metod demek

    public void hareketEt(){ // void: sadece ekrana yazdırdıracaksan void yap
        System.out.println("Honda Güzel Hareket Eder...");

    }

    public void dur(){

        System.out.println("Honda guvenli durur...");
    }


}
