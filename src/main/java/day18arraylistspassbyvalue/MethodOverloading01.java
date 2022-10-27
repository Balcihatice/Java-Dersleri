package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    /*
    Method overlooding nasil yapilir,?
    1) Method isimleri ayni olmalidir
    2) Method parametreleri farkli olmalidir
        i) Parametre sayilari degistirilebilir
        ii) Prametrelerin data type larini degistirebiliriz
        iii) Parametrelerin yerlerini data tipleri farkliysa degistirebiliriz
    3) Metodun ismi ve metodun parametreleri Metodun Imzasidir (Method signature)
    4) Isim ve data disinda neyi degistirisen degistir,
    java bunu degisiklik kabul etmez,public,private bakmaz
     */

    public static void main(String[] args) {

        add(3, 5);
        add(3, 5.0);

    }

    public static void add(int a, int b) {

        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {

        System.out.println(a + b + c);
    }

    public static void add(int a, double b) {

        System.out.println(a + b);
    }

    public static void add(double a, int b) {

        System.out.println(a + b);
    }


}
