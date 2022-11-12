package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    /* TreeSet :
     * 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
     * 2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge)gore dizer.
     * 3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmali...
     * 4) TreeSet "null" object'ini eleman olarak kullanilamaz.

NOT: Note: Tekrarsız elemanları natural order'da depolamak için TreeSet kullanmak mantıklıdır ama TreeSet'ler çoook yavaş çalıştığı için biz,
              elemanları önce HashSet'e depolarız sonra HashSet'i TreeSet'e çevirerek TreeSet'in yavaş olma problemini aşmış oluruz.


     * */

    public static void main(String[] args) {

        //Example 1: Sekiz tane inique String elemani alfabetik sirada depolayiniz.

        TreeSet<String> emails = new TreeSet<>();

        Long start1 = LocalTime.now().toNanoOfDay();

        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");

        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]

        Long end1 = LocalTime.now().toNanoOfDay();

        System.out.println(end1 - start1); //ne kadar zaman da yaptigini bulduk

//2. Yol daha cok tercih edilir, eleman eklemede hashset kullanirim sonra treesete cevirirsek daha hizli sonuc aliriz
        HashSet<String> myEmail = new HashSet<>();
        Long start2 = LocalTime.now().toNanoOfDay();
        myEmail.add("a@gmail.com");
        myEmail.add("y@gmail.com");
        myEmail.add("c@gmail.com");
        myEmail.add("m@gmail.com");
        myEmail.add("b@gmail.com");
        myEmail.add("z@gmail.com");
        myEmail.add("k@gmail.com");
        myEmail.add("d@gmail.com");

        TreeSet myEmalilsSorted = new TreeSet<>(myEmail); //alfabetik siralayacak

        Long end2 = LocalTime.now().toNanoOfDay();

        System.out.println(end2 - start2);//HashSet daha hizli





    }
}
