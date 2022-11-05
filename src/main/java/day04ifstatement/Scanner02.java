package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Example : Kullanıcıdan ilk ve soy ismini alınız ,ilk ve soy isminin ilk harflerini ekrana yazdırınız
        // Ali Can ==>>> AC

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminiiz giriniz...");
        char ilk = input.next().charAt(0);// A //input.next() Ali yi verdi,charAt başındaki "A" yı aldı

        System.out.println("Soy isminizi giriniz...");
        char son = input.next().charAt(0);// C

        System.out.println(ilk + son);// char variablelarında Matematiksel işlem yazdıgımız için 132 yazar ASKI degerlerini alıp topladı
        // bunu engellememk için en başa "" koymalıyız

        System.out.println("" + ilk + son); // şeklinde yazmalıyız ki String bir deger alalım

        // java da "+" işaretin 2 anlamamı vardır
        // 1-önce toplama ilşmei yapmaya çalışır
        // 2-  sonra birleştirme(concatenation) yapmaya çalışır,yağamassa hata verir


        //  2.Yol
        System.out.println("Tam isim giriniz...");

        String tamIsim = input.nextLine(); // Ali Can ,ilk index A

        char ilkHarf = tamIsim.charAt(0);

        System.out.print(ilkHarf);

        char soysimIlkHarfi = tamIsim.split(" ")[1].charAt(0);

        // tam ismi boşluktan böldü 1 index olan canı aldı,canın sıfırncı indexi olan C yi ldı

        System.out.println(soysimIlkHarfi);

    }

}
