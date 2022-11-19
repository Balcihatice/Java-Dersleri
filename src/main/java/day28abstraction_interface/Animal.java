package day28abstraction_interface;

public abstract class Animal {
//Body`si olmayan methodlar abstruct method`dur.
   // Bir methodu abstract yapmak icin
    // i) method body`i sil
   // ii) abstract keyword kullan
//"abstract"methodlar "abstract "class icinde olmalidir.
   // Bir method abstract ise child mutlaka o methodu override etmeli
    public abstract void eat();


// abstract classlarda hem absract method hemde "concrete" method kullanilabilir
    public void drink() {
        System.out.println("Animals drink...");


    }

    // abstract "move" method olusturunuz

    public abstract void move();


}