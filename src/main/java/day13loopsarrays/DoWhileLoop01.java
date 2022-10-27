package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
//Exmple 1: Kullanicidan bir sayi aliniz sayi 100 den kucukse ekrana yazdiriniz

//            Aksi halde ekrana kaybettin yazdiriniz.
        //            Kullanici kazandikca oyun devam etmeli.

        Scanner input = new Scanner(System.in);
//        int sayi =0;
//
//        do{
//            System.out.println("Bir sayi giriniz...");
//            sayi = input.nextInt();
//
//            if(sayi<100){
//                System.out.println("Kazandiniz...");
//            }
//        }while (sayi<100);
//
//        System.out.println("Kaybettiniz...");



    // Exaample 2: kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz

       do{
        System.out.println("Isim giriniz");
        char ilkHarf = input.next().charAt(0);
        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
            System.out.println("Isim basariyla girdiniz");
        } else {
            System.out.println("Isim yanlis girdiniz,Isleminiz iptal edilmistir.");
            break;
        }
       }while (true) ;//yukarida break demeseydik sonsuz dongu olurdu. Break le kirdik.

 //Infinite Loop : Sonsuz dongu: i-- da hata yaparsak sonsuz donguye gireriz.
   //     for (int i = 1; i < 4; i++) {
   //         System.out.println("Hi");
   //     }

   //     for (int i = 1; i < 4 ;      ) {     //artirma ya da azaltma yazmazsak sonsuz dongu olusur
   //         System.out.println("Hi");
   //     }

      int i =12;
      while (i<19){
          System.out.println("Hi");//increment dincrement kismi yoksa yine sonsuz dongu olusur
      }









}
}