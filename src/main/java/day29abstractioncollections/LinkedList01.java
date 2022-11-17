package day29abstractioncollections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    /*
   ArrayList nasıl oluşturulur?
   1.Yol
    ArrayList<Integer> myList = new ArrayList<Integer>();
   2.Yol
    List<Integer> myList = new ArrayList<Integer>();
  3.Yol
     List<Integer> myList = new ArrayList<>();

   List`lere coklu ve tekrarli data depolamak istedigimizde ihtiyac duyariz.
   or: Bir okuldaki ogrenci isimleri gibi (coktur ve ayni isimde ogrenci olabilir)

   Set: Setlere coklu ama tekrarsiz data depolamak istedigimizde ihtiyac duyariz
   or: Bir okuldaki ogrenci Id lerini depolamak icin kullaniriz


   Queue(kuyruk- Sira) : FIFO (Fist in first out) ilk giren ilk cikar.Market deposu gibi ilk giren ilk cikmalidir.
   Yoksa tarihi gecer bankadaki sirada fifo kullanilir

          LIFO  gerektiginde queue kullanilir.


Java yeni bir yapi olusturmus ve adini LinkedList demis.

 1)  LinkedList`deki her eleman iki bolumden olusur, (data ve pointer)
 2)  Bu bolumlere "node" denir. "Node" List`lerdeki "eleman" demektir
 En son node`a "Tail" ( kuyruk) denir.Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin
 "null" gosterir.
 Node`larin en basinda "Head" var Icinde sadece pointer var o da ilk Node`u gosterir.

3)LinkedList eleman ekleme ve eleman silmede cok basarilidir. Bu yuzden eleman ekleme ve
eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

 4) ArrayList eleman bulmada(search) islemlerinde cok basarilidir, Index`lerle adres verir. or: Sozlukte kullanmak iyidir
LinkedList eleman bulma(search) islemlerinde basarisizdir.

5)ArrayList`ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir.
cunku bir cok elemanin re-index edilmesi gerekir.

6) Index kullanmak eleman bulma islemlerinde basarilidir.Bu yuzden eleman bulma islemlerini cok yapacaksak ArrayList kullanmaliyiz

     */

    public static void main(String[] args) {

        //Iki sekilde linkedlist olusturulur

        LinkedList<String> visitors = new LinkedList<>();
        List<String> visitors2 = new LinkedList<>();

        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2, "Angelina Julie"); //index gorunuyor ama aslinda pointer calisiyor.
        visitors.add("Birad Pitt");
        visitors.add("Tom Hanks");
        System.out.println(visitors); //[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Birad Pitt, Tom Hanks]

        // sadece nereye koymamiz gerektigini soyluyoruz.
        //Java developer'lar rahat etsinler diye "buraya yazilan index'de nereye koymasini gerektigini gosteriyor.
        System.out.println(visitors); //[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Birad Pitt, Tom Hanks]

        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyit Arkin");

        System.out.println(visitors);//[Cuneyit Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Birad Pitt, Tom Hanks, Ajda Pekkan]

        //NOT: LikedList elemen ekleme ve cikarma islemlerinde cok basarili oldugundan ekleme ve silme ile
        // alakali cok fazla method icerir.

        visitors.removeLast();
        System.out.println(visitors);//[Cuneyit Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Birad Pitt, Tom Hanks]

        visitors.removeFirst();
        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Birad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks"); //ilk gorunumu siler
        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Birad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt"); //son gorunumu siler.
        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]


        /*
         removes and returns the first element of this list. uzaklastirir ve size verir.
       This method is equivalent(aynidir) to removeFirst().

       Throws:
       NoSuchElementException – if this list is empty

         */
        String firstEl = visitors.pop(); // ilk elemani siler ve bize verir. LinkedListen cut+paste(kes-yapistir) yapiyor
        System.out.println(firstEl);//Tom
        System.out.println(visitors);//[Hanks, Angelina Julie, Brad, Pitt, Birad Pitt, Tom Hanks]


        LinkedList<String> myList = new LinkedList<>();
       // myList.pop();//NoSuchElementException atti. Cunku LikedList bos

        

    }

}
