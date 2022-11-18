package questions;

import java.util.Scanner;

public class RandomCounter {
    //Can Hoca sorusu
    // Soru1: klavyeden girilen bir cümle girilecek. Bu cümlenin için kaç tane
    // 'istenilen' harfinin olduğunu söyleyen method create edin ( kelime= kalem
    // ise burda cevap 1 dir


    public static void main(String[] args) {
        Ulucx("e");
    }
    public static void Ulucx(String istHarf){

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz ");
        String[] cumle = input.nextLine().trim().toLowerCase().split("");

        String istHarf1 = istHarf.substring(0, 1);
        int count = 0;
        for (String w : cumle) {

            if (w.equals(istHarf1)) {
                count++;
            }
        }
        System.out.println("istenilen harf " + count + " adet vardir");

    }

}
