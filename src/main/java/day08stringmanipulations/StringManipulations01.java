package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        /*
        Kullanicidan aldiginiz isim ilk ve son harfini ekrana yazdiriniz
        Ramazan ===>>
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String isim = input.next();

//1.yol Eger ilk harf char data type lazımsa charat() kullanalım.eger ilk harf String data typr lazımsa substring() kullanalım.
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length() - 1);// yazdıgınız kod sadece bazı durumlar ıçın calısırsa o koda "hard codıng "(kod degildir) denır
        System.out.println("" + ilkHarf + sonHarf);// en başa boşulk koyarsak aski degerlei almayı bıtakır.
        // yazdıgınız kod her durum için çalısırsa "dynamic coding" denir
//2.YOL
        String ilk = isim.substring(0, 1); //R     substring(1.5):amaz return eder.ilk index dahil,2.index hariç oluyor.
        String son = isim.substring(isim.length() - 1);// n
        System.out.println(ilk + son);
        //                 R      n
// substring(): String içindeki bir parçayı alır.Sub: ingilizcede alt demektir.Subway: altgeçit gibi.
//bu alma işlemini index leri kullanarak alır.(1,5) 1 den beşe kadar 5 i almaz(başlangıc indexi,bitiş indexi)
//ÖNEMLİ :::   String son = isim.substring(isim.length()-1,isim.length());//soluk olan yer son karakter sonrasında bir şey yok.o yüzden yazmaya gerek yok

//Example:2 Verilen stringdeki tüm hayvan isimlerini ekrana yazdırınız
        // "Ben kedi eşim tavuk oglum inek sever"

        String str = "Ben, kedi eşim tavuk, oglum sever inek";
        String kedi = str.substring(4, 8);
        String tavuk = str.substring(15, 20);
        String inek = str.substring(34);// 34 ten baslar cümle sonuna kadar alır.
        System.out.println(kedi + tavuk + inek);
//  ==>> substring(başlangıç indexi,bitiş indexi)cümlenin ortasından bir parça alır.
//  ==>> substring(başlangıç indexi)verilen index ten sonuna kadar çalışır.

//Example 3:İlk ısım ve soy ismi içeren isimlerden ilk ve soy ismin baş harflerini ekrana yazdırınız
// Ali Can==>>AC       Tahsin Yurdakul==>>> TY

        System.out.println("Lutfen ilk ve soy isminizi giriniz...");
        String tamIsim = input.nextLine();// tam isimde Ali Can var

        String a = tamIsim.substring(0, 1); // A
// C yi almak için indexini bilmemiz gerekir.Boşluktan kesersek bizim iki parçamız olur.ikinci kısmın indexi:1 olur
        String b = tamIsim.split(" ")[1].substring(0, 1);// Boşluktan stringi kes. Kesince java bu parçaları indexler. 1.indexi al(Can).
        //          boşluktan kes, sonraki indexi 1 olanı al, kelimeyi  0 dan bire kadar al
        //Bu 1. indexin substringin ilk indexi C dir

        System.out.println(a+b);//AC

    }
}
