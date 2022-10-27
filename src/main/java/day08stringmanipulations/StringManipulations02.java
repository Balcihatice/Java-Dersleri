package day08stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Example 1: Bir string deki space hariç kaç tane karakter oldugunu göstern kodu yazınız
        //     "Ali okula gitti."

        String str = "Ali okula gitti.";
        int num = str.replace(" ", "").length(); //replace()metodu bir krakteri veya karakterleri
        // değiştirmek için kullanılır
        // replace(silmek istediğimiz karakter, yerine koyacağımız karakter);//Aliokulagitti.

        System.out.println(num);//14

//Example bir stringdeki tüm 'a' harflerini 'A' ya ceviriniz
        String s = "Ankara'nın taşına gözlerimin yaşına bak";
        String sonDurum = s.replace("a", "A"); //toUpperCase hepsini buyuk yapar
        System.out.println(sonDurum);
// Example 3: Bir string deki tüm  'kara' kelimesinin yerine * koyunuz

        String t = "Kara kara dusunme Ankara";
        String yeniT = t.replace("kara", "*"); // karakter sayılarının eşit olmasına gerek yok.
        System.out.println(yeniT);

// Example 4: Bir string deki tüm sayıları '*' a çeviriniz AC********
        String stdId = "AC20211704";
        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);  //sıfırdan 9 a kadar hepsini * yap
        // [0-9]:bir grup datayı ifade eden kodlara "Regex" denir.
//        "Regex": Regular Expression'ın kısaltılmış halidir.

//***************************ÖNEMLİ   Regex [] ler  *************
/* 1) Tum rakamlar [0-9]
2) tum kucuk harfler [a-z]
3) tum bukuk harfler [A-Z]
4) tum harfler [a-zA-z]
5) sesli harfler [aeiouAEİOU]
6) Space [ ]
7) Tum rakamlar ve tum harfler [0-9a-zA-Z]
8) Tum noktalama işaretleri \\p{Punct} google da : noktalama işaretleri için Regex
*/

//Example 5: Verilen bir string de kullanılan buyuk harfleri noktalama işareti ve rakamlar ve space karakteri hariç
// tüm karakterlerin sayısnı bulan kodu yazınız

        String u = "Ali 13 yaşında, dersem inanma!...";
//     space sil noktalama sil rakam sil geri kalanı say

        int result = u.
                replaceAll("[0-9]", "").// tum rakamları sil yerine hiçbirşey koy  Ali  yasinda,dersem inanma!...
                        replace(" ", "").   // tum space sil yerine hiçbirşey koy.Aliyasinda,derseminanma!...
                        replaceAll("\\p{Punct}", "").   // tum noktalama işaretlerini sil yerine hiçbirşey koy.//Aliyasindaderseminanma
                        length();   // sonra index say
        System.out.println(result); //22

/*   Regex ler de [] var.replaceall() kullanılır.
1) Rakamlar HARİÇ tum karakterler [^0-9]
2) kucuk harfler haric: [^a-z]
3) Buyk harfler haric tum karakterler :[^A-Z]
4) Tum harfler hariç tum karakterler : [^a-zA-Z]
5) Space hariç: [^ ]
6) Noktalama işaretleri hariç : [^\\p{Punct}]

 */
/*Example 6: bir passwordun gecerlı olup olmadıgını aşagıdakı kurallara göre test ediniz
        1) space hariç en az 8 karakter olmalı
        2) en az 1 sembol içermeli
        3) en az bir rakam içermeli
        4) en az bir buyuk harf içermeli
        5) en az bir kucuk harf içermeli
*/
        String pwd = "B78c? k!m";// geçerli password
        //    1) space en az 8 karakter olmalı
        boolean first = pwd.replace(" ", "").length() > 7;

        //  2) en az 1 sembol içermeli ( rakam ,tüm harf, ve space dışındakiler semboldur)
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length() > 0;
        //            0 ve p yerine,kucuk harf yerine buyuk harf yerine ,,hiçbirşey koy sonra kalanları say 2>0 olur true dur

//  3) en az bir rakam içermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length() > 0;// 2>0 true

//  4) en az bir buyuk harf içermeli
        boolean fourty = pwd.replaceAll("[^A-Z]", "").length() > 0;

// 5) en az bir kucuk harf içermeli:
        boolean fifth = pwd.replaceAll("[^a-z]", "").length() > 0;

        boolean pwdGecerli = first && second && third && fourty && fifth;

        if (pwdGecerli) {
            System.out.println("Passwordunuz gecerli");
        } else {
            System.out.println("Passwordunuz gecersiz...");
        }

        // Example 7: bir strşng deki noktalama işsaretleri hariç karakter sayısını gösteren kodu yazınız
        String cumle = "Sen yapmazsam, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length(); // noktalama işaretleri hariç herşeyi sildi.
        System.out.println(number);                                                 // noktalama işaretlerini saydı.

        // Example 8:Verilen bir string "Al" ile başlıyor ve "x" ile bitiyorsa ekrana harika yazdırın aksi halde "normal yazdırın"

        String v = "Alex"; // Alem  ve Kalex deneyebiliriz.
        boolean baslangic = v.startsWith("Al");

        boolean bitis = v.endsWith("x");

        String result2 = baslangic && bitis ? "Harika" : "Normal";
        System.out.println("result2 = " + result2);


    }
}
