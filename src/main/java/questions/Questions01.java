package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questions01 {
    public static void main(String[] args) {
        /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.


        - Kullanıcıdan int öğelerini girmesini ve listeye öğeler eklemesini istemek için kodu yazın
        - Kullanıcıdan kaldırılacak öğeleri girmesini isteyin, ardından o öğeyi listeden kaldırın.
        - Kullanıcıdan güncellenecek öğeyi girmesini ve ardından güncellemesini isteyin.
  */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen listeye eklenecek verileyi giriniz...");
        int not1 = input.nextInt();
        int not2 = input.nextInt();
        int not3 = input.nextInt();
        int not4 = input.nextInt();
        int not5 = input.nextInt();

        List<Integer> notlar = new ArrayList<Integer>();
        notlar.add(not1);
        notlar.add(not2);
        notlar.add(not3);
        notlar.add(not4);
        notlar.add(not5);
        System.out.println("Ogrenci Notlari = " + notlar);

        System.out.println("Lutfen silinecek verinin index'ini girin");
        int silinecekVeri = input.nextInt();
        notlar.remove(silinecekVeri);
        System.out.println("Yeni notlar = " + notlar);

        System.out.println("Lutfen guncelleme yapılacak veriyi girin...");
        int guncelNot = input.nextInt();
        notlar.add(guncelNot);

        System.out.println("Guncel Notlar = " + notlar);


    }
}
