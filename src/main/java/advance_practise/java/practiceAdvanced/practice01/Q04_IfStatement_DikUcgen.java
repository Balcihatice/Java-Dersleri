package advance_practise.java.practiceAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    public static void main(String[] args) {
    /*    Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı:
        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
        Bu bir dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenari giriniz: ");
        int K1 = input.nextInt();
        System.out.println("Ikinci kenari giriniz: ");
        int K2 = input.nextInt();
        System.out.println("Ucuncu kenari giriniz: ");
        int K3 = input.nextInt();

        if (K1*K1 + K2*K2 == K3*K3){
            System.out.println("Bu bir dik ucgendir");
        } else if (K1*K1 + K3*K3 == K2*K2) {
            System.out.println("Bu bir dik ucgendir");
        }else if (K2*K2 +K3*K3 == K1*K1){
            System.out.println("Bu bir dik ucgendir");
        }else {
            System.out.println("Bu dik ucgen degildir");
        }

       // 4^3 ==4 ussu 3



// 2.Yol
       // Scanner input = new Scanner(System.in);
        System.out.println("Üçgenin kenarlarını giriniz");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        boolean dikUcgenMi = (a*a)+(b*b)==c*c ||(c*c)+(b*b)==a*a ||(c*c)+(a*a)==b*b;
        if (dikUcgenMi){

            System.out.println("Bir dik ucgendir");
        }
        else {
            System.out.println("Bir dik ucgen degildir");

        }



    }
}
