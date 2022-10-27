package day18arraylistspassbyvalue;

public class Varargs01 {
    public static void main(String[] args) {
       /*
      1) Farkli sayilardaki parametrelerle calisabilen bir metod olusturmak isterseniz
     vararks kullanmalisiniz
      2) Vararks arka tarafta array kullanir, Bu yuzden vararks larla calisirken
     Arraylerle calisiyor gibi davranabilirsiniz
      3) Vararks olusturmak icin "<Data type >...  <Vaararks ismi>"
      4) Bir metod da vararksin yaninda baska bir parametre kullanilabilir mi?
     Parametreyi ilk vararkstan sonraya koyarsak calismaz.
     Vararks en sonda olmalidir,
      5) Bir metod da birden fazla vararks kullanilabilir mi?
     Olmaz 4, madde ile celisir,Bir tane olmalidir, ilki dolmaz,dolmayinca ikinciye gecemezsin
      6) ... ister int e yasla ister a ya yasla ,Mutlaka ikisinin arasinda olmali,
       "<Data type >  ...<Vaararks ismi>"

 */


        int r1 = add(2, 3);
        System.out.println(r1); // 5

        int r2 = add(2, 3, 4);
        System.out.println(r2); // 9

        int r3 = add(2, 3, 4, 5, 6, 7, 8, 9, 10, 65, 43, 90);
        System.out.println(r3); // 252


    }

    //  iki sayinin toplamini return eden metod olusturunuz
    public static int toplamaYap(int a, int b) {
        return a + b;
    }

    //uc sayinin toplamini returneden metodu yaziniz
    public static int toplamaYap(int a, int b, int c) {
        return a + b + c;
    }

    //4 sayinin toplamini returneden metodu yaziniz
    public static int toplamaYap(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //   istedigimiz kadar sayiyi toplayabilecegizmiz metod olusturalum

    public static int add(int... a) {  //varargs== variable arguments >> dipsiz kuyu gibidir
        int sum = 0;                       //Vararksin arkasinda Array calisir.
        for (int w : a) {     //Bu metodla ister iki sayi topla , istersen milyon sayi topla sonucu verir.
            sum = sum + w;
        }
        return sum;
    }


}
