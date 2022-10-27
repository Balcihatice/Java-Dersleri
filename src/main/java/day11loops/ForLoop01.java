package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {
        //Example 3 ten 6 ya kadaar tam sayilarin toplamini bulan kodu yaziniz
        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;
            System.out.println("sum = " + sum);//her loopun sonucu derse bu sekilde iceerde olacak
        }
        System.out.println("sum = " + sum); // ben son toplami gosterir.
// NOT ; sout loop disina yazilirsa sadece sum in sadece son degerini ekrana yazdirir
// loopun icine yazilirsa her bir loop icin sum in hangi degerleri aldigini yazdirir.


/*
Example 2) 6 dan 3 e kadar tam sayilarin carpimini bulan kodu yapiniz
 */
        int multiply = 1;
        for (int i = 6; i > 2; i--) {
            multiply = multiply * i;
        }
        System.out.println("multiply = " + multiply);


/*
Example 3) size verilen bir  tamsayinin sayinin rakamlari toplamini bulunuz
 */

        // 385 % 10 = kalan 5
        // 385/10 = 38 elde ederiz .Java da tam sayiyi tamsayiya bolersek sonuc tam sayi olur.
        //eger bu bolme sonucu virgullu ise java yuvarlama yapmaz,ondalik kismi siler.
        // 38%10= kalan 8----->>>>>  38/10 yapinca 8 de gitti ,3 kaldi
        //3%10=3     3/110 =0 
        //  3+8+5=16

        int num = 385;         // Dikrement
        //Eger sayimiz negatifse Math.abs kullamilir
        num = Math.abs(num); // artik kodumuz negatif ve pozitif hersey icin calisir.

        int sonuc = 0; //toplama yapinca 0 la baslamali.
        for (int i = num; i > 0; i = i / 10) {
            sonuc = sonuc + i % 10; // i%10 bana rakami verecek ,o rakami sonucla toplayacagim
        }
        System.out.println("sonuc = " + sonuc);


/* ***************INTERVIEV SORUSU  **************************
Example 4) Size verilen bir stringi ters ceviren kodu yaziniz
Kaba-->>>abaK
 */
        String str = "Kaba";
        String ters = "";
        //             4-1=3              3>=0
        for (int i = str.length() - 1;   i >= 0;       i--) {

            char c = str.charAt(i);
                     //         3 -->>> 'a' aldik bunu 'c' ye atatik

           ters = ters + c;
          //i=3->  ""   'a'
      //  i=2-->>  'a'  'b'
      //  i=1-->>  'ab' 'a'
      //  i=0-->> "aba"  'K'
        }
            System.out.println(ters);

// TERS CEVIRMEK ICIN EN SON KARAKTERI EN BASA KOYUP BASLAMAK LAZIM O YUZDEN str.lenght() i baslangica koyduk
    }
}
