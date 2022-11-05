package day18arraylistspassbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {

        // Gomlek ==100tl
        // ogrenci = -10>>>> 90tl
        /// Gazi =20tl >>> 80Tl
        // orjinal urun fiyati degismedi, Buna dikkat etmek gerekir.

        // Bazi isleri yaparken orijinal degeri korumaliyiz
        // Java variablenin orijinal degrlerini korumak ister
        // Varibale metodlar icinde kullanildiginda ,Java metod`un icine orijinal degeri koymaz, o degerin kopyasini uretir ve metoda o kopyayi yollar,
        // Metod kopya ustunde degisiklik yapar dolayisiyla veriablenin orijinal degeri korunmus olur
        // Bu sisteme "Pass By Value" denir
        // Java "Pass By Value" kullanir
        // Bazi programlama dilleri orijinal degeri koruma altina almamistir.Java "Pass By Referance " kullanmaz
        // Bu isi developer lara birakmistir.
        // Bu tarz diller "Pass By Referance " kullanir

        int x = 5;
        System.out.println(x); //5
        change(x);  //15    //main metod sttaiktir,Bir metod static se icindeki hersey statik olmali
        // change italik oldu, statik oldugunu belli ediyor

        System.out.println(x); //5

        //2.metod:
        int ucret = 100;
        int kopya = indirim(ucret);
        System.out.println(kopya);//90 indirim yapildi.
        System.out.println(ucret);//100 orijinal deger
        //orijinal degeri degistirmek icin atama yapmak lazim
        // ucret = indirim(ucret);

    }

    public static void change(int a) {
        System.out.println(a * 3);
    }

    // void disindaki return type larda metod bodysi icinde "return" keyword kullanilmalidir.
    //2.Metod:
    public static int indirim(int gomlekUcreti) {

        return gomlekUcreti - 10;
    }

}
