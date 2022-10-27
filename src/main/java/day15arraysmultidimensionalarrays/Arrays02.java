package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        // Example 1 ) Size verilen pozitif ve negatif sayilar iceren bir int arraydeki
        //en buyuk negatif ve en kucuk pozitif elemani bulunuz

        int arr[] = {-12, 18, -5, 23, 0};
        Arrays.sort(arr);   //-12,-5,-2,0,18,23

        // 1. Yol : -12,-5,-2 nin max bulucam sonra pozitiflerin minimumlarini alacagim

        int maxNegatif = arr[0]; // -12 // en buyuk negatif ilk eleman sayiyoruz
        int minPozitif = arr[arr.length - 1]; // pozitif sayilar en sagda ya en son eleman kesin pozitiftir.

        for (int w : arr) {  // w negatifse max bakacagiz

            if (w < 0) {
                maxNegatif = Math.max(maxNegatif, w); // bu iksinden buyugunu secer ve maxNegaife atar.
            }
            if (w > 0) {
                minPozitif = Math.min(minPozitif, w);

            }

        }
        System.out.println(maxNegatif + " and " + minPozitif);

        System.out.println("*****************");

        int brr[] = {3, -4, 12, 0, -9, 16};
        Arrays.sort(brr);
        int maxNegatif2 = brr[0];
        int minPoazitif2 = brr[brr.length - 1];

        for (int w : brr) {
            if (w < 0){
                maxNegatif2 = Math.max(maxNegatif2,w);
            }
            if (w>0){
                minPoazitif2 = Math.min(minPoazitif2,w);
            }
        }
        System.out.println("En buyuk negatif : "+ maxNegatif2);
        System.out.println("En kucuk positif : "+ minPoazitif2);
    }

}
