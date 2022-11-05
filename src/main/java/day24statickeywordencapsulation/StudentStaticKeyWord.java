package day24statickeywordencapsulation;

public class StudentStaticKeyWord {

    String name;
    static String college = "UNF";

    StudentStaticKeyWord(String n, String college){
        this.name = n;
        this.college = college;

    }

    public static void main(String[] args) {

        StudentStaticKeyWord s1 = new StudentStaticKeyWord("Mark", "UCF");
        StudentStaticKeyWord s2 = new StudentStaticKeyWord("Kevin", "FIU");

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.college);
        System.out.println(s2.college);

        //static variable'lara objeleri kullanarak mumkun ama tavsiye edilmez.

        //static variable'lara Class'i kullanarak ulaşmak daha iyidir.

        System.out.println(StudentStaticKeyWord.college);

    }

}
