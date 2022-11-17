package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Ali");
        names.add("Veli");
        names.add("Tom");


        /*
        Retrieves,(almak) but does not remove, first element of this list.
        Returns: ilk elemani verir ama silmez,
        the first element of this list, or "null" if this list is empty>> eger bos ise null verir,exception vermez
         */


        String firstEl = names.peek();
        System.out.println(firstEl);//Chris
        System.out.println(names);//[Chris, Ali, Veli, Tom]

        LinkedList<String> myList = new LinkedList<>();

        String first = myList.peek();
        System.out.println(first);//null


        /*
        Retrieves and removes first element of this list.
        Returns:
        the head of this list, or null if this list is empty
        Since:listdeki ilk elemani hems ilmek hemde gormek istiyoruz,list bos iken null versin hata vermesin dersek kullaniriz
         */
        String firstelement = names.poll();
        System.out.println(firstelement);

        System.out.println(names);//ilk eleman silindi  [Ali, Veli, Tom]


       /*
       Retrieves, but does not remove, the head (first element) of this list.
       Returns:
       the head of this list
       Throws:
       NoSuchElementException – if this list is empty
        */
        String f = names.element();
        System.out.println(f);
        System.out.println(myList);


        names.peekFirst();
// Example 1) "A" ile baslayan tum isimleri "****" e ye ceviriniz

        LinkedList<String> students = new LinkedList<>();
        students.add("Chris");
        students.add("Ali");
        students.add("Veli");
        students.add("Tom");
        students.add("Hans");

        for (String w : students) {
            if (w.startsWith("A")) {
                students.set(students.indexOf(w), "*****");
            }
        }
        System.out.println(students); //[Chris, *****, Veli, Tom, Hans]

//Example 2) Listdeki 4 harften cok harf iceren isimleri siliniz

        // Interview sorusu

        LinkedList<String> students2 = new LinkedList<>();
        students2.add("Chris");
        students2.add("Ali");
        students2.add("Veli");
        students2.add("Tom");
        students2.add("Hans");

        //eleman sayisini azaltacagimiz icin i ye ihtiyacimiz var ,o yuzden "foreach-loop" degil for loop kullaniyoruz.

        for (int i = 0; i < students2.size(); i++) {

            if (students2.get(i).length() > 4){

                students2.remove(students2.get(i));
                i--;
            }
        }
        System.out.println(students2);//[Ali, Veli, Tom, Hans]






    }
}
