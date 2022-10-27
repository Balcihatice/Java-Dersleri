package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //Example1 : Anlik tariihi(Current Date==Suanki tarih) ekrana yazdiran kodu yaziniz

        LocalDate currentDate = LocalDate.now();//bulundugun mekandaki anlik tarihi verir.
        System.out.println(currentDate);

        //Example 2) Anlik zamani (Current Time) ekrana yazdiralim
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        //Example 3) anlik tarigi ve anlik zamnai yazdiralim
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);  //2022-10-21T20:45:12.643153

        //Example4) japonya daki anlik tarih ve zamani yazdiriniz
        LocalDateTime currentDateTimeJaponya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeJaponya);//2022-10-22T02:50:47.568657

        //Istanbul
        LocalDateTime currentDateTimeIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeIstanbul);

        // Example 6) Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarhini hesaplayan kodu yaziniz

        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDaate = countDate.plusDays(789);//Mutlaka LocalTime atamasi yapmaliyiz
        System.out.println(retireDaate);

        //Example 7) Iki cocugunuzun dogum tarihleri arasindaki farki gun olaraak hesaplayan kodu yaziniz

        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);


        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);// Gun=2824
        //Example 8) tom ,Ali`den 3 yil 8 ay 13 gun sonra dogdu. Ali ise Veliden 1 yil 15 gun once dogdu
        // Tom`un dogum tarihi 18 Kasim 2011 ise veli ve ali`nin dogum tarihlerini bulunuz
        LocalDate tom = LocalDate.of(2011, 11, 18);
        LocalDate ali = tom.plusYears(3).plusMonths(8).plusDays(13);//2014-03-31
        System.out.println(ali);
        //Example 8) Istanbulun fethi ile cumhuroyetin kurulmasi arasinda kac ay olldugunu gosteren kodu yaziniz
        //29 Mayis 1452     29 ekim 1923>>Cumhuriyetin Kurulusu

        LocalDate fetih = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyet = LocalDate.of(1923, 10, 29);

        Long aySayisi = ChronoUnit.MONTHS.between(fetih, cumhuriyet);
        System.out.println(aySayisi); //5645

        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989, 5, 13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.Yol:
        if (day >= 21 && month == 3) {
            System.out.println("Koc");
        } else if (day <= 20 && month == 4) {
            System.out.println("Koc");
        } else if (day >= 21 && month == 4) {
            System.out.println("Boga");
        } else if (day <= 20 && month == 5) {
            System.out.println("Boga");
        }
        //2.Yol:
        if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
            System.out.println("Koc");
        } else if ((day >= 21 && month == 4) || (day <= 20 && month == 5)) {
            System.out.println("Boga");
        }

    }
}
