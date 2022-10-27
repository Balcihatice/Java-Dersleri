package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        //Bir stringdeki "m" karakteri haric tum karakterleri yaziniz
        //Andremeda===>> Androeda

        String str = " madam";

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (c != 'm') {  // (c!=''m' && c!='M') seklinde yazilirsa M de alinmaz
                System.out.print(c);// ln yok yan uana yazdirmak istiyoruz
            }
        }
        // 2. Yol:
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'm') {
                continue; //Bosveeeerr  Direk artirma y da azaltmaya gorurur. True ise Devamindaki kod calismaz.
            }
            System.out.println(c);  // c !=m ise

        }

        // continue loop larda  (artirma azaltma) kullanilir
        // 1 den 100 e kadar ama 15 yazdirmak istemiyorsak continue kullanilir.
        // bazi degerleri kullanmak istemiyorsak continue kullanaabiliriz.

/*
Example 2) 1 den 100 e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz,
 */

        for (int i = 1; i < 100; i++) {

            if (i % 6 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();//bunu koyunca Luxe gorundu
 /* Example 3) Size verilen bir stringdeki 'm' den onceki karakterleri yazdiriniz
        Luksemburg  ==>> Luxe
      */

       String s = "Luxemburg" ;
        for (int i = 0 ;  i < s.length() ;  i++) {
            char c = s.charAt(i);
            if (c=='m'){ // once say sonra yaz.
                break;
            }
            System.out.print(c);
        }

        String f = "Luxemburg" ;
        for (int i = 0 ;  i < s.length() ;  i++) {
            char g = s.charAt(i);//once yaz sonra say m ve m den onceki tum karakter deseydi boyle yazardik

            System.out.print(f);
            if (g=='m'){
                break;
            }
        }










    }
}
