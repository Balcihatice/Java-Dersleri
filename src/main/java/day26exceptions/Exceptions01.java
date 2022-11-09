package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5);//128

        String st = "1a2b";
      int r = convertStringToInteger(st); //eger icinde rakamdan farkli karakter barindiran bir stringi valoOf()metodu kullanarak int`e cevirmek
        System.out.println(r+10);    // istersek NumberFormatException aliriz.
    }

    //  Stringi int e cevirelim
    public static int convertStringToInteger(String str) {

    // return Integer.valueOf(str);bunu try icine aldik ve bir konteynera koyduk

      int i = 0;
//Herhangi bir satirda exception atilirsa, java direk catch bolumune gecer,try icindeki sonraki kodlari calistirmaz.
      try{
          i= Integer.valueOf(str); //bunu yapmayi dene yapamazsa NumberFormatException atar.
          System.out.println("Burasi try bolumu");

      }catch (NumberFormatException e){  //yapamazsan beni ara , ben cozum bulacagim

          System.out.println("Rakam olmayan karakter iceren Stringler Integer`a cevrilemez");
      }

      return i;

//try da hersey problemsiz calisirsa catch calismaz,eger hata varsa catch devreye girer.




    }
}
