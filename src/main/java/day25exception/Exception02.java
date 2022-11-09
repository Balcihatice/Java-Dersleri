package day25exception;

public class Exception02 {

    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};
        getelementFromArray(arr, 2);//Veli

        getelementFromArray(arr, 0);//ali

        getelementFromArray(arr, 4);//ArrayIndexOutOfBoundsException

    }

    //Bir String Arrayden index elde edebilmek icin bir method olusturun
    public static void getelementFromArray(String arr[], int idx) {
        try {

            System.out.println(arr[idx]);

        } catch (ArrayIndexOutOfBoundsException e) {//hatayi yakala ve sunu yap diyerek hata clasina gittik

            System.out.println("Array index te bir problem meydana geldi");
            //Bu benim teknik olmayan aciklamam

            //Teknik olmayan aciklamaya bir detay ekleyelim
            System.out.println("Array index te bir problem meydana geldi====>" + e.getMessage());

            //exception ile ilgili detayli teknik mesaj verir
            e.printStackTrace();

            //hata mesajini diger mesajlardan ayirmak icin kullaniriz
            System.err.println("Array indexte bir problem yasandi");
        }
    }
}
