package day30collections;

import java.util.HashSet;

public class HashSet01 {



        // Set tekrarli olmayan toplu datalari depolamak icin kullanilir
        //Hash bir tekniktir birbirine benzemeyen kodlar uretir,Bu kodlar datayi unique yapar
        // ogrenci numaralari gibi

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");

        System.out.println(emails);//[Apple, Fig, Mango, Apricot, Orange]

        //Var olan elemani eklersek hata vermez. son ekleneni var olan datanin uzerine yazar.(Override)
        emails.add("Mango");
        System.out.println(emails);

        //Setler coklu ama tekrarsiz datalari depolar.Peki ayni datayi eklemeye calisirsak ne olur?
        //Ovverride yapar deriz

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]

     /*  HashSetler:
        1)tekrarsiz elemanlarda
        2)sırlama onemli degilse
        3)hız cok önemliyse
        4)İndeks kullanmazlar   */


    }
}
