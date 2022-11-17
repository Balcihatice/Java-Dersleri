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

        //foreach loop kullanarak her elemanin sonuna ! isareti ekleyiniz


        for (String w:myList ) {
          w =  w+"!";
        }

        System.out.println(myList);
       //loop`lar kendi baslarina "Collections"lari update edemiyorlar.Bu yuzden java iterator`leri olusturdu
       //"Iterator" ler collections`lari update etmek icin kullanilir,"

        ListIterator<String> itr = myList.listIterator();//objeyi yoktan var etmedik var  olan objeden elde ettik

        while(itr.hasNext()){
            String el = itr.next();
            itr.set(el+"!");
        }
        System.out.println(myList);//[z!, k!, a!, j!, m!]

    }


}
