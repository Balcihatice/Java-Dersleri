package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays02 {
    public static void main(String[] args) {

       char arr[][] = { {'a','b','c'},{'C','D','E'}, {'?'} };

        System.out.println(Arrays.deepToString(arr));//[[a, b, c], [C, D, E], [?]]

        //Bir String multidimensional array'de icinde "a" olan elemanlari concole'a yazdiriniz.

        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w : brr ) {
            for (String k :w) {
                if (k.contains("a")){
                    System.out.print(k + " ");
                }
            }
        }
        System.out.println();

        int[][] numaralar= { {1, 2, 3, 4}, {5, 6, 7} };

        for (int i = 0; i < numaralar.length; ++i) {

            for(int j = 0; j < numaralar[i].length; ++j) {

                System.out.print(numaralar[i][j]+ " ");
            }
        }


    }
}
