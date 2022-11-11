package day21accessmodifiersinheritance.day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

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
