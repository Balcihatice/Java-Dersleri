package day24statickeywordencapsulation;

// Encapsulation: "Data Hiding(Gizlemek)" demektir.
// Data`yi Nicin gizlersiniz ? Data`yi dis etkenlerden korumak icin.
// Data`yi nasil gizlersiniz? Acces modofier`ini "private" yaparak gizlerim.
// Data`yi gizledikten sonra baska Class`lardan okumak istersen ne yaparsin?
// "get" method`lar(getter) olusturarak gizledigimiz data`lari okunur hale getirebiliriz.
// Data`yi gizledikten sonra baska Class`lardan degistirmek istersen ne yaparsin?
// "set method"lar(setter) olusturarak gizledigimiz data`lari degistirebiliriz.
// Variable`in data type`i ne ise get method`un return type`i ayni olmalidir.
// get methodlar`i isimlendirirken "get+<variable name>" , ancak variable`in data type`i boolean ise "is+<variable name>"

public class Student {

    public String stdName = "TomHanks"; //"Data Hiding(Gizlemek)" yaptik.
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;


    public String getStdId() {

        return stdId;
    }

    public double getGpa() {

        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {

         this.stdId = stdId;
    }

    public void setGpa(double gpa) {

        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {

        this.retired = retired;
    }
}
