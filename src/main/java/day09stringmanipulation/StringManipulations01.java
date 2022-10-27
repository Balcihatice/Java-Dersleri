package day09stringmanipulation;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str = "Kara kara dusunme Ankara";

        // indexOf() metodu verilen karakter("a") veya caharcterlerin("kara") ilk görünümünün indexini verir
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1); //5 kara karakterinin ilk indexini verir.

        // lastIndexOf() :metodu verilen karakter veya caharcterlerin son görünümünün indexini verir
        int idxA2 = str.lastIndexOf("kara"); //20 kara'nın son indexini verir.
        System.out.println("idxA2 = " + idxA2);

        String s = "Mississippi";
        int idxI = s.indexOf('i');// hem string hemde char ile de çalışır.
        System.out.println(idxI); // 1     i nin ilk indexini ver

        int idxIss1 = s.indexOf("iss"); //1 ilk görüünümün ülk karakterinin indexini verir.
        System.out.println("idxIss1 = " + idxIss1); //

        int idxIss2 = s.lastIndexOf("iss"); // 4. baştan sayar ilk karakterin indexini verir.
        System.out.println("idxIss2 = " + idxIss2); //
 /*
 Example 1 : Bir stringdeki bir characterin tekrarlı veya tekrarsız olup olmadıgını kontrol eden kod yazınız
 "Helloooo"  H> TEKRARSIZ     O--> tekrarlı,   e--->> tekrarsız
  */
        String t = "HELLOOOO";

        char c = 'H'; //kodun içinde harf degiştirmek iyi karşılanmaz o yüzden konteyner oluşturduk
        if (t.indexOf(c) == t.lastIndexOf(c)) {
            System.out.println("Tekrarsiz");
        } else {
            System.out.println("Tekrarli");
        }

        //İNTERVEVVVVVVVV  bir stringdeki tekrarlı elemanlarrı belirleyen kodu yazınız
        //       İNDEXOF İLE LASTİNDEXOF AYNI İSE TEKRARLI DEGİLDİR.

        String u = "Learn Java earn money";
        int sonuc = u.indexOf("a", 5); //a nın ilk görünümünün indexi bana lazım ama ilk 5 characterden sonraki
        System.out.println("sonuc = " + sonuc); // 7

        int sonuc2 = u.indexOf("n", 5);//ilk 5 karakter hariç ilk n yi ver

        System.out.println("sonuc2 = " + sonuc2); // 14

        int sonuc3 = u.indexOf("e", 4);// ilk caharacter hariç ilk e indexi

        System.out.println("sonuc3 = " + sonuc3); // 11

        String m = "Hello everyone";
        int e =m.lastIndexOf("e",5); // index sifirdan saymaya baslar.bosluk dahil ilk 5 e bakar
        System.out.println("e = " + e);           // sonra indexi sifirdan sayar ve ilk 'e bulunur
        //lastIndexOf() 2 parametreli kullanilirsa en bastan bu indexe kadar olan karakterlei bir kutu icine aliniz ve
        //lastIndexOfu sadece bu kutu icindeki string icin kullaniniz


        // indexOf () iki parametre ile kullanılırsa ikinci parametrede verilen  sayi kadar character'i gectikten sonra istenen character'in
        // ilk görünümünü return eder.
        int sonuc4 = u.indexOf(" ", 6);//

        System.out.println("sonuc4 = " + sonuc4); // 10

        int son = u.lastIndexOf("a", 7);// ilk caharacter hariç ilk e indexi

        System.out.println("son = " + son); // 2 hoca bakıp gösterecek

// isEmpty() Metodu : Bir Stringin boş olup olmadıgını kontrol eder
        // eger string de hiç karakter yoksa isEmpty() metodu "true" return eder.
        // herhangi bir karakter varsa "false" return eder.
// isEmpty olmasaydı; length()==0 demek isEmpty() true verir demektir.
        // length() de iki iş var sayma ve karşılaştırma . java bunu yaparken yorulur.
        // isEmpty() tek işlem var java daha çabuk yapar.
        // bir stringin boş olup olmadıgını anlamak için length()==0 kullanmayın. isEmpty() kullanın.
        String v = " ";
        boolean bosMu = v.isEmpty();// (boş mu)  verilen string de hiç karakter yoksa "true" der.(space) karakterdir
        System.out.println("bosMu = " + bosMu);

//isBlank():
        String x = "       ";
        boolean blankMi = x.isBlank();  //boş mu. Hem boş string için hemde sadece space içeren stringler için true return eder.
        System.out.println("blankMi = " + blankMi); //true

//Example 2:Kullanıcıdan alınan isim mutlaka space den farklı en az bir karakter içermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz.....");
        String ilk = input.nextLine();
        if (ilk.isBlank()) {
            System.out.println("Sana ismini gir dedim...");
        } else {
            System.out.println(ilk);
        }
    }
}
