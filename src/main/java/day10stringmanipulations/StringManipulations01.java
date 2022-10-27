package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile başlayıp başlamadığını kontrol eder.
        //"kola" ile başlıyorsa "true" başlamıyorsa "false" return eder.

        String a = "Java kolaydir.";
        boolean b = a.startsWith("va", 2);//bu string 2.karakterden sonra ne ile basliyor(karakter 1 den say Ja dan sonra)
        boolean bb = a.startsWith("kola", 5);//5 karakterden sonra ne ile basliyor."kola" ile basliyorsa true.
        System.out.println("b = " + b); //boslugu herzamn say
        System.out.println("bb = " + bb);



//replaceFirst("a", "*"); kod String'deki ilk "a" yı "*" a çevirir.
        //replace("a","*"); kod String'deki tüm "a" ları "*" a çevirir.
        String c = a.replaceFirst("a", "*");
        System.out.println(c);//J*va kolaydır.

 //concat() method'u iki tane String'i birbirine yapıştırmaya yarar.
        //"Concatenation" işlemi iki türlü yapılabilir, i)+ ile ii)concat() ile
        //Java bir işlem için method üretmişse o method'u kullanmak "best practice"dir.
        String d = a.concat(" Anladın mı?");
        System.out.println("d = " + d);


        String e = "    Tom Hanks   ";
        System.out.println("e = " + e);
        
//trim() method'u bir String'in baş ve sonundaki "space" karakterlerini siler, aradaki "space" karakterlerine dokunmaz.
        //trim() metodu bastan ve sondan space siler

        String f = e.trim();
        System.out.println("f = " + f);//"Tom Hanks"
        String h = "Jbva";
        String i = "Java";

 //  h.compareTo(i); kod iki tane Stringi alfabetik (lexicographic) olarak karsillastirir.
        //Buyuk ,kucuk harfe duyarlidir
        //Buyuk ,kucuk harfe duyarli olmasini istemezsek h.compareToIgnoreCase(i); kullanabilirsiniz
        //h.compareTo(i); kodda "h" nin alfabetik sirasindan "i" nin alfabetik sirasini cikartir.
        int k = h.compareTo(i);
        System.out.println("k = " + k);

  // repeat() metodu stringi istedigimiz sayi kadar tekrar eder.Biz burda 5 kere tekrar istedik
        // a.concat(a).concat(a).concat(a).concat(a).concat(a); Burda oldugu gibi tekrar tekrar yazmak yerine repeat kullanilir.
        //Java Document e ulasmak icin: kodun icine girme mac commend e basili tutun
        //repeat(0): empty return eder.
        String n = a.repeat(4);
        System.out.println("n = " + n);



    }
}
