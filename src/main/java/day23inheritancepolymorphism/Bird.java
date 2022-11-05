package day23inheritancepolymorphism;

public class Bird extends Animal{
   /*
   "final" keyword nedir?

   "final" keyword i) variable`lerde kullanilabilir
                        public final int age = 12;
                        a) atanan deger degistirilemez
                        b)deger atamasi yapmak zorundayiz

                  ii) Method`larda kullanilabilir
                      public final int add(){
                      return a+b;
                      }
                      a)final metodlarin body`si ASLA degistirilemez,
                      b) final metodlar overrid edilemezler
                      Dolayisiyla o method override edilemez.

                 iii) Class`larda kullanilabilir
                 Bir Class`i final yaparsak o Class`i kisirlastirmis oluruz,
                 final Class`in childi olamaz (extend edilemez)
                 ama final class child olabilir.


    */
}
