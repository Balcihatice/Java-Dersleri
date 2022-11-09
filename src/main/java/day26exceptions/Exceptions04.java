package day26exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

       int age = -25;
        try {
            printAge(age);//kullandigimiz kod hangi exceptini atarsa catch icine o hatanin adi yazilir.
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());// getmessage throw u yazdirir
        }

    }


    //yasi ekrana yazdiran bir method olusturunuz

    public static void printAge(int age) {

        if (age < 0 || age> 200) {
            throw new IllegalArgumentException("Yas negatif olamaz veya 200 den buyuk olamaz");//aplication durur,diger kodlar calismaz.
        }
        System.out.println(age);//Exceptions atilinca bu satir calismaz
    }

}
