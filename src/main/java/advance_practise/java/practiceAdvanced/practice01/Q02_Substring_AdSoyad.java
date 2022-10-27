package advance_practise.java.practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim soyisimi aralarinda bir bosluk birakarak giriniz");
        String nameSurname = scan.nextLine();

        //space in indexini bulmak laxim
        int idx = nameSurname.indexOf(" ");

        String name = nameSurname.substring(0, idx);

        String surname = nameSurname.substring(idx + 1);

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);


        // 2. Yol
        Scanner input = new Scanner(System.in);
        System.out.println("isim soyisim gir");
        String as = input.nextLine();

        String a = as.split(" ")[0];
        String b = as.split(" ")[1];
        System.out.println(a + b);


    }
}
