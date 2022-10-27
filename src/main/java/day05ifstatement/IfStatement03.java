package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    /*
    iki tane stringin eşit olup olmadıgını anlamak için "==" değil " ,"equals()" kullanınız
    İki tane string in birbirine eşit olup olmadıgını kontrol etmek için iki tane metod kullanılabilir
          1.)equals()  : Büyük harf ve küçük harfi önemser
          2.) equalsIgnoreCase() : Büyük küçük harfi önemsemez "A" ,"a", aynıdır
         >>>>> ignore:önemsememek
     */


    public static void main(String[] args) {
        //Example 1: Kullanıcıdan gün isimlerini alınız.o gunün hafta sonu mu
        // hafta içi mi oldugunu kullanıcıya söyleyiniz

        // 1. yol:standartlara uygun değil: çok uzun

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz...");
        String gun = input.next();

        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Sali")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Carsamba")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Persembe")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }

        // 2. yol : Kodo kısa yazmak tercih edilir,>> buna atomik derler.standartlara uygun değil
       // parantez içi sade olmalıdır.
        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu...");
        } else if(gun.equalsIgnoreCase("Pazartesi") ||  // kod yazarken bir satıra en fazla 80 karakter yazılır//
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli gun giriniz...");
        }

        // 3.yol: or ||(veya) işlemi bize tru ya da false return eder.standartlara uygun.kısa ve anlaşılır
       boolean haftaSonu =  gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");
        boolean haftaIci = gun.equalsIgnoreCase("Pazartesi") ||  // kod yazarken bir satıra en fazla 80 karakter yazılır//
                           gun.equalsIgnoreCase("Sali") ||
                           gun.equalsIgnoreCase("Carsamba") ||
                           gun.equalsIgnoreCase("Persembe") ||
                           gun.equalsIgnoreCase("Cuma");
        if (haftaSonu) {
            System.out.println("Hafta sonu...");
        } else if(haftaIci) {
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli gun giriniz...");
        }

    }
}





