package day12loops;

import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args) {
        /* Sekli olustur.
         ?????
         ?????
         ?????
         ?????   */


        Scanner scan = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = scan.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = scan.nextInt();

        System.out.println("Karakter secini");
        char ch = scan.next().charAt(0);

        for (int i = 1; i < satir + 1; i++) {

            for (int j = 1; j < sutun + 1; j++) {

                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
