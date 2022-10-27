package day11loops;

public class NestedLoop01 {
    public static void main(String[] args) {

/* Example 1) asagidaki ciktiyi verecek kodu yazin
            1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */
// Scoop : Kapsam demek------- out of scoop = kapsam disi

        for (int i = 1; i < 5; i++) {  // week( 1 ay 4 hafta ondan 5 te bitirdik)
            System.out.println("Week "+ i);

            for (int k = 1; k < 8; k++) {
                System.out.println("Day: " + k);
            }
// uzun surede calsir ,mumkun oldugu kadar kullanmayiz.intervievde nested loop sorar.
        }
    }
}

