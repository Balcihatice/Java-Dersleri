package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {
        //Loop : Dongu demek. Java da tekrarli bir sey yapmak istersek Loop kullaniriz
// Bu sistem her senaryoda calismaz.
//          baslangic degrei     hangi sartta calisacak     Increment(Artirma) veya Dincrement(Azaltma)
 //Example 2.Ekrana 5 kere "Hi" yazdirin

        for (int i = 0; i < 6; i++) {
            //   bir kere calisir     tekrarli calisir              tekrarli calisir
            System.out.println("Hi");
        }

// Dort cesit Loop var.
        //1. for-loop
        //2. while loop
        //3. do-while loop
        //4.for each-loop (en gelismis, en basali) loop tur

// Example 3) dorttten 7 ye (7 dahil demektir)kadar sayilari ekrana yazdiran kodu yazin

        for (int i = 4; i < 8; i++) {
            System.out.print(i + " ");
        }
/*Increment 1) i=i+3            Carpma : 1)  i=i*3
            2) i+=3                      2) i*=3
            3) i++                       carpma da 3. yok

  Dicrement : k=15 1) k=k-7      Bolme  : 1) k=k/3 tekrar var
                   2) k-=7                2) k/=3 daha kullanisli
                   3) k--                 3) yok

    */

        System.out.println();
//Example 4 : 14 ten 5 e kadarr tamsayilari ekrana yazdirin

        for (int i = 14; i > 4; i--) {
            System.out.print(i + " ");
        }


        System.out.println("********");


//Example5)  13 ten 5 kadar tum cift sayilari ekrana yazdirin
        // 1.yol
        for (int i = 13; i > 4; i -= 2) {
            System.out.println(i + " ");
        }
// 2. yol
        for (int i = 13; i > 44; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println("=====================");
//Example 6: 28 den 157 ye kaadar tum tek sayilari ekrana yazdirin
        for (int i = 28; i < 158; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
//Example 7) Java stringini J*a*v*a stringine ceviren kod yaziniz
        String str = "Java";          //harf al * koy harf al * koy = tekrarli islem
        //       index 0, index 1, index 2, index 3......

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "*");
        }
        System.out.println();

        String d = "Java candir.";
        for (int i = 0; i < d.length(); i++) {
            System.out.print(d.charAt(i) + "#");
        }
        System.out.println();

//Example 8 : Size verilen String de tekrarsiz karakterleri ekranaa yazdirin
        //"Helllooooo Ali" ====>>>>> HeAi olmali
        String s = "Hellooo Ali";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.print("Example 8:" +c);  //He Ai
            }
        }


 //   For döngüsü kullanarak aşağıdaki şekli oluşturun.

        System.out.println("<------->");
        for(int i=1; i<=5; i++) {
            System.out.println("+\t+");
            System.out.println("  +");
        }
        System.out.println("<------->");


 //For döngüsü kullanarak 50 ile 60 dereceleri arasını fahrenheit cinsinden ekrana yazdırınız.

        for(int c=50; c<=60; c++) {
            double f = c*1.8+32;
            System.out.println(c+" Derece = "+f+" Fahrenheit");
        }






    }
}

