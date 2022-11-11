package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    /*
                           "throw" ile "throws" arasindaki farklar nelerdir?
           1)"throw" method'un body'si icinde kullanilir. "throws" ise method'un isminden sonra kullanilir.
           2)"throw" dan sonra object olusturulur."throws" dan sonra ise sadece Exception Class'in ismi yazilir.
           3)"throw" method'un icinde istedigimiz yerde Exception uretmek icin kullanilir.
           "throws" ise var olan checked Exception'i atmak icin kullanilir.
           4)"throw" dan sonra sadece bir tane Exception olabilir.
            "throws" dan sonra 1 den fazla Exception olabilir.
        */
    public static void main(String[] args) {

        readFileLineByLine();
    }

    public static void readFileLineByLine() {
        try {
            //BufferedReader dan olusan obje new FileReader() constructoru ile dosyayi satir satir okur.
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/day27exceprions/File1.txt"));
            String line = br.readLine();

            while (line != null) { //satir bos degilse oku
                System.out.println(line);//okumayi yapip yazdirdi

                line = br.readLine();//bir sonraki satiri oku line`a ata
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis" + e.getMessage());

        } catch (IOException e) {
            System.out.println("Okunamayacak karakter ya da karakterler var" + e.getMessage());

        }
    }
}
