package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        //Example: Bir listtedi elemanlardan birbiirine en yakin olan ikisini bulun

        // [12,15,19,30,21] >>>> 19 ve 21
        //Kucukten buyuge diz. sort()
        //aradaki farklara bak , farki en az olani sec Math.min()

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);//[12, 19, 15, 30, 21]

        Collections.sort(a); //Listteki elemanlari kucukten buyuge dizebilmek icin kullanilir.
        System.out.println(a); //[12, 15, 19, 21, 30]

        int minFark = Integer.MAX_VALUE;

        for (int i = 1; i < a.size(); i++) {

            minFark = Math.min(minFark, a.get(i) -  a.get(i-1));

        }             //karsilastir      1.index ten 0. indexi cikar
                     //   2milyar         15       -    12    =   3








    }
}
