package day25exception;

public class Exception01_IkinciYol {

    public static void main(String[] args) {

        // divide2(5, 0);
        divide2(12, 0);


    }

    private static void divide2(int a, int b) {
        //try-catchblock
        //if==>> try
        //else if ==>> catch==>> yakalamak
        //Metodun icinde yazilir

        try { //dene demek, if else gibi
            System.out.println(a / b);


        } catch (ArithmeticException e) {  // Aritmetikclasindan obje olusturduk. e:obje ismi

            System.out.println("Bolme isleminde bir hata olustu==>>" + e.getMessage());//e.getMessage() >> hatanin ne oldugunu mesaj olarak bize verir
            e.printStackTrace();//sadece mesaji yazma bu hatanin izini sur.(Tum kirmizi hata satirlari consolda gorunur)
            System.out.println("Kod calismaya devam ediyor");//Kodu okumaya devam eder,bunu gostermek icin yazdik

            System.err.println("Bolme isleminde bir hata olustu");//Konsolda hata mesaji oldugu belli etmek icin kirmizi yazar.
        }

    }
}