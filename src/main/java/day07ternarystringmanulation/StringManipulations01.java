package day07ternarystringmanulation;

public class StringManipulations01 {
    public static void main(String[] args) {

//         ÖNEMLİ============ BİR ===========CODE

      //       String Class Metodları:
        /*
       1) equals() : i) iki tane string aynı mı degil mi anlamamıza yarar.
                    ii) equals() metodu boolean return eder.
       2) equalsIgnoreCase() : i) iki stringin aynı olup olmadıgını buyuk kücük harfe bakmadan return eder
                              ii) equalsIgnoreCase() metodu boolean return eder.
       3) toLowerCase() i) Stringdeki tüm harfleri küçük harfe cevirmek için kullanılır
                       ii) toLowerCase()  metodu String return eder
       4) toUpperCase()  i) tüm harfleri büyük yapar
                         ii) toLowerCase()  metodu String return eder
       5) charAt() i) Bir string den belli bir index deki characteri almak için kullanılır
                   ii) charAt() metodu char return eder
       6) length()  i) bir string de kaç tane character kullanıldıgını öğrenmek için kullanılır
                   ii) length() metodu bize int return eder.
       7) contains()  i) bir string de belli bir karakterin veya karakterlerin var olup olmadıgını anlamak için kullanılır
                     ii) contains() metodu bize boolean return eder.
       8) split()  i) bir stringi istediğimiz karakterden parçalamaya yarar.split("b") b den böler b ölür
                  ii) split() metodu 'array' return eder.

         */

       /* Example : password ün geçerli olup olmadıdnı aşagıdaki kurallara göre konroleden kodu yazınız
        i) en az 8 karakter içermeli
        ii) space karakteri içermemeli
        iii) ilk harfi "M" veya "m" olmalı
        iv) son karakteri ? olmalı
*/

        String pwd = "Manisa12?";

        //i)
       boolean first = pwd.length()>7; // tum karşılaştırma ifadeleri boolean return eder
//      ii) space karakteri içermemeli
       boolean secon =  !pwd.contains(" "); // pasword space içermez
//                    mez diyor     içerir
//      iii) ilk harfi "M" veya "m" olmalı:
        boolean third =  pwd.charAt(0)=='M' || pwd.charAt(0)=='m';
//      iv) son karakteri ? olmalı:
        boolean fourth =  pwd.charAt(pwd.length()-1)=='?';
//                                  harf sayısı -1 = son index

        System.out.println(first && secon && third && fourth); // && ileminde bir tane false hepsini false yapar

// ÖNEMLİ============ BİR ===========CODE

    }
}
