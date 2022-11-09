package day26exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        double d = divideStringByTheNumOfTheChar("124");//41.0
        System.out.println(d);

        divideStringByTheNumOfTheChar(null);
    }

    //Stringdeki karaktersayisini bulan bir method yaziniz,Stringi Integer`a ceviriniz,sonra
    //integer`i karakter sayisina bolunuz.
//1.yol:

    public static double divideStringByTheNumOfTheChar(String str) {//124 verelim
        int lenght = 0;
        int i = 0;
        double sonuc = 0;
        try {
            lenght = str.length();//NullPointerException 'null" String ile 'Lenght()" kullanildiginda al ir
            i = Integer.valueOf(str);//NumberFormatException: icinde rakaamdan farkli karakter olan String`ler valueOf() ile kullanildiginda alinir

            sonuc = i / lenght;//AritmeticException: Bolen sayi sifir oldugunda aalinir.

        } catch (NullPointerException e) {

            System.out.println("===>>" + e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }
        return sonuc;
    }
//2.Yol:
    public static double divideStringByTheNumOfTheCharacter(String str) {//124 verelim
        int lenght = 0;
        int i = 0;
        double sonuc = 0;
        try {
            lenght = str.length();//NullPointerException 'null" String ilee 'Lenght()" kullanildiginda aliir
            i = Integer.valueOf(str);//NumberFormatException: icinde rakaamdan farkli karakter olan String`ler valueOf() ile kullanildiginda alinir

            sonuc = i / lenght;//AritmeticException: Bolen sayi sifir oldugunda aalinir.

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
        return sonuc;
    }
    // Parent Exceptions vardir diger bes exceptins`lar parent`in child `idir.
    //1)ArithmeticException
    //2)ArrayIndexOutOfBoundsException
    //3)NullPointerException
    //4)NumberFormatException
    //5)StringIndexOutOfBoundsException
// 3. Yol:
    public static double divideStringByTheNumOfTheCharacters(String str) {//124 verelim
        int lenght = 0;
        int i = 0;
        double sonuc = 0;

        try {
            lenght = str.length();//NullPointerException 'null" String ilee 'Lenght()" kullanildiginda aliir
            i = Integer.valueOf(str);//NumberFormatException: icinde rakaamdan farkli karakter olan String`ler valueOf() ile kullanildiginda alinir

            sonuc = i / lenght;//AritmeticException: Bolen sayi sifir oldugunda aalinir.

        } catch (NullPointerException e) {

            System.out.println("Null pointer`a ozel...");

        } catch (Exception e) {

            System.out.println("Diger tum Exceptionlar icin...");

        }
        return sonuc;

    }
}
/* Not1 : aralarinda parent-child relationship olan exception classlari multiple catch lerde
    kullanmak istersek child olan once kullanilmalidir. aksi halde hata verir.
    aralarinda parent-child relationship "olmayan" exception classlari multiple catch lerde
    kullanmak istersek siralamanin bir onemi yoktur.
*/