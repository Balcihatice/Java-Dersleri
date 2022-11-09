package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan işlem ve iki tane sayi alarak işlemin sonıucnu
        ekrana yazdıran basit bir hesap mak. yapınız
         */
        // NOT:switch (içinde yani) te sadece  int ,byte,short,char,String data type kullanılabilir
        // NOT:switch (içinde yani) boolean ,double,float,long  kullanamayız.
        // Eger üçten fazla durum varsa switch tercih ederiz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen İslemi giriniz : +,-,*,/,%,");
        char islem = input.next().charAt(0);

        System.out.println("Ilk sayıyı giriniz");
        double ilk = input.nextDouble();
        double ikinci = input.nextDouble();

        switch (islem){
            case '+':
                System.out.println(ilk + ikinci);
                break;
            case '-':
                System.out.println(ilk - ikinci);
                break;
            case '*':
                System.out.println(ilk * ikinci);
                break;
            case '/':
                System.out.println(ilk / ikinci);
            case '%':
                System.out.println((ilk * ikinci)/100);
                break;
            default:
                System.out.println("Bu islem tanımlı degil...");
        }
         String name = "Rose";
         String surName = "balci";
         System.out.println(name.concat(surName));


    }
}
