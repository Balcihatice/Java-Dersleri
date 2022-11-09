package day27exceprions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    // Bir text file`daki text`i okuyan kodu yaziniz

     /*
    1)  FileInputStream fis = new FileInputStream("src/main/java/day27exceprions/File1.txt");
    "new" den sonraki kisim hata verir.Cunku biz java`ya verilen adrestekidosyaya git dedik.
    Java iki endiseye kapildi. i) Ya adres yanlissa  ii)Ya verilen adreste dosya yoksa.
    Biz "method isminden " sonra "throws FileNotFoundException" yazarak, Java`ya bu iki endise duydugun durum olursa
    "Exception At" dedik.
    2)  while ((k = fis.read()) != -1){} yazdigimizda read() metodu hata verir.Cunku biz Java ya dosyadaki karakterleri
    oku dedik. Java bir endiseye kapildi.Ya okunmasi gereken karakterler Javanin bilmedigi karakterlerse?
    Biz method isminden sonra "throws IOException" yazarak java`ya bu durumla karsilasinca "Exception At" dedik.

    3) Method isminden sonra "throws IOException" yazarsak Java "throws FileNotFoundException"`i siler.Cunku;
    "IOException" , 'FileNotFoundException" i kapsar."IOException" ,"FileNotFoundException"`in parent`idir.
    onun yaptigi herseyi yapabilir o yuzden "IOException" varken   "FileNotFoundException"`a gerek yoktur.

    "IOException", "Input Output Exception" demektir.

    4) Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken daha run butonuna basmadan ortaya cikti.
    Bu tarz Exception`lara "Compile Time Exception" denir. diger adlari "Checked Exception" denir.

    "Compile Time Exception" kesinlikle halledilmelidir(Exception Handling), hakletmeden kod yazmaya devam etmeyiniz


      */

    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();

       //2. Yol icin;
        readTheText();
    }
//1. yol exceotion atinca diger kodlarin calismasi dursun dersek;
    public static void readTheTextFromTheFile() throws IOException {  //eger adres yanlissa beni ara, dosyayi bulamazsan beni ara

        //Stream nehir, akis demektir.Dosyalari alma Clasina gittik

        FileInputStream fis = new FileInputStream("src/main/java/day27exceprions/File1.txt");

        //dosya adresini vermeliyiz. File.txt sagtik referance kopyala

        int k = 0;
        while ((k = fis.read()) != -1) {//fis.read():dosyaya gider ve aski degerlerini okumaya baslar.
            System.out.print((char) k);
        }

    }
     //read file gider j yi alir aski degerini okur k nin icine koyar, -1 e esit mi bakar true ise 74 ekrana yazdirilir

    //2.yol Exception atinca kodlar calismaya devam etsin;(ikinci yol daha cok tercih edilir).

    public static void readTheText() {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day27exceprions/File1.txt");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        }  catch (FileNotFoundException e) {
            System.out.println("Dosyanin adresi veya varligi ile ilgili problem var");
        } catch (IOException e) {
            System.out.println("Dosyada okunamayan bir karakter var");
        }
    }
}