package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
   /*
    LinkedHAshSet`ler elemanlari ekleme sirsina(Insertion Order) gore yerlestirirler.
    LinkedHashSet elemanlari siralamada zaman harcadigi icin HashSet`lre gore yavas calisir.


   */
    public static void main(String[] args) {

        LinkedHashSet<String> emails = new LinkedHashSet<>();

        emails.add("abc@gmail.com");
        emails.add("bac@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("axy@gmail.com");
        emails.add("def@gmail.com");

        System.out.println(emails);//[abc@gmail.com, bac@gmail.com, asc@gmail.com, axy@gmail.com, def@gmail.com]




    }
}
