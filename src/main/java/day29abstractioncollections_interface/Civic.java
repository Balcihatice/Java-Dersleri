package day29abstractioncollections_interface;
/*
Abstract methodlar sadece ne yapilacagini soyler(what to do)
"Concrete" methodlar ne yapilacagi ile birlikte nasil yapilacagina da soyler(how to do)

"Esasinda interface ler bir yapilacak isler listesidir.(To do List)

interfacelerin icinde default ve static olarak conceret method olusturulabilir

"Multiple parent interface kullandigimizda;ayni
method ismi ile birden fazla method olusturursak bu methodlarin return typelari ayni olmalidir olamaz
Aksi takdirde hata verir.

Interface`lerde constructor yoktur.yani object olusturamayiz
Abstract calsslarda class olduklari icin constructor vardir.ama
constructorlar abstract classlarda object olusturamazlar.


Child        Parent
class --->>> interface ===>>> implement
Class --->>> Class ===>> extend
Interface --->>> Interface ===>>>> extend
Interface --->>> Class ===>>> Mumkun degil

SORU : Abstract Class ile Interface`in farklari nelerdir
( once methodlar sonra variavleler sonrada parent child hakkinda konusun)
 1)Method:
    Abstract Class hem abstract hemde concrete methodlar icerebilir
    Interface`ler ise sadece abstract method`lar icerir,Ama Interface`ler icinde de
    "default" ve "static" keyword ler kullanarak concerete methodlar olusturabiliriz.
 2) Variable:
   Abstrarct Class`larda normal Classl`arda odugu gibi her turlu variable olusturulabilir.
   Interface`lerde ise variable`ler public static ve final olmak zorundadir
 3) Inheritance:
   'Abstract' Class`lar class olduklari icin Multiple inheritance`a musaade etmezler.
   "Inheritabnce"ler ise "multiple inheritance" desteklerler.
 4) "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar
    "Interface"lerde ise constructor olmadigindan object olusturulamazlar.


 SORU: Object Oriented Programing Language prensibleri nelerdir:

  1)Inheritance  2)Polymorphism  3)Encapsulation  4)Abstraction


 */


public class Civic implements Ac, Engine{

    @Override
    public void run() {
        System.out.println("Civic run well");
    }




}
