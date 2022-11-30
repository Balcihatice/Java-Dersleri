package day24statickeywordencapsulation;

public class Try {

    int a = 10;

    public static void main(String[] args) {

        Try tr1 = new Try();
        Try tr2 = new Try();

        tr1.a = 12;
        tr2.a = 13;

        System.out.println(tr1.a);
        System.out.println(tr2.a);



    }
}
