package day04ifstatement;

public class IfStatemens01 {
    public static void main(String[] args) {

        // If it rains I will cansel picnic
        //If statement belli kodları belli şartlara bağlı olarak çalıştırmaya yarar

        // Example:  Sayı pozitif ise ekrana pozitif yazdırın
        int s = 12;
        if (s > 0) {
            System.out.println("Pozitif");
        }
        //Example 2: verilen character büyük harf ise ekrana büyük harf yazdırın

        char ch = 'V';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf");
        }
    /*
       && end sadece boolean ile kullanılır
       true true olması şart ,yoksa dogru sonuç alamayız
       end işlemi mükemmelliyetçidir
       true sonucunu alabilmek için herşey true olmalıdır
     */
        // Example 3:
        int n = -134;

        n = Math.abs(n);// matematik calasına git abs(mutlak deger) sini al,buldugun sonucu 'n' ye koy

        if (n >= 100 && n <= 999) ;
        System.out.println("uc basamakli");

        // Example 4:verilen sayı çift sayi ise ekrana çift yazdır
        //2 ile tam bölünnenler çift sayıdır
        // % macılıs : bize kalanı verir

        int p = 13;

        if (p % 2 == 0) {
            System.out.println("Cift sayi");

        }
        //  Example5: verilen sayı 300 den kuyuk 1200 den bucukse "harika sayı" yazdırın
        int r = 250;

        if (r < 300 || r > 1200) {
            System.out.println("Harika sayi");
        }
        // veya işlemi polyanna gibi ikiside false olursa çalışmaz diğer tüm durumlarda kod çalışır
    }
}
