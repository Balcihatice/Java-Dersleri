package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        // Example : bir int array listdeki 7 haric tum elemanlari 2 artiriniz

        List<Integer> ages = new ArrayList<>();  //isimler coklu olur ,icinde cok eleman varages.
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (int w : ages) {
            if (w == 7) {
                continue;
            }
            ages.set(ages.indexOf(w), w + 2); //     w = w + 2; // Bir list deki elemanlari degistirmek icin set() metodu kullanilir
        }                                    // bu int leri degistirmek icindir . List icin degildir.
        System.out.println(ages);


        // Example 2) Size verilen arrayListte 8  ve 8 den onceki tum elemanlari 2 katina cikariniz


        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(7);
        num.add(21);
        num.add(8);
        num.add(9);

        for (int w : num) {
            num.set(num.indexOf(w), w * 2);// inclusive ==dahil,
            if (w == 8) {                     // enclusive== haric
                break;                  // Bu soru inclusive oluyor
            }
            //  num.set( num.indexOf(w)  ,  w*2) ;Buraya koysaydik 8 haric olacakti
        }
        System.out.println(num);

    }

}
