package day26exceptions;

public class  Exceptions02 {

    public static void main(String[] args) {
        char ch1 = getCharFromString("Java", 2);
        System.out.println(ch1); //v

        char ch2 = getCharFromString("Selenium", 8);// 8. index yok
        System.out.println(ch2);//StringIndexOutOfBoundsException = Eger bir Stringden characterler alirken olmayan bir index kullanilirsa
        // StringIndexOutOfBoundsException alinir.
    }

    //Bir Stringin istedigimiz herhangi bir karakterini bize veren method yazalim
    public static char getCharFromString(String str, int idx) {
        char c = ' ';//ilk verilen degerin ne oldugu onemli degil

        try {

         c=str.charAt(idx);

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Index ile ilgili bir problem olustu "+ e.getMessage());//Javanin kendi mesajini gormek icin e.getmessage() kullanilir
            //System.out.println(e.getMessage()); boylede java mesaji cagirilir

            e.printStackTrace();//detayli "log"(api`nin, adim adim ne yaptigini gosterir) icin dev`ler kullanir.
        }
        return c;
    //Bir hata oldugunda ne yaparsaniz? bizde log`lara bakarim deriz.

    }
}
