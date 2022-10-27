package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {

        //Example 1) 3 ten 10 kadar tam sayilari ayni satirda ekrana yazdiran kodu yaziniz
//1.yol
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");

        }

//2.yol
        System.out.println();
        int i = 3;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

//Example 2) 17 den 4 e kadar tu cift sayilari ekrana yazdira  kodu ayni satirda yaziniz

        System.out.println();//bos


        int j = 17;
        while (j > 3) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j--;
        }
        System.out.println();
        //Example 3) 12 den 67 ye kadar sayilarin tiolamini veren kodu yaziniz

        int sayi = 12;
        int toplam = 0;
        while (sayi < 68) {
            toplam = toplam + sayi;

            sayi++;
        }

        System.out.print(toplam);

        System.out.println();

//Example 4) verilen bir tam sayni rakamlarini toplamii ekrana yazdiran kodu yaziniz

        int sayi2 = 234;
        int sonuc = 0;
        while (sayi2 > 0) {
            sonuc = sonuc + sayi2 % 10;
            sayi2 = sayi2 / 10;
        }
        System.out.println(sonuc);

//Example 5) kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int s = input.nextInt();
        int n = 1;

        while (n < 11) {
            System.out.println(s + "x" + n + "=" + s * n);
            n++;
//yeni ornek;
        }
        System.out.println("Lutfen bir sayi giriniz");
        int s2 = input.nextInt();
        int s3 = 1;
        while (s3 < 11) {
            System.out.println(s2 + "X" + s3 + "=" + s2 * s3);
            s3++;
        }

    }
}
