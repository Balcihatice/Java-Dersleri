package day32maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {

    //Size verilen bir kelimede kullanilan harflerin kacar kere kullanildigini gosteren code u yaziniz

    public static void main(String[] args) {

        String kelime = "abbcaa";

        Map<String, Integer> gorunum = new HashMap<>();

        String[] harfler = kelime.split("");
        System.out.println(Arrays.toString(harfler));//[a, b, b, c, a, a]
                                 //[a, b, b, c, a, a]
        for (String w : harfler) {

            Integer gorunumSayisi = gorunum.get(w);
            if (gorunumSayisi == null) {

                gorunum.put(w, 1);
            } else {

                gorunum.put(w, gorunumSayisi + 1);
            }
        }
    }
}
