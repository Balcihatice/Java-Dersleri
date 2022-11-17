package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
    1)HashTable bir map`tir
    2)HashTable entry setleri herhangi bir siralamaya tabii tutmaz.
    3)HasTable,HashMap'lerden daha yavaştır çünkü HasTable lar thread-safe(aynı andan birden fazla iş yapabilme becerisi)
    ve synhronize'dir(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir.)
    4)
     */
    public static <HashTable> void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);

        System.out.println(countryPopulations);//{USA=400000000, Turkey=9000000, Germant=83000000}

        //countryPopulations.put(null,90000000);//NullPointerException
        //countryPopulations.put("France", null);NullPointerException
  /*NOT Hashmap ile Hashtable farki nedir?
        i)thread-safe(aynı andan birden fazla iş yapabilme becerisi)
        ve synhronize'dir
        ii)
        */

        Hashtable<String, Students> myStudent = new Hashtable<>();
        myStudent.put("Math", new Students("Tom Hanks", "th@gmail.com", 21, true));
        myStudent.put("Science", new Students("Marry Star", "msh@gmail.com", 32, false));
        System.out.println(myStudent);//{Math=Students{name='Tom Hanks', email='th@gmail.com', age=21, success=true}}

        String name = myStudent.get("Math").name;
        System.out.println(name);//Tom Hanks


        int age = myStudent.get("Math").age;
        System.out.println(age);//21









    }
}
