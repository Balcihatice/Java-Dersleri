package questions;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetSorusu {
    /*
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alacaksiniz.

    Çıktı--> sonuc = 44.69
     */

    public static void main(String[] args) {

        HashSet<Double> hs = new HashSet<>();
        System.out.println(setOlustur());

        double sonuc = toplaminiAl(setOlustur());
        System.out.println(sonuc);

        System.out.println(setOlustur());
    }

    public static HashSet<Double> setOlustur() {

        HashSet<Double> hs = new HashSet<>(Arrays.asList(3.23, 3.10, 5.12, 10.12, 23.12));
        return hs;
    }

    public static double toplaminiAl(HashSet<Double> hs) {

        double top = 0;
        for (Double num : hs) {
            top += num;
        }
        return top;
    }
}
