package day14arraysforeachloop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    // Arrayslerin icine sadece primitive data type ve reference(adres) lar yerlestirilebilir.


    public static void main(String[] args) {

        String str[] = new String[3];
        str[0] = "Java"; //Heap memory de alan olustu , icine java konuldu. Adresi(reference) stack memorye konuldu
        str[1] = "did"; //Heap memory de alan olustu , icine java konuldu. Adresi stack memorye konuldu
        str[2] = "surprised you";

        System.out.println(Arrays.toString(str)); //arrayi stringe cevir yazdir.
        //Biz adresi degil stringi istedigimiz icin consola string geliyor.

//Example : String bir array olusturunuz ve "toT" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr) {
            System.out.print(w + " ");//elemanlarin hepsini yazdirir
            //soutu yukari yazdik once yazdir sonra gerekiyorsa loopu kir
            if (w.equals("Tom")) {
                break;
            }
           // System.out.print(w + " "); //tomdan oncekini yazar.
        }

//arrayin kendisini yazdirirsak consolada araya virgul koyar .Tek tek yazdirirsak virgul olmaz
        System.out.println();

// //Example 2 : String bir array olusturunuz ve "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w : brr) {

            if (w.equals("Tom") || w.equals("Jane")) {
                continue;// Onu bosver yazma digerlerini kontrol et. Yukarisi false verirse continue calismaz.break loopu kirar
                // biz loopu kirmak istemiyoruz,continue loopu kirmaz onu gec yazdirma der (Bu yuzden break kullanmadik)
                // ve jane ve tom yazdirilmaz.
                //True ise continue yazdirir.
                //False ise break direk loopu kirar.
            }
            System.out.print(w + " ");// once kontrol  et sonra yazdir.
        }

// Example 3) Kullanici ile beraber bir array olusturunuz.Ve icine data ekleyiniz.
        // Bir ogretmenin sinifindaki ogrencilerin isimlerini applicatiouna yuklemesini saglayan
        // kodu yaziniz
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz "); //Kac ogrenci ismi lazim bildirmeliyiz yoksa array olusmaz.
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];  // normalde 5 diye biz yazardik ,Burada kullanicidan gelen degeri yazdik
        System.out.println("Girisi sonlandirmak icin Q harfine basiniz");

        for (int i = 1; i <= numOfStd; i++) {   //1. ogrenci ,2.ogrenci Burdaki sira numarasidir. Asagida index var.

            System.out.println("Lutfen " + i + " . ogrencinin ismini giriniz");  //Dinamik mesaj veriyoruz.
          //  System.out.println("Girisi sonlandirmak icin Q harfine basiniz,Devam etmek icin herhangi bir tusa basin");

            String stdName = input.next();

            //diyelimki 150 isim var ve 20 den sonra ara verdi //Bu islem ilk 20 yi kaydetmek icin yazildi

          if (stdName.equalsIgnoreCase("Q")) {
              break;
          }
            names[i - 1] = stdName; // kullanicidan aldigin datayi direk arraye koy. i-1 = index

       //Kullanicidan aldigimiz datayi direk arraye koyduk.namesin indexi sifirdan baslayacagi icin (i-1) dedik.
//String names = input.next(); seklinde yazarsak asagilarda tekrar tekrar kullanabilirdik.
        }
        System.out.println(Arrays.toString(names));

//Not foreach array lerle kullnailir burda array yok ,olusturmaya calisiyoruz


    }
}
