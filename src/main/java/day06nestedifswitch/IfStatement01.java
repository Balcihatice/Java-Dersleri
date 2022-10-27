package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {
        /*
        Type a code, get age from user and decide which stage on it
        kullanıcıdan yaş degerini alan kodu yazınız
        ve yaşın hangi evrede oldugunu aşagıdaki tabloya göre ekrana yazdırınız

        0 - 4 => baby-bebek
        5 - 12 => child-cocuk
        13 - 20 => teenager-genc
        21 - 30 => adult-yetişkin
        else (not expected age)-tanımlanmamış evre
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaş giriniz...");
        int yas = input.nextInt();

      if (yas<0){
          System.out.println("Yas icin negatif degerler verilemez...");
        } else if(yas<5){
            System.out.println("Bebek");
        } else if (yas < 13) {
            System.out.println("Cocuk");
        } else if (yas < 22) {
            System.out.println("Yetiskin");
        }else if(yas<31){
          System.out.println("Yteiskin...");
        }else{
          System.out.println("Tanımlanmamıs Evre...");
      }
    }// Baundary value analyze test : sınır degerleri test etmek BVA
}// kod yazma ya butükten kucuge ya da buyukten kücüge dogru yazılır
//ortadan yazılmaz
