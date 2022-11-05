package day23inheritancepolymorphism;

public class Math extends Courses {

    public void practise() {

        System.out.println("Solve questions");
    }

    public Math() {
        super("x");
        System.out.println("Constructor1");
    }

    public Math(int a) {
       this(); //ayni classtaki constructor`a git .hangisine paramtre olmayana git,
        // this() parametresiz oldugu icin parametsesiz constructori kullanir

        System.out.println("Constructor2");
    }
    //Ayni classin icinde bir construvtor kullandiktan sonra diger constructoru kullanmak istersek
    // this(); kullanacagiz

}
