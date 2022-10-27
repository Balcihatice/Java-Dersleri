package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example 1) : Bir Stringdeki sesli harflerin sayisi bulan kodu yaziniz
        // a,e,i,o,u;

        String str = "Java ogrenince para kazanmak kolay,ogrenmeyince ne kolay ki.";

        str = str.toLowerCase();// Sesli harflerin hepsini kucuk yaptik.

        String harfler[] = str.split("");  //Split metodu her zaman array verir.

        int counter = 0;
        System.out.println(Arrays.toString(harfler));

        for (String w : harfler) { //3 ten fazla ihtimal varsa switch tercih edilir.
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }

        System.out.println(counter);

    }
}
