package day16multidimensionalarraysarraylists;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {

      //  Bil multidimensional Arraydeki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz.
        int arr[][]= {{2, 5, 1}, {83, 75}};

       int maxElemant = arr[0][0]; // 2 ilk elemani koyduk ama ,baskaa eleman da koyabilirdik.
       int minElement  = arr[0][1];

        for (int[] w : arr) {
            for (int k : w) {
                Math.max(maxElemant, k);
                minElement = Math.min(minElement, k);
            }
        }
        System.out.println(maxElemant);
        System.out.println(minElement);

        System.out.println(maxElemant + minElement);










    }
}
