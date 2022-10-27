package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Example: Kuyllanıcıdan bir dikdörtgenin en boyunu alıp alan ve çevresini hesaplayan kodu yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen dikdörtgenin kısa kenarını giriniz...");
        int kısaKenar = input.nextInt();

        System.out.println("Lütfen dikdörtgenin uzun kenarını giriniz");
        int uzunKenar = input.nextInt();


        System.out.println("Diktörtgenin alanı : " + (kısaKenar * uzunKenar));
        System.out.println("Diktörtgeniz çevresi :" + 2*(kısaKenar + uzunKenar));

        //kullanıcı double sayı girdi

       // Hata verdi: inputmismatch: inputta karşılaşma olmadı

    }
}
