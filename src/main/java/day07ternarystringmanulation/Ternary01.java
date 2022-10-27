package day07ternarystringmanulation;

public class Ternary01 {
    public static void main(String[] args) {
        /*
        Example 1: Bir sayının pozitif olup olmadıgını ekrana yazdıran kodu yazınız
     */
    //1Way:
    int a =-12;
    if(a>0){
        System.out.println("Pozitif...");
    }else{
        System.out.println("Pozitif degil...");
    }
     // 2. Way
        System.out.println(a>0 ? "Pozitif" : "Pozitif degil");

//Example 2: Ikı adet sayıdan kucuk olanı secen kodu yazınız
     int b = 23;
     int c = 23;
     int min = b<c ? b : c;

     System.out.println(min);

//    Example 2: verilen bir sayının mtlak degerini hesaplayan kodu yazınız
  // Pozitif sayıların ve sıfırın  mutlak degeri kendileridir
        //negatif sayıların mutlak degeri -1 ile çarpılmış halleridir.


    int d = -45;
     int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Example 4: iki tane sayı aynı işaretli ise bu sayıları çarpınız
        //farklı işaretli ise işlem yapamam yazınız

        int e = 12;
        int f = 10;
       Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "islem yapamam";
        // ternary de farklı data type da sonuc alırsak ne yapmalıyız.sonucun data tipi object olamlı
        // object class tüm classların babasıdır.
        // ikiside uyan data type "object"sout
        System.out.println("islem = " + islem);

  // her classın bir tane parent(aile) ı vardır
  // java da parent ı olmayan tek class vardır. O da (Object) classtır




    }
}
