package day28abstraction_interface;

public class Accord implements Engine,Ac,Hood{


    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas...");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi technolgy");
    }

    @Override
    public void digital() {
        System.out.println("Uses digital AC");
    }

    @Override
    public void climate() {
        System.out.println("Cilmate");
    }


    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }
}
