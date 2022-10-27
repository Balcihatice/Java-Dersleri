package day17arraylists;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Example 1) Verilen bir List deki elemanlari tekrarsiz olarak yaziniz.
        // [2,,3,2,2,5]>>>> [2,,3,5]
// ilk elemani al yeni listte var mi , false derse , yeni liste koy,

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();

        for (Integer w : a) {
            if (!yeni.contains(w)) {
                yeni.add(w);

            }
        }
        System.out.println(yeni);//[2, 3, 5]


//Example 2: Kullanicidan bir harf aliniz, harf sizdeki List'in icinde varsa o harfi "Bulundu" ya ceviriniz yoksa o harfi List'e ekleyiniz
//           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
//           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]


        Scanner input = new Scanner(System.in);
        String harf ="";
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        do {
            System.out.println("Lutfen harf giriniz");
             harf = input.next().substring(0, 1); //yukarida string tanimladik tekrar yazmayaa gerek  yok
// listimiz string oldugundan kullanicidaan string aldik.

            if (c.contains(harf)) {
                c.set(c.indexOf(harf), "Bulundu");//litdeki harfin indexini bul ve bulundu diye degistir
            } else if(!harf.equals("Q")){
                c.add(harf); //yoksa liste  ekledik
            }

        }while(!harf.equals("Q"));
        System.out.println(c);






    }
}
