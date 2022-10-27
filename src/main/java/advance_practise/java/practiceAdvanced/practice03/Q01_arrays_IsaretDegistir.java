package advance_practise.java.practiceAdvanced.practice03;

import java.util.Arrays;

public class Q01_arrays_IsaretDegistir {

    public static void main(String[] args) {
        //Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6


        int[] arr = {1, 2, -3, 4, -5, -6};
        int s = 0;
        for (int w :arr) {
              w*=-1;
            System.out.print(w+" ");
        }



        System.out.println();
//2.yol
        int idx = 0;
        int[] brr = new int[arr.length];
        for (int k:arr) {
            brr[idx]= k*-1;
            idx++;
        }
        System.out.println(Arrays.toString(brr));
    }




}


