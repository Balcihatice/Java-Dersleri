package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    /*
       1) ListIterator da i)hasNext() ii)next() ii)set() iv)hasPrevious() v)previous() vi)remove() method'lari vardir.

       2) Iterator da i)hasNext() ii)next() iii)remove() method'lari vardir.

    hasnext() metgodu pointerdan sonra eleman varsa true, yoksa false return eder.
    next() methodu pointer`i bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder.
    hasPrevious() methodu pointerdan once eleman varsa true,yoksa false return eder.
    previous() methodu pointer`i bir onceki elemanin sonuna koyar ve uzerinden atladigi elemani return eder.


    Eger iki tarafli haraket etmek istemiyorsan Iterator
    Eger list elemanlarinin degistirilmesini istemiyorsak Iterator

    Eger sadece silmek istiyorsan Iterator kalin.



*/
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example 1: Iterator kullanarak list elemanlarini tersten consola yazdiriniz

        //Sondan yazdirmak icin pointer`i en sona getirmeliyiz
        // once listi iteratore cevirelim
        ListIterator<String> itr = myList.listIterator();

        while (itr.hasNext()) {  //hasnex pointerin en basta olmasindan true alacak
            itr.next();   //pointerinil elamnlara senden sonra eleman varmi diye soracak,varsa pointer birsonrakine gececek
            //eleman bittiginde ondan sonra eleman olmadigindan loop kirilir next() ile pointer en sona geldi
        }

        while (itr.hasPrevious()) {  // hasPrevious: pointera enden once eleman varmi diye sorar.varsa pointer`i sola ceker,
            String el = itr.previous();  //uzerinden atladigi elemani bize verir.
            System.out.print(el + " ");
        }
        System.out.println();
        //Suanda pointer en basa geldi

        //Example 2 Listteki tum elemanlari siliniz
        while (itr.hasNext()) {
            itr.next();//pointer`i saga iter

            itr.remove(); //atlanan elemani siler.
        }
        System.out.println(myList);

        /*
            1) ListIterator da i)hasNext() ii)next() ii)set() iv)hasPrevious() v)previous() vi)remove() method'lari vardir.

            2) Iterator da i)hasNext() ii)next() iii)remove() method'lari vardir.
        */


        //Simdi Iterator kullanalim Bizdeki listten Iterator olusturralim.
        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();

        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.print(el);
        }
    }

}
