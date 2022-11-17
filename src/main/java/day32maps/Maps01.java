package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps01 {

    //Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz
    // "I like to move it, move it." ==>> I=1, like=1, To=1, move=2, it=2


    public static void main(String[] args) {

        String str = "I like to move it, move it.";

        //Noktalama isaretlerini sil,

        str = str.replaceAll("\\p{Punct}", "");

        System.out.println(str);//I like to move it move it

        //Kelimeleri almak icin split() kullanalim
        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler));//[I, like, to, move, it, move, it]

        HashMap<String, Integer> gorunum = new HashMap<>();//{          } suan bos

        for (String w : kelimeler) {
            Integer gorunumSayisi = gorunum.get(w);     //Kelime kullanilmissa value verir

            if (gorunumSayisi == null) {
                gorunum.put(w, 1);
            }else{
                gorunum.put(w,gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);//{move=2, like=1, I=1, to=1, it=2}

    }


}
