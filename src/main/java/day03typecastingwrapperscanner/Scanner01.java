package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Kullanıcıdan data almaya yarar, Scanner kullanıcı ile etkileşimi sağlar
        // Scanner bir java class'idir bu classı kullanabilmek için import etmek gerekir.
        // java kocaman dünya, içinde library ler var , Biz ilk önce util kütüphanesini kullanacağız
        // Util : Kullanılacak faydalı şeyler
        // Util içinde class lar var...
        //Bu classlardan birisi scanner classdır

        // Kullanıcıdan data almak için yapılması gerekenler
        //1) Scanner classından object oluşturun,

        Scanner input = new Scanner(System.in); // Scanner classından object oluşturduk.

        //2) Kullanıcıya ne yapacağını söyleriz

        System.out.println("Lütfen yasını gir...");

        //3) Memoryde yaş la alakalı bir yer oluşturmalıyız

        byte age = input.nextByte();

        System.out.println("Hey kullanıcı senin yasın " + age);


    }
}
