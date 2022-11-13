package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    // Queue01 interface dir obje olusturamazyiz. ama LinkedList kullanilabilir
    // Ilk giren elemani ilk kullnmamiz(first in first out ==>> FIFO) gerektiginde queue en iyi secimdir.
    //Queue da elemanlar "Insertion order"a gore dizilirler.
    //Queue da poll(),element(), remove(),peek() gibi bir cok method vardir.
  /*  Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse, belirtilen öğeyi bu kuyruğa ekler.
    Kapasite kısıtlamalı bir kuyruk kullanırken, bu yöntemin eklenmesi genellikle tercih edilir,
    bu yöntem yalnızca bir istisna atarak bir öğe eklemede başarısız olabilir.
    Döndürür: öğe bu kuyruğa eklendiyse true, aksi takdirde false
    Atar:
    ClassCastException – belirtilen öğenin sınıfı, onun bu kuyruğa eklenmesini engelliyorsa
    NullPointerException – belirtilen öğe boşsa ve bu sıra boş öğelere izin vermiyorsa
    IllegalArgumentException – bu öğenin bazı özellikleri onun bu kuyruğa eklenmesini engelliyorsa
    */
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();//LinkedList constructorini kullandik,data type Queue dir

        wareHouse.add("Milk");
        wareHouse.add("Meet");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);
/*
Inserts the specified element into this queue if it is possible to do so immediately without
violating capacity restrictions. When using a capacity-restricted queue, this method is generally
preferable to add, which can fail to insert an element only by throwing an exception.

Returns:
true if the element was added to this queue, else false
Throws:
ClassCastException – if the class of the specified element prevents it from being added to this queue
NullPointerException – if the specified element is null and this queue does not permit null elements
IllegalArgumentException – if some property of this element prevents it from being added to this queue
 */


        wareHouse.offer("Potatoes");    //Kapasite uygunsa ekleme yapar
        System.out.println(wareHouse);//[Milk, Meet, Bread, Honey, Tomatoes, Potatoes]



    }
}
