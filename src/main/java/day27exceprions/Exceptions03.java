package day27exceprions;

public class Exceptions03 {

    /*
    1) Java Exception`lar olusturarak developer`larin Java kurallarina uymalarini temin etmistir,
    2) Bizde Application uretirken kendi Exception`larimizi olusturarak diger developerlarin bizim ortaya koydugumuz
    kurallara uymalarini temin ederiz.
    3) Java`nin degil, Bizim urettigimiz Exception`lara "Custom Exception" denir.
    4) Custom Exceptin`larda "Run Time Exception" ve "Compile Time Exception" olabilir.
    5) Costum "RunTimeException " uretmek icin "extends RunTimeException" deriz
    6) Costum "CopmpileTimeException " uretmek icin "extends Exception" deriz

     */

    public static void main(String[] args) throws IllegalGradeException {

        IllegalGradeException ige = new IllegalGradeException("abc");

        printGrade(-60);


        checkNameFormat("Ali");

    }

    //Ogrenci notlarini yazdiranb bir method olusturunuz
    public static void printGrade(int grade) throws IllegalGradeException {

        if (grade<0 || grade>100){

          throw new IllegalGradeException("Grade 0 dan kucuk, 100 den buyuk olamaz");
      }else{

            System.out.println(grade);
      }
    }


    //Verilen ismin ilk harfinin buyk harf olmamasi durumunda  exception atan method yaziniz.
    public static boolean checkNameFormat(String name){

      if (name.charAt(0)>='A' && name.charAt(0)<= 'Z'){

          return true;
      }else{

          throw new IllegalNameException("Isimler buyuk harfle baslamalidir");
      }
    }
}
