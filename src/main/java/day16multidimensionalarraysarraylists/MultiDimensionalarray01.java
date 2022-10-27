package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalarray01 {
    public static void main(String[] args) {
        //Bir tane int multidimensional array olusturunuz,
        // sonra bu arraydeki tum sayilarin toplamini veren kodu yaziniz

     /*
     Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
     Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for-each-loop" calismaz,
     "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz

      */


        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int sum = 0;

        for (int[] w : arr) { //distaki arrayin
            for (int k : w) { //icerdeki array. icerdeki array w a kadar gidecek
                sum = sum + k;
            }

        }
        System.out.println(sum); //248


        //Example 2) Bir miltidimensional Arrayi , normal arraye ceviren kodu yaziniz.
        //  {{2, 5, 1 },{32, 75 }}   {2,5,1,32,75}

        //1 multidimensional arraydeki eleman sayisini bulunuz. Cunku yeni bir array olusturmaliyiz
        // ve bu yeni arrayi uzunlugu orijinal arrayin eleman sayisina esit olmalidir.

        int brr[][] = {{2, 5, 1}, {32, 75}};
        int toplam = 0;
        for (int[] w : brr) {
            toplam = toplam + w.length; //Toplam elemaan sayisini bulduk.
        }
        System.out.println(toplam);


        int idx = 0;
        int crr[] = new int[toplam];  //[0,0,0,0,0]

        for (int[] w : brr) {    //[2, 5, 1], [32, 75]
            for (int k : w) {
                crr[idx] = k;  //index 0 a 2 koyduk ve devam ettik.
                idx++;
            }
        }

        System.out.println(Arrays.toString(crr));


    }
}
