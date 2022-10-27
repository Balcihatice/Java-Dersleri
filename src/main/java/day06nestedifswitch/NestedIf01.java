package day06nestedifswitch;

public class NestedIf01 {
    public static void main(String[] args) {

        /* Nested: iç içe gecmiş,

        Password ilk harfi büyük harf ise
        'A' olursa geçerli password
        aksi halde gecersi password

        Password ün ilk harfi kucuk harf ise 'z' olursa gecerli password
        aksi halde gecersiz password
eksik senaruo var kullanıcı ilk harf değilde rakam girerse durumu
         */
        String pwd = "mxy12!";

        char ilkHarf = pwd.charAt(0);//Birşey bir çok defa kullanacaksa bir variable oluşturmak mantıklıdır

        if(ilkHarf>='A' && ilkHarf<='Z') {//m>A aski tabloda böyledir
            // C, A dan buyuktur true, C,Z den kucuktur,true, iki true = true
            //Aşagıdaki kod çalışır
            if (ilkHarf == 'A') { //C==A :false
                System.out.println("Gecerli password");
            } else {
                System.out.println("Gecersiz Password");///kranda geçersiz yazar
            }
        } else if (ilkHarf>='a' && ilkHarf<='z') {

            if(ilkHarf<='z'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("Gecersiz Password");
            }
        }else {
            System.out.println("Ilk karakter harf olmalıdır...");
        }

    } // java nested kodları çalıştırıken çok zaman harcaer
    // buna "time complexity" denir
    //mümkünse nested kod yazmamaya calışırız.
}
