package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*
        kullanıcıdan ilk orta ve soy ismini alınız ve aşagıdaki formatta yazdırınız
        Ali Mert Can
        123456789
      */
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz");
        String ilkIsim = input.next(); // nex() metodu kullanıcıdan string datası almak için kullanılır

        System.out.println("Orta isminizi giriniz...");
        String ortaIsım = input.next();

        System.out.println("Soy isminizi giriniz...");
        String soyIsim = input.next();

        System.out.println("Kimlik numarası giriniz...");
        String kimlikNo = input.next();
        System.out.println(ilkIsim +" " +ortaIsım + " " + soyIsim);
        System.out.println(kimlikNo);


      // 2.yol
      System.out.println("ilk orta soy isminizi ve kimlik no giriniz"); // tek seferde tüm bilgileri istedik
        String ilk =input.next();
        String orta =input.next();
        String soy =input.next();
        String kimlik =input.next();//next() kullanıcının girdigi ilk kelimeyi alır

        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

       //Not: next () ile nextLine () farkı nedir

      //  3. yol
        System.out.println("Ilk ırta ve soyisminizi giriniz");
        String tamIsim = input.nextLine(); //nextLine() tüm satırı alır
        System.out.println(tamIsim);

        System.out.println("Kimlik numarsı giriniz...");
        String kimlikNumarası = input.next();
        System.out.println(kimlikNumarası);



    }
}
