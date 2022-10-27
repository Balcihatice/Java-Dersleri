package day03typecastingwrapperscanner;

public class WrapperClass01 {
    public static void main(String[] args) {
        // primitiv de degerler var ör:12
        // Non primitivde deger ve metodlar var ör:12,metod

        //  WrapperClass = deger , metod java primitivlere metodlar ekleyerek yeni bir yapı oluşturdu
  /* döner lavaşı wrapper dır, şeker jelatini wraper dır. etrafını saran sınır gibi
     Primitive           Wrapper
       byte    =====>    Byte
       short  ====>>     Short
       int   ======>>   Integer
       long   ====>>     Long
       float   =====>>   Float
       double   ==>>>    Double
       boolean ====>>    Boolean
      ** char   ======>> Character

  ---->>>>>>>>>>>>>>    YANİ WRAPER CLASSLAR DA NON PRİMİTİVDİR
 */

        byte primitiveByte = 12;
        //  primitiveByte. >> nokta koyunca hiç metod yok çünkü primitivler metod içermez sadece deger içerir

        Byte wrapperByte = 12;
        wrapperByte.byteValue(); // burada nokta koyunca bir çok metod çıktı. çünkü wrapper lar metod içerir.

        // Example :  byte data type ının en küçük ve en büyük degerlerini yazdırınız

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        // example 2: short int,long data type larının en buyuk ve enkucuk degerlerini yazdırın

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //önemli /// PRİMİTİVLER NASIL WRAPPERLARA ÇEVRİLİR ( Auto Boxing )otomatik kutulama

        float f1 = 13.99F;
        Float wraperF1 = f1; // hiç şikayet gelmedi,büyük kutu(wrapper) ,küçük kutu(primitive) meselesi

        // Birde wrapper ın içinde char olsun ve char ı dişarı çıkartalım

        //önemli  // Wrapperlar nasıl "primitive" yapılır( Un Boxing) kutudan çıkarma

        Character w1 = 's';
        char primitiveW1 = w1;

        // auto boxing ve un boxing java tarafından otomatik yapılır.ekstra kod yazmaya gerek yoktur

        // bunu wrapper daki metodları kullanmak için kullanabiliriz
        // kullandıktan sonra eski halimize geri dönebiliriz
        // üç adımda 1) primitive lazım 2) metod kullanmamız lazım(auto boxing ), 3) primitive döneriz(Un boxing)


    }
}
