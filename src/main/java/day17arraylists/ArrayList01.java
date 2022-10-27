package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");
        System.out.println(names); //[Tom, Thomas, Tahsin, Trump, Tacettin]

        List<String> myNaames = new ArrayList<>();//silmeyi istedigimiz elemanlar icin liste olusturduk
// silmek istedigimiz elemanlari bir liste koyariz removeAll ile sileriz
        //removeall kullandigimizda sadece ilk list degisir, parantezin icindeki list degismez
        myNaames.add("Trump");
        myNaames.add("Tom");
        myNaames.add("Tacettin");

        names.removeAll(myNaames); //isimlerden su shirlerin hepsini sil.
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(myNaames);//[Trump, Tom, Tacettin] ilk list degismez.

        boolean sonuc1 = names.containsAll(myNaames); //Bir lisrin icinde coklu elemanlarin var olup olmadigini kontrol eder
        System.out.println(sonuc1); //en az biri yoksa false verir

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        System.out.println(a);
        //Example a listesinden "Shoes" elemaninin ilk gorunumunu silin

        a.remove("Shoes");
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]

//Tum shoes leri silmek icin list olusturduk removeall ile sildik
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a); //[TV, Radio, Laptop, Book]
//Example 3: Bir tane salary listesi olusturun , eger salary 100000`den az ise %20 ,10000 ve 10000`den cok ise %10 zam yapiniz

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);//[12345.0, 8674.5, 15000.75, 9500.0, 20500.0] ilk maas

        for (Double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);

            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary);//zamli maas [13579.500000000002, 10409.4, 16500.825, 11400.0, 22550.000000000004]

// Example 4) Iki arrayList`in esit olup olmadigini kontrol eden kodu yaziniz.
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
       // m.add('t'); //Bunu eklersek listerin eleman sayilari farkli oldugundan bize hata verir
        //elemaan sayilarini kontol et .sayilar esit degilse zaten listler esit degildir.

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
// 1.Yol:  Listlerin esit olmasi demek, Ayni elemanlar ayni indexte olmali

        int counter = 0;//Flag

        for (int i = 0; i < m.size(); i++) {

            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listler esit degildir");
                break;

            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Listler esittir");
        }

// 2.yol)

        boolean esitMi = m.equals(n);

        if (esitMi) {
            System.out.println("Listler esittir.");
        } else {
            System.out.println("Listler Esit degil");//Listler Esit degil

        }


    }
}
