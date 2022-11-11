package day21accessmodifiersinheritance;

public class StudentRunner {

    public static void main(String[] args) {

        Student std1 = new Student();
        System.out.println(std1.stdName);

        System.out.println(std1.address);

        System.out.println(std1.email);

        // stdNId private oldugundan buradan ulasamadik
        // private olan variable ve method`lar sadece bulundugu class`tan ulasilabilirler.
    }

}
