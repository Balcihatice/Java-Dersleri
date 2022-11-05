package day24statickeywordencapsulation;

public class StudentRunner {

    public static void main(String[] args) {

        Student std1 = new Student();

        System.out.println(std1.getStdId()); // TH202201
        System.out.println(std1.getGpa());  //3.8
        System.out.println(std1.isRetired()); //false




       //set() metodu ile obje araciligiyla vaariable`lara yeni atama yapalim.
        std1.setStdId("AB");
        System.out.println(std1.getStdId());


        std1.setGpa(4.0);
        System.out.println(std1.getGpa());


        std1.setRetired(true);
        System.out.println(std1.isRetired());


        //Yenibir object olusturalim
        Student std2 = new Student();
        System.out.println(std2.getStdId());//TH202201
        //Object Class`in koplasidir. Object Hersey sifirdan baslattigi icin ilk Id geldi.

        // Bir objeyi set ile degistip degistirp 1000 obje gibi kullanabiliriz.






    }
}
