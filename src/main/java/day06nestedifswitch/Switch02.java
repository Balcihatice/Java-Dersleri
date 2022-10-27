package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        Kullanıcıya ay ismi sorunuz ve kullanıcının
        verdiği ay isminden son aya kadar ekrana yazdırınız
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay ismini giriniz");
        String ay = input.next().toLowerCase();//ay ismi kücük harf mart oldu
//equalsIgnoreCase burda çalışmak çünkü eşitlik bakmıyoruz
        switch(ay){ //switch içi sitring case lerde string
            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eylül":
                System.out.println("Eylül");
            case "ekim":
                System.out.println("Ekim");
            case "kasım":
                System.out.println("Kasım");
            case "aralık":
                System.out.println("Aralık");
                break;// bunu yazmazsak her defasında default kodunu yazar
            default:
                System.out.println("Gecerli ay ismi giriniz...");
        }

    }
}
/*
toLowerCase() Metodu bir string deki tüm karakterleri kücük harfe çevirir
toUpperCase() Metodu bir string deki tüm karakterleri büyük harfe çevirir
 */