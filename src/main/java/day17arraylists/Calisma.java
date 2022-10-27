package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class Calisma {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();

        ages.add(12);
        ages.add(13);
        ages.add(14);
        ages.add(15);
        ages.add(16);
        System.out.println(ages);//[12, 13, 14]

        System.out.println(ages.size());//5

        System.out.println(ages.get(1));//13

        ages.remove(1);// 1 eleman sildik
        System.out.println(ages);//[12, 14]

// birkac eleman sileceksek list olusturmeliyiz

        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(14);
        silinecekler.add(15);

        ages.removeAll(silinecekler);
        System.out.println(ages);  //[12, 16]

        List<Integer> myages = new ArrayList<>();

        myages.add(13);
        myages.add(14);

        boolean result = ages.containsAll(myages);//ikiside varsa true ,degilse false
        System.out.println(ages.contains(12));//true
        System.out.println(result);//false
        List<String> name = new ArrayList<>();

        name.add("Ali");
        name.add("Veli");
        name.add("cem");
        name.add("Serdar");
        name.add("Veli");
        System.out.println(name);//[Ali, Veli, cem, Serdar,Veli]

// eleman silme

        name.remove("Veli");//veli yi siler ilk gorunum silindi
        System.out.println(name);//[Ali, cem, Serdar]


        List<String> ss = new ArrayList<>(); //hepsini silmek icin yeniden list gerekli

        ss.add("Ali");
        ss.add("Veli");
        ss.add("cem");


        name.removeAll(ss);
        System.out.println(name);//[Serdar] kalan bu

//Example sallary list
        List<Double> salary = new ArrayList<>();
        salary.add(12.23);
        salary.add(12.56);
        salary.add(16.00);

        for (Double w : salary) {
            if (w < 100) {
                salary.set(salary.indexOf(w), w * 1.2);//salarye gir indexi w olani bul ve maasini degistir
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }

        System.out.println(salary);//[14.676, 15.072, 19.2]

//  Example 4) Iki arrayList`in esit olup olmadigini kontrol eden kodu yaziniz.
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        // m.add('t'); //Bunu eklersek listerin eleman sayilari farkli oldugundan buze hata verir
        //elemaan sayilarini kontol et .sayilar esit degilse zaten listler esit degildir.

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
// 1.Yol:  Listlerin esit olmasi demek, Ayni elemanlar ayni indexte olmali
        int counter = 0;
        for (int i = 0; i < m.size(); i++) {

            if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler esit degil");
                break;
            } else {
                System.out.println("Listler esit");
            }
        }
        if (counter == 0) {
            System.out.println("Listler esit");
        }


    }
}
