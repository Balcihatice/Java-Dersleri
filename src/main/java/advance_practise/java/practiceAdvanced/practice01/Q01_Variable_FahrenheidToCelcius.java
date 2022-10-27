package advance_practise.java.practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheidToCelcius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9
        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheid degeri giriniz");
        double f = scan.nextDouble();


        double celcius = (f - 32) * 5 / 9;
        System.out.println(celcius);


        NumberFormat numberFormat = new DecimalFormat(",##");     //00 da olur
        String formattedC = numberFormat.format(celcius);
        System.out.println(formattedC);//13,33


     //tekrar sayi yapalim
        double doubleC = Double.valueOf(formattedC+1);//Concatination
        System.out.println("double:" + (doubleC+1));//matematiksel toplama




    }
}
