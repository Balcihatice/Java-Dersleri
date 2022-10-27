package day09stringmanipulation;

import java.util.Scanner;

public class C02_StringManiOrnekSoru {
    public static void main(String[] args) {
         /*      ullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

                Input :

        John White

        1234234534561478

        Output : Name :

        J*** W****

        CCN  : **** **** **** 1478

                * Ilk Harfler Buyuk harf ile baslamalidir.*/




        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String name = input.nextLine();
        System.out.println("Lutfen ssoyadinizi giriniz");
        String sureName = input.nextLine();
        System.out.println("Lutfen Kredi karti no giriniz");
        String krediKartiNo = input.nextLine();


        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        sureName = sureName.substring(0, 1).toUpperCase() + sureName.substring(1).toLowerCase();
        System.out.println(name + "\t" + sureName);
        String newK = krediKartiNo.substring(0, 8).replaceAll("[0-9]", "*") + krediKartiNo.substring(8);

        System.out.println(name + "\t" + sureName);
        System.out.println(newK);

    }
}
