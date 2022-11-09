package day03typecastingwrapperscanner;

public class TypeCasting01 {
    // Type casting: bir nümerik data tipini diğer nümerik data tipine çevirmek demektir
    // byte<short<int<long<float<double

    //   NOT: Küçük data tipinden büyük tada tipine çevirmeye "Auto Widening" denir
    //  NOT: Büyük data tipinden küçük tada tipine çevirmeye "Explicit Norrowing" (acik seçik daraltma)denir


    public static void main(String[] args) {
        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int) population; // büyük kutu küçük kutuya konmaz.bu yüzden (int) ekledik
        // EXAMPLE 1 : shortu daouble çevirme
        //  2) flooat byte

        short numOfStudents = 235;
        double newNumOfStudent = numOfStudents; // auto widening

        float sayi = 12.99f;

        byte newSayi = (byte) sayi;  // explicit norrowing

        System.out.println(newSayi); // 12  jada yumarlama işlemi yapmaz

        // java ondalık sayıyı tam sayıya çevirirken yuvarlama işlemi yapmaz
        // java ondalık sayıyı tam sayıya çevirirken  ondalık kısmını siler

        int number = 515;

        byte newNumber = (byte) number;

        System.out.println(newNumber); // 3

        // byte -128---127 bu sınırda değil. java 515 i alır bu bytın içindeki sayıya böler KALANI RETURN EDER,
        //515/256=2 kalan= 3 (modüler aritmetik)
        // bize '3' ü verdi..BİZ BUNU KULLANMAMAYA ÇALIŞIYORUZ


        int num = 510;    // 510/256= 1 kalan : 254 java 510 u 256 ya bölerken 2 kere var diyor çıkarma yaparken 510-512=-2 diyor

        byte newNum = (byte) num; //  modüler aritmetikte 254 ile -2 aynı şey demektir ( 254=-2(mod256))

        System.out.println(newNum);


    }
}
