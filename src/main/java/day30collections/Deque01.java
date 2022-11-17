package day30collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    /*
     Deque :Double ended queue manasindadir. Yani iki uclu Queue demektir.
     Deque`de FIFO(First in first out)  ve LIFO(Last in first out) beraber gerektiginde kullanilir

     */
    public static void main(String[] args) {
        Deque<String> furnitureTruck = new LinkedList<>();

        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");

        System.out.println(furnitureTruck);
           /* Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse, bu deque tarafından
        temsil edilen yığına (başka bir deyişle, bu deque'nin başında) bir öğeyi iter,
        şu anda boş alan yoksa bir IllegalStateException fırlatır.
Bu yöntem, addFirst'e eşdeğerdir.
        Pushes an element onto the stack represented by this deque (in other words, at the head of this deque)
        if it is possible to do so immediately without violating capacity restrictions,
        throwing an IllegalStateException if no space is currently available.
This method is equivalent to addFirst. Push ile eddFirst() aynidir.
Params:
e – the element to push
Throws:
IllegalStateException – if the element cannot be added at this time due to capacity restrictions
ClassCastException – if the class of the specified element prevents it from being added to this deque
NullPointerException – if the specified element is null and this deque does not permit null elements
IllegalArgumentException – if some property of the specified element prevents it from being added to this deque
         */
        furnitureTruck.push("Refrigerator");

        System.out.println(furnitureTruck);//[Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]



    }
}
