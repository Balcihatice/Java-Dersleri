package day21accessmodifiersinheritance;

public class Student {

    /*
    Access Modifier
    1) public          2) protected            3)default            4) private
    halk kutuphanesi     bize cocuklara         sadece bir grup        kisiye ozel(sadece bulundugu classtan erisim)
    Note: Access modifier`lari genisten dara dogru sayiniz.
    Note : acces modifier`lari biere birer aciklayiniz
   //public her class`dan kullanilabilirler
   //protected olanlar baska package`den kullanilamaz.Ancak baska package`de child class icinden kullanilabilir.
   // 3)default  : access modifier yazmazsak o default olur.^^^ default olanlar baska (package) den kulllanilamazlar
   //private olanlar sadece olustuklari class icinde kullanilabilirler,

   Note: classlar icin hangi access modifierler kullanilabilir >>>
   >>>>>>>>>  public, default kullanilir , ama protected ve pritate kullanilamaz

     */
   //public her class`dan kullanilabilirler
    public String stdName = "TomHanks";

    //protected olanlar baska package`den kullanilamaz.Ancak baska package`de child class icinden kullanilabilir.

    protected String address = "Miami";


    String email = "th@gmail.com";      //Basina default yazinca hata verir.
    // 3)default  : access modifier yazmazsak o default olur.^^^
    //default olanlar baska (package) den kulllanilamazlar

    //private olanlar sadece olustuklari class icinde kullanilabilirler,
    private String stdId = "20206517004";


}
