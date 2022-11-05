package day24statickeywordencapsulation;

public class Test2 {
    public static void main(String args[]) {
        Test1 t = new Test1(11.5, 7, 9);
        t.powerSwitch();
        System.out.println(t.channelTuning(2));


          //Test1 t= new Test1(11.5,7,9);
           t.powerSwitch();
         System.out.println(t.decreaseVolume());


       // Test1 t = new Test1(11.5, 7, 9);
        t.powerSwitch();
      // System.out.println(t.width);

    }
}