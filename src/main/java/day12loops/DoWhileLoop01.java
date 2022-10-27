package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
       // while da:  dusun - hareket et
        int i = 1;

        while (i < 0) {//false oldugundan kod calismaz.while loop bazi durumlarda hic calismayabilir
            System.out.println("while loop");// yani while loop icin "zero execution" mumkundur.
            i++;
        }


        // do-while da:  hareket et - dusun  (En az bir kere calisir)
        int k = 1;
        do {   ///YAP diyoruz.
            System.out.println("do-while loop"); //yazdiriyor
            k++; //sonra artiriyor
        } while (k < 1);// sonra kontrol yapiyo. while dusunme demek .Burada once yazdiriyor sonra dusunuyor.

        // NOT:do while loop kullanildiginda loop body si icindeki kod en az bir kere calisir.
        // Yani do-while loop icin "zero execution mumkun degildir."
        //   Mesela ATM makinelerinde once password alip sonra dusunur ve gecerli der.


        //Example 1) Bir ondalik sayinin ondaalik kismindaki rakamlarinin toplamini bulunuz
        //24.5673 =====>>>>> 5+6+7+3=21

        double num = 24.5673;
        System.out.println(num); //24.5673

        // valueOf() metodu parantezin icine konulan data nin tipine String yapar
        String str = String.valueOf(num); // valueOf() ne koyarsan koy icine onu stringe cevirir
        System.out.println(str); // "24.5673" yazar ,yani string dir.

        // Regex icin nokta kullandiginizdaa onune "\\." koyunuz .Yani nokta "\\." seklinde kullanilir.
        // Sembol anlamindan kurtulmak icin bunu yaptik

        String decimalPart = str.split("\\.")[1];  //decimalPart= ondlik kisim

        System.out.println(decimalPart);  //5673 .Bunu tekrar int e cevirecegiz

        int decimalInt = Integer.valueOf(decimalPart);

        System.out.println(decimalInt); //5673 integer oldu

        int sum = 0;
        do {
            sum = sum + decimalInt % 10;  //3   ,  7     ,   6

            decimalInt = decimalInt/10;  //567   ,  56   ,  5

        } while (decimalInt > 0);

        System.out.println(sum);




    }
}
