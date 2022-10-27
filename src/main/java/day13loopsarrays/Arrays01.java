package day13loopsarrays;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class Arrays01 {

    //Gunluk hayatta bir varable olusturulur icine coklu data koyabiliriz. bu data lar ayni type olmalidir
    //Hepsi int ya da hepsi string olmalidir
    //Bu konteynerlara array denir

        /*
        1) Ayni data type da coklu datayi depolamak icin javanin olusturdugu yapilar vardir
        Bu yapilardan biriside "array" lerdir.
         */

    public static void main(String[] args) {

        int stdAges[] = new int[7]; //  Arrayimiz 7 elemanli. [ 0,0,0,0,0,0,0]

        //  int[] stdAges = new int[7];  // [] uc yere konulabilir
        //Nasil yazdirilir?

        System.out.println(Arrays.toString(stdAges));

        // Array lere eleman nasil eklenir?
        stdAges[1] = 11; //arraye git indexi 1 olani bul onu 11 yap
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;


        System.out.println(Arrays.toString(stdAges)); // tum arrayi yazdirirken boyle toString olmali

        //Arraydeki herhangi bir elemani nasil yazdirabiliriz.
        System.out.println(stdAges[4]);// bir elani cagirirken toStringe gerek yok

        // Example 1) Array deki en kucuk ve en buyuk elemani ekrana yazdiriniz
        //boy hisasina sokar gibi siralariz ve aliriz

        Arrays.sort(stdAges); //Kucukte buyuge dizer.
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0]; // ilk index
        int son = stdAges[stdAges.length - 1];// son index bulur. Dinamik kod olsun diye boyle yazdik

         //NOT : lenght() parantezli stringlerde method hali kullanilir
        // lenght parantezsiz array lerde kullanilir.

        System.out.println(ilk + son);

       //Example 2) stdAges arayi icindeki tum elemanlarin toplamin ekrana yazdiran kodu yaziniz.

        int sum = 0;
        for (int i = 0; i < stdAges.length; i++) {
            sum += stdAges[i];
        }
        System.out.println(sum);


        //2.yol
        int sum2 = 0;
        int i = 0;
        while (i < stdAges.length) {
            sum2 += stdAges[i];

            i++;
        }
        System.out.println(sum2);

       // 3. yol

        int sum3 = 0;
        int k = 0;
        do {
            sum3 += stdAges[k];

            k++;
        } while (k < stdAges.length);

        System.out.println(sum3);

        // for each loop en gelismisidir.Mumkunse mecbur kajmadikca baskasini kullanmayin,  bunu kullanin
        //   for each loop Array lerde ve Collections larda kullanilir
        int t = 0;
        for (int w : stdAges) {
            t = t + w;
        }
        System.out.println(t);

        // Example 3) String bir Aray olusturunuz . Bu array e 5 tane isim yerlestiriniz.
       // Sonra bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz
        String name[] = new String[5];
        name[0] = "Ali";
        name[1] = "Tom";
        name[2] = "Veli";
        name[3] = "Kemal";
        name[4] = "Can";
        int karakteSayilariToplami = 0;
        for (String w : name) {
            karakteSayilariToplami += w.length();   //Stringlerde lenght() parantezlidir
        }
        System.out.println(karakteSayilariToplami);


        // Example 4)  char bir array olusturunuz bu array e 5 eleman ekleyiniz.
        // Sonrada bu array deki sadece buyuk harfleri ekrana yazdiriniz
        // 1.yol    char ch[] = new char[5];
        //2. yol
        char ch[] = {'A', 'c', 'D', 'k', 'M'};   //Direk olusturup eleman ekledik.
        for (char w : ch) {                   // ch yerine elemanlari yazar. Java ilk elemani w nin icine koyar ve kontol eder
            if (w >= 'A' && w <= 'Z') {           //if  kontol eder
                System.out.print(w);        //sart true ise ekrana yazar.
            }
        }


    }
}
