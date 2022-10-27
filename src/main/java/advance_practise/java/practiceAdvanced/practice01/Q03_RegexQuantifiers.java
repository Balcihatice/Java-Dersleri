package advance_practise.java.practiceAdvanced.practice01;

public class Q03_RegexQuantifiers {
    //Bir String değerin belirli sayıda karakter içerip belirli bir karakter ile bitip bitmediğini
    // kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        String str = "!s";
        str.matches(".."); // true herhangi iki karektere sahip mi eslesiyor mu eslesmiyor mu,

        System.out.println(str.matches(".s"));//trueherhangi bir karakterle baslasin "s" ile bitsin.
        System.out.println(str.matches("..."));//false 3 karakterli degil

        //Matches() Metodu regex ile calisip String degerin regex ile karsilastirmasini yapar.
        System.out.println(str.matches("..s"));//falze 3 karakterli degil

//Example 2)
        //Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını
        // kontrol eden bir kod yazınız.

        System.out.println("  $sdfgth".trim().matches(".s.*")); //true s den sonra .* dersek sadece s kontrol edilir digerlerine bakilmaz
        // 2. karakter s mi baktik
        // .* herhangi bir sey, cumle sonunda hic birseyde olmayabilir

        //.*==>> esnek karakter(0 yada daha fazla)
        System.out.println("$shgfh".matches(".r.*"));//false ==>> ikinci karakter uyusmuyor.

////Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.
        System.out.println("ashfegt".matches("[a-zA-Z]*"));//* tum harflere bakiyor,  [a-zA-Z] tek karaktere bakar
        System.out.println("ca".matches("\\w{2}"));//Quantifiers 2 karakter bakacagimizi soyledik
        System.out.println("ca".matches("[a-zA-Z]?")); //harf mi

////Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("abcde".matches("[a-zA-Z]{5}"));// 5 harfli ve hepside harf mi
        System.out.println("dabcde".matches("[a-zA-Z]{5}"));// false 6 harfli
        System.out.println("1bcde".matches("[a-zA-Z]{5}"));// //false rakam var


// Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.

        System.out.println("123456".matches("[0-9]{6,}"));//true :en az 6 rakam olmali devami farkli olabilr

        System.out.println("1234567".matches("[0-9]{7,}")); //en az 7 rakam true

////Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("abcd123xAc".matches("\\w{7,10}"));//true en az 7 ,en fazla 10karakter (\\w) icerebilir.
        //   \\w : {a-zA-Z0-9_]


        System.out.println("abcd123_".matches("\\w{7,10}"));// true en az 7 karakter


// ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam, toplam 10 karakter olmali,

        System.out.println("1,12345678".matches("[1][\\p{Punct}][0-9],{8}"));  // (.) herhangi bir karakter
                                   // 1, karakter [1]  2.karakter[\\p{Punct}] sonra[0-9]

        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]{8}"));//true noktalamaa 3 tane digerleri 8 tane


       // System.out.println("1?!.12345678".matches("[1][\\p{Punct}][3][0-9]*"));//* koyarsak istedigimiz kadar sayi koyariz


    }
}