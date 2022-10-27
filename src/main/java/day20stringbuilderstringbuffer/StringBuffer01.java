package day20stringbuilderstringbuffer;

public class StringBuffer01 {


    /*
    1) StringBuffer Java da bir Class`dir ve String olusturmaya yarar.
    2) StringBuffer Class, StringBiulder gibi "Mutable" dir.


    StringBuffer ile StringBiulder`in` farki nedir ?
     1) Stringbuffer thread-safe dir.  threaag=is

   StringBuffer Multi=thread dir ,bir cok isi ayni anda yapabilir

 2) StringBuffer synchronized dir >>>> Siralama becerisidir.

 Senaryolar: 3 ihtimal var
 1) degistirilemez data icin String Class kullanilir
 2) Degistirilebilir ama milti thread gerekmeyen  durumlar icin "StringBiulder" kullanilir
 3) Degistirilebilir ve "Multi thread" gereken ddurumlar icin "StringBuffer" kullanilir


     */


    public static void main(String[] args) {

String str = "Java";





    }
}
