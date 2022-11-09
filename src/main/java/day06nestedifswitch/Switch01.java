package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan gun sayısını alınız ve gün ismini ekrana yazdırınız
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun sayısını girin");
        byte gun = scan.nextByte();

        if (gun == 1) {
            System.out.println("Pazar");
        } else if (gun == 2) {
            System.out.println("Pazartesi");
        } else if (gun == 3) {
            System.out.println("Sali");
        } else if (gun == 4) {
            System.out.println("Carsamba");
        } else if (gun == 5) {
            System.out.println("Persembe");
        } else if (gun == 6) {
            System.out.println("Cuma");
        } else if (gun == 7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Geçerli gun sayisi giriniz...");
        }

           //switch in içinde int varsa case lerde int olur (case 1)
        // ücten fazla durum varsa switch önerilir

        switch (gun) {
            case 1:  //Durum
                System.out.println("Pazar");
                break;  //mola
            case 2:
                System.out.println("Pazarteai");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("Carsamba");
                break;
            case 5:
                System.out.println("Persembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default: //yukardaki durumlar dısı her durum
                System.out.println("Gecerli gun giriniz");
        }   // buraya berak yazamayız .java zaten "default" tan sonra bitirecek
    }

}