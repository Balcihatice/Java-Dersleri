package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("z");
        myList.add("k");
        myList.add("a");
        myList.add("j");
        myList.add("m");

        //for-each loop kullanarak her elemanin sonuna "!" ekleyiniz
        //Note: loop'lar kendi baslarina "Collection" lari update edemezler bu yuzden Java "iterator" lari olusturdu.
        //Iterator'lar Collection'lari update etmek icin kullanilir.

        for (String w : myList) {
            w = w + "!";
        }
        System.out.println(myList);// [Z, K, A, J, M]

        ListIterator<String> itr = myList.listIterator();

   /*  Biz liste eleman ekleyince java list`i` iterator`e ekler.En basina pointer konur,
      next() methodu ustunden atlayarak pointeri bir one alir ve uzerinden atladigi elemani bize verir
      While`in cond`i true ise islem devam eder ve tek tek elemanlar bize verilir
      Iterator nextten gelen elemana set() ile "!" ekler.
*/
        while (itr.hasNext()) {
            String el = itr.next();
            itr.set(el + "!");
        }
        System.out.println(myList);// [Z!, K!, A!, J!, M!]
    }

}
