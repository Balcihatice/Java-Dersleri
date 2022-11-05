package day25exception;

public class Exception01 {
/*
/*1)"Exception" (istisnai hata) javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
      2) Exception lar ile calismanin iki yolu vardir
            a) try-catch block kullanma ve exception olussa bile calısmayı devam ettirme
            b) throw exception kullanarak calismayi durdurma (mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamız
            gerekiyor ise bu dosyamız eger silinmis ise java dosyayi bulamaz ve uygulanın devam etmesi gerekmez)
      3) Eger exception'ı handle etmez isek (sorunu halletmezsek) java calismayi durdurur.
      4) try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz
      5) try, catch olmaksizin yanliz kullanilamaz.
      6) Eger yazmis oldugunuz harhangi bir kod satirinda  problem olabiliecegini dusunuyorsaniz  try-catch block iciene koymalisiniz
      7) catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir
      8) e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
         System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir
         e.printStackTrace(); methodu Exception ile ilgili detaylica teknik mesaj verir. kod calismaya devam eder
         System.err.println("burasi renkli"); hata mesajini renkli olarak verir bu sayede cansolda diger mesajlardan ayırmak icin kullaniriz
      9)Eger try body icindeki kod sorunusuz calisirsa catch blok devreye girmez
    Exception: Istisna
    Java matematik ile ilgili karsilasilmasi muhtemel tum hatalari '  ArithmeticException'
    Clasina koymustur. Matematikteki tum istisnalari detaylari bilmeme gerek yok.
 */

    public static void main(String[] args) {
           divide(6, 2);
           divide(0, 2);
           divide(6, 0);//rte hatasi verir


    }

    //  1.Yol tavsiye edilmez
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayi sifir ile bolunemez");
        } else {
            System.out.println(a / b);
        }
   }


}