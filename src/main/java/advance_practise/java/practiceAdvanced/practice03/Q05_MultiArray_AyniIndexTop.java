package advance_practise.java.practiceAdvanced.practice03;

public class Q05_MultiArray_AyniIndexTop {
    /*
 Aşağıdaki mutli dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
 toplamını yazdıran bir program yazın.
 arr1[]={{1,2},{3,4,5}{6}}
 arr2[]={{7,8,9},{10,11},{12}}
*/


    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int limit = 0;//9 yada 5
        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) {
            limit = arr1[i].length;

            if (arr1[i].length > arr2[i].length) {
                limit = arr2[i].length;
            }
            for (int j = 0; j < limit; j++) {

                toplam = arr1[i][j] + arr2[i][j];

                System.out.println("arr[" + i + "][" + j + "] = " + toplam);
            }

        }
        //2.Yol: Metodla
        int[][] dizi1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] dizi2 = {{7, 8, 9}, {10, 11}, {12}};
        int top = 0;
        arraySum(dizi1, dizi2,top);
    }


    public static void arraySum(int[][] dizi1, int[][] dizi2, int top){


        int toplam = 0;
        int disUzunluk = Math.min(dizi1.length, dizi2.length);
        int icUzunluk;
        for (int i = 0; i < disUzunluk; i++)
        {
            icUzunluk = Math.min(dizi1[i].length, dizi2[i].length);
            for (int j = 0; j < icUzunluk; j++)
            {
                toplam = dizi1[i][j] + dizi2[i][j];
                System.out.println(dizi1[i][j] + "+" + dizi2[i][j] + "=" + toplam);
            }
        }
}
}