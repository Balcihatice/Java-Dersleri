package advance_practise.java.practiceAdvanced.practice03;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

public class Q04_DoWhile_TopunSicramasi {
    /*
 Bir top belirli yükseklikten atılmaktadır.
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */

    public static void main(String[] args) {
        zipzip();

    }

    public static void zipzip() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Topun ilk bırakıldıgı yuksekligi giriniz : ");
        double yukseklik = scan.nextDouble();

        double toplamYol = 0;
        int ziplamaSayisi = 0;


        do {
            ziplamaSayisi++;
            toplamYol += yukseklik;
            yukseklik *= 0.75;
            toplamYol += yukseklik;

        } while (yukseklik >= 1);
        System.out.println("Topunuz zıplama  sayısı: " + ziplamaSayisi);
        System.out.println("Topunuzun toplam aldıgı yol : " + toplamYol);


        NumberFormat numberFormat = new DecimalFormat(".#");
        System.out.println(numberFormat.format(toplamYol));

    }


}
