package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practise(){
        System.out.println("Solve questions");
    }

    public Math(){
        super("Second");
        System.out.println("Constructor1");
    }

    public Math(int a){
        this();
        System.out.println("Constructor2");
    }
//Ayni classin icinde bir construvtor kullandiktan sonra diger constructoru kullanmak istersek
   // this(); kullanacagiz

}
