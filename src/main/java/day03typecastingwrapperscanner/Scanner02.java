package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // Example 1 : Sayıları kullanıcıdan alan ve Toplama işlemi yapan kodu yazınız
        // 1) Scanner classından object oluştur.

        Scanner input = new Scanner(System.in);

        // 2) Kullanıcıya ne yapacağını söyle

        System.out.println("İlk sayıyı giriniz...");
        double sayi1 = input.nextDouble(); // Kullanıcının verdiği sayıyı aldık

        System.out.println("İkinci yayıyı giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println("Toplam : " + (sayi1 + sayi2));
    }

}
