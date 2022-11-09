package day20stringbuilderstringbuffer;

public class StringBiulder01 {
    /*1) StringBiulder java da bir Class`dir,
    2) StringBiulder ,String olusturmaya yarar,
    3) "String Class varken nicin StrinBiulder`a ihtiyac duyariz
    Cunku String Class "Immutable Class" dir, ama biz bazen "Mutable" Stringlere ihtiyac duyariz,
    StringBiulder bize "Mutable" String verir.
  Mutable==Degisime acik
  Immutable class ==Degisime kapali
4) Immutable Classlarda var olan deger degistirilemez,Szi var olan bir degeri dehistirmek istediginizde
i) Memory`de yeni bir variable yeni degerle olusturulur
ii)Sonra eski variable`in pointeri yeni variableye dondurulur
iii) Eger bir variable`i hic bir pointer gostermiyorsa o variable "Garbege Collector" tarafindan silinir

mutable Classlarda var olan deger degistirilebilir, orijinal deger korunmaz.
5) String Class`larin Immutable yapisi "security" icin onemlidir,
Ayni degeri sahip birden fazla String oldugunda Java bir tane konteyner olusturur ve ayni degere sahip Stringlerin bu konteyneri
kullanmasini temin eder. Bu meoryi korumak icin iyidir ancak konteynirdaki degeri bir variable icin degistirdigimiz de
tum variablarin etkilenmesi tehlikesi vardir.Bu tehlikeden kurtulmak icin Java stringleri Immutable(degismez) yapmistir
   Fakat herhangi bir variable``in degerini degistirmek icin Java bir yol bulmustur, Degistirmek istediginiz variable icin
   yeni bir konteyner olusturur ve variablein pointerini yeni variable`a yonlendirir,
   Boylece hem degisim saglanmis ,hemde digerleri etkilenmemis olur.


  */

    public static void main(String[] args) {

        String str = "Java";//Heap memoryde olustu adresi stack`te depolaniyor
        str = "Super Java";//bunun icin memory`de yeni konteyner olusur

        System.out.println(str);

//StringBiulder nasil olusturulur
        //   1.Yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1); //Java Stringde olabilir biulder da olabilir koda bakmak lazim

        // 2.Yol:
        StringBuilder strb2 = new StringBuilder(); //bos StringBiulder olusturduk

        //Yol a:  append ,Stringlerdeki concat() metodu giibidir
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append(" ! ! !");
        System.out.println(strb2);// Java is easy

        //Yol b:
        strb2.append(" Learn").append(" Java earn").append(" money.");
        System.out.println(strb2); //Java is easy ! ! ! Learn Java earn money.

        //StringBiulder`larda karakter sayisi nasil bulunur
        StringBuilder strb3 = new StringBuilder();//Memoryde 16 kutu`lu kapasite olusur.
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");
        int numOfChar = strb3.length();
        System.out.println("numOfChar = " + numOfChar);// 18
        int capacity = strb3.capacity();
        System.out.println("capacity = " + capacity);//16+16+2.Memorydeki String kapasitesi
//  ONEMLI ====>>>>>>>>>  Kapasite asimlarinda varolanin iki katinin iki fazlasi gelir.

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int idx = strb3.length();
        System.out.println(idx);
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);//70

        // set() //index 2 deki karakteri r ye cevirir
        strb3.setCharAt(2,'r');//Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
        System.out.println(strb3);

        // delete(3,18 ) ==>> index3 ten (dahil)  ,,  index18 e kadar(haric) tum characterler silinir
        strb3.delete(3,18);
        System.out.println(strb3);//Carmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm


        // deleteCharAt () index ikideki karakteri siler
       strb3.deleteCharAt(2);//'r yi siler
        System.out.println(strb3);//Cammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

//reverse() StringBuilder`i  ters cevirir,
        strb3.reverse();
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //Stringlerden bir ornek verelim
        String abc = "Java";
        abc.replace("a", "i");
        System.out.println(abc);//Java Orijinal deger.  degismedi,Cunku Strinler Immutable`dir
//atama yapinca "Jivi" goruruz abc = abc.replace("a", "i");


    // Mutable`larda sadece metod kullanmak orijinal degeri degistirmek icin yeterlidir,
    // IMmutable`larda  orijinal degeri degistirmek icin metodu kullanmali ve atama islemi yapmaliyiz
    // atama yapmadan orijinal degeri degistiremeyiz.

        // toString(): stringBiulder`lari Stringe cevirir.
        String stringstrb3 = strb3.toString();
        System.out.println(stringstrb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //StringBiluder`a donelim
        StringBuilder strb4 = new StringBuilder(stringstrb3);
        System.out.println(strb4);////mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC
// insert() araya yerlestirme ,
        strb4.insert(3, "XXXX");//offset = bosver ,ilk 3 karakterden sonraya x`leri koy
        System.out.println(strb4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        strb4.insert(3,"KLMOPQRSTU", 5, 8);
        System.out.println(strb4);//mmmQRTXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC
//3,karakterden sonra verilen karakterlerin 5,indexinden(5,6,7),,,, 8,indexine kadar`ini ekle
        
       
       StringBuilder a = new StringBuilder("Java");
       StringBuilder b = new StringBuilder("Java");

       //a.compareTo(b); i) Stringbiulderlar tamamiyle ayni ise sifir yazar
       //                 ii) a alfabetik sirada b den sonra gelirse poziitif olarak aradaki alfabetik siralama farkini gosterir
      //                  iii) ii) a alfabetik sirada b den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
        int sonuc = a.compareTo(b); // a stringBiulderile  b stringBiulder ile karsilastir
        System.out.println("sonuc = " + sonuc);//sonuc = 0
        
        //CompareTo askii value`larla calistigi icin buyuk kucuk harfe duyarlidir.
        
        
        
    }
}
