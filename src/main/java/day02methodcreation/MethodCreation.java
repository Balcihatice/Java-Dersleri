package day02methodcreation;

public class MethodCreation {
    public static void main(String[] args) {
        /*
      1)  public = acces modifier ,projenin heryerindn ulaşılabilir
      2)  static = Sonra konuşacağız
      3)  void = Metodlar harekettir,her hareket bir şey üretir
      koşsam ter üretirim.yaptıgımız hareketin ne çıkardıgını buraya yazarız
      yaptıgımız hareket int ise buraya int yazarız
      bazı metodlar vardır hiç bir şey üretmezler.ör: ekrana hello yazdırmak=ortada yeni bir data yok var olanı görünür yapıyoruz
     login gibi sadece tıklamalarda void kullanılır ,bunlar bize yeni data vermez
      Eger metod bir şey üretmiyorsa void yazılır
      >>>> void görünce bu metod yeni bir data üretmiyor diyeceğiz

      4)  main = metodun ismi,özel bir metod java oluşturdu.müdahale edemeyiz
      5)  String[] =Sonra ögreneceğiz
      6) args =
      7)  {} =Metod body

      main : okul aplication
      aile ,öğretmen,öğrenci,müdür var
      java gelir main i bulur bundan sonra diğer metodlar çalışır

      metodlar aksiyondur

         */
        System.out.println(toplamaYap(1.2, 5));

        // main metod statik ya içindeki herşey statik olmalı aşagıdaki metoda ekledik
        // a ve b yi yazmıyoruz sadece sayıları yazıyoruz
        // metodu isminden buldu, metoddaki a kutu gibidir,ilk sayı girilince bu kutu 1.2 olur
        // sayıları alınca return ne dir diye bakar ve o işlemi yaptırır ve sonucu yazdırırız yani işlem metodun içinde yapılır

        System.out.println(carpmaYap(2, 1.5, 6));

        System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 3.5, 4));

    }

    // Example1 : Toplama işlemi yapan bir metod oluşrurunuz
    public static double toplamaYap(double a, double b) {  // static sonradan eklendi çunkü herşey statik olmalıdır
        return a + b;                   // ave b yi topla onu return et,kullanıcıya ver

    }

    //Example2 : üç sayıyı birbiriyle çarpan metod
    public static double carpmaYap(double a, double b, double c) {

        return a * b * c;
    }
    //  Example3:üç sayıdan ilk ikisini toplayıp 3. ile çarpan metod olurşturup sonucı emrana yazdırın

    public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c) {

        return (a + b) * c;
    }
}
