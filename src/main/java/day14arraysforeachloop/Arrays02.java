package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
        //Suleyman hocanin   INTERVEV SORUSU
       // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end (sifirlari en sona koyunuz)
        //            [2, 3, 12, 0,  0,  0]

        int original[] = {0, 12, -3, 0};
        int yeni[] = new int[original.length];// yeni arrayin elemaan sayisi ilk array le ayni olmali
        int idx = 0;//yeni array icin calisacak bir indexe ihtiyac var.

        for (int i = 0; i < original.length; i++) { //ilk arrayimiz icin

            if (original[i] != 0) {  // i=0 icinOrjnal arrayin sifirnci indexi

                yeni[idx] = original[i];// sifirnci index doldu

                idx++;//sonraki indexe gecti ,yeni elemani koyacak
            }
        }

        System.out.println(Arrays.toString(yeni));

     //Example 2) Bir arrayin icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini
    // gosteren kodu yaziniz
        // [2,1,2,-3,2]  >>> Kullanici 2 yi sordu >>>> 2 elemani var ve 3 kere tekrarlandi.
        //               >>> Kullanici 6 yi sordu >>>> 6 arrayde  yok ve 0 kere tekrarlandi.

        int arr[] = {5, 1, 5, -3};

        int eleman = 5; //Kullanici girisi

        int counter = 0;

        for (int w : arr) {

            if (w == eleman) {     // 5== 5 mi true  bu eleman kullanicinin aradigina esitse o elemani say

                counter++;//yukarisi true ise ++

            }
        }
        if (counter > 0) {  // counter > 0 esit se var
            System.out.println(eleman + " array de " + counter + " defa var ");
        } else {       // 7 girince hicbirsey yazdirmadi ve else ekledik
            System.out.println(eleman + " array de yok ");
        }


        //  Example 3) Size verilen bir cumledeki en uzun kelimeyi buluan kodu yaziniz
        //  " Java kolaydir calisana , ne kolay ki calismayana "  >>>>> calismayana

        //  kelime karsilastiracagiz kelimelere ulasmamiz lazim .
        //  Stringi spacelerden parcalasak her biri kelimedir aancak virgulden kurtulmaliyiz

        String sentence = "Java kolaydir calisana, ne kolay ki calismayana";
        sentence = sentence.replaceAll("\\p{Punct}", ""); //space sildik.
        System.out.println("sentence = " + sentence);
        String words[] = sentence.split(" "); // split metodu bize array verir.o yuzden worde atadik

        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words)); //[, ne, ki, Java, kolay, kolaydir, calisana, calismayana]

        //Comparator >>karsilastirici demek
       //comparingInt(String::length) karsilastirmayi Stringlerin uzunluklarina gore yap.

        // en son elemani almamiz lazim

        System.out.println(words[words.length - 1]);



    }
}
