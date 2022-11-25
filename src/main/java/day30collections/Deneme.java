package day30collections;

import java.util.Collections;
import java.util.LinkedList;

public class Deneme {
    public static void main(String[] args) {


        LinkedList<String> myList = new LinkedList<>();

        myList.add("B");
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("B");
//
//        System.out.println(myList);//[C, B, B, A, B]
//myList.removeLastOccurrence("B");
//        System.out.println(myList);//[C, B, B, A]
//        myList.removeLastOccurrence("B");
//        System.out.println(myList);
       myList.removeAll(myList);
        System.out.println(myList);
        System.out.println(myList.removeAll(myList));
    }
}