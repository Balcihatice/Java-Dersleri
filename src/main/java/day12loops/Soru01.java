package day12loops;

public class Soru01 {
    public static void main(String[] args) {
  /*
       Exam[le 3)
       asagidaki sekli cizen kodu yaziniz
       * * * *
       * * *
       * *
       *

 */
        int row = 4;   //satir

        for (int i = 1; i <= row; i++) {

            for (int j = row; j >= i; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
