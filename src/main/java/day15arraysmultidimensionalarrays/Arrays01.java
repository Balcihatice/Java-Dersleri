package day15arraysmultidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class  Arrays01 {
    public static void main(String[] args) {
        // binarySearch() Methodu: Bu metodu kullanarak bir elemanin array de olup olmadigini anlariz
        //Stringlerdeki concans() metodu gibidir ama onun gibi true false return etmez
        // binarySearch() Methodu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir.
        // binarySearch() Metodu aradigimiz  eleman Array de varsa o elemanin indexini return eder
        // binarySearch() Metodu aradigimiz eleman Array de yoksa ne yapar ?

        // binarySearch() Metodu tekrarlayan elemaanlar icin kullanilmaz.

        int arr[] = {12, 31, 43, 14};

        int sayi = 43;
        Arrays.sort(arr); //kucukten buyuge dizdik
        int idx1 = Arrays.binarySearch(arr, sayi); // index:3    //  43`u arr de bul
        System.out.println(idx1);


       //Arrayde olmayan sayi ile denedik
        int sayi2 = 58;
        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc); // -5return etti.  (-)>> Arrayde yok. Olsaydi (5)sirada(index degil sira) olurdu

// NOT : Aradigimiz eleman arrayde yoksa -a seklinde negatif sayi aliriz.
        //Bu sayidaki negatif isaretinin anlami bu eleman arrayde yok demektir.
        //a nin anlami olsaydi kacinci sirada olurdu demekir.







    }
}
