package day28abstraction;

public interface Engine {
    /* interface`lerdeki tum methodlar abstract olgugu icin  "interface"`lere "fully abstaction" denir
    "Abstract Classlar"da" abstact method ve "concrete method" bir arada kullanildigi icin "Abstract class" lara
    "fully abstacrt" denmez

    Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
    bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.

            "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
    bu yapida "multiple inheritance" a musaade etti.

*/

    // interface`lerdeki tum method`lar abstract olmak zorundadir.
    // interface`lerde abstract method olustururken abstract keyword kullanmaya gerek yoktur,
    //Cunku java o methodun abstract oldugunu bilir.
    //interfacelerdeki methodlar otomatic olarak public`tir. Bu yuzden o methodlar icin public yazmaya gerek yoktur.

    void eco();

    void gas();

    void tsi();


    //"default" keyword kullanarak interface`lerin icinde body`si olan methodlar uretebiliriz
    //Asagidaki non-static method`dur. 
    public default int add(int a, int b) {
        return a + b;
    }

    //"static" keyword kullanarak interface`lerin icinde body`si olan methodlar uretebiliriz
    //Asagidaki method static`tir
    public static String update(String str){

        return str+"!";
    }
/*
    ABSTRACT vs INTERFACE
   1) Abstract :
            1.1 - Class`dir.
            1.2 - Abstract ve concrete method`lar konabilir.
            1.3 - Kismi olarak abstraction saglar.
            1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
            1.5 - Hiz acisindan avantajlidir
            1.6 - Icindeki tum nesnelerin public olmasi zorunlu degildir.
            1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
            1.8 - Abstract class constructor`a sahiptir

   2) Interface :
            2.1 - Class degildir.
            2.2 - Sadece abstract method`lar konabilir.
            2.3 - Tam abstraction (soyutluk) saglar
            2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
            2.5 - Hiz acisindan abstract class`a gore yavastir.
            2.6 - Icindeki tum nesnelerin public olmasi gerekir.
            2.7 - Method'lar static olamaz
            2.8 - Abstract class constructor`a sahiptir    */
}
