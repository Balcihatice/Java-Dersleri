package day07ternarystringmanulation;

public class NestedTernary01 {
    public static void main(String[] args) {

    /*İNTERVEV SORUSU
    verilen yılın Leap year (artık yıl) olup olmadıgını
    kontol eden kodu yazınız.
    İ) yıl 100 bolunurse 400 e bolunmelidir ==>> 1600+  1800-
    ii)yıl 100  e bolunmezse 4 e bolunmelidir==>> 1996+  2001-
     */
        int year = 2001;

        String leap = year % 100 == 0 ? (year % 400 == 0 ? "Leap year" : "Leap year degil") : (year % 4 == 0 ? "Leap year" : "Leap year degil");

        System.out.println(leap);

 //Example 2: aşagıdaki kurallara göre password ün gecerli olup olmadıgını kontol eden kodu yazınız
 // i)) sekiz karakterden fazla olmalıdır
 // ii) 8 karakteden fazla karakter varsa ilk harfi "i" olmalıdır
 // iii) 8 karakterden az karakter varsa ilk harfi "K" olmalıdır

        String pwd = "i2a3ed54";

        char ilkHarf = pwd.charAt(0);

        String gecerli = pwd.length() < 8 ? (ilkHarf == 'K' ? "Gecerli" : "Gecerli degil") : (ilkHarf == 'i' ? "Gecerli" : "Gecerli degildir");
        System.out.println("Gecerli Password = " + gecerli);
        //ilk condition da >= gibi iki işlem yazmıyoruz


    }
}
