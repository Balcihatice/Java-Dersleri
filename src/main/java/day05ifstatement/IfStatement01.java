package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Example 1: Kullanıcıdan alınan sayının tek mi çift mi oldugunu ekrana yazdıran bir kod yazın
        Scanner input = new Scanner((System.in));
        System.out.println("bir sayı giriniz...");
        int s = input.nextInt();

        //1.yol
        if(s%2==0){
            System.out.println("Cift sayi...");
        }
        if(s%2!=0){  // "!=" demek eşit değil
            System.out.println("Tek sayı...");    //Burada 2 kontrol var
        }
      //  2.yol

        if(s%2==0){
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayı");   // burada 1 kontrol var o zaman 2. yolu seçmek iyidir,java yı hızlandırmış oluruz
        }
    //Example 2: Bir sayının negatif pozitif ya da nötr oldugunu söyleyen kodu yazınız

        System.out.println("Bir sayi giriniz...");
        double d = input.nextDouble();

        if(d>0){  //___>>>>>>>>>>>>>>>>>>ÖNEMLİ : if else doğru sonucu bulunca diger koşullara bakmaz.Bu java ya hız kazandırır.
            System.out.println("Pozitif");
        } else if (d==0) {
            System.out.println("Nötr");
        }else {
            System.out.println("Negatif");
        }
    }
}
