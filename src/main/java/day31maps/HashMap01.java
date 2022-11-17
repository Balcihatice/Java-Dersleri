package day31maps;

import java.util.*;

public class HashMap01 {
//metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.

//Key`ler unique`dir.
//Map'lerde key kismi tekrarsiz data icerir.Null tekrarsiz olarak kullanilir,
//Value kismi unique olmak zorunda degildir.tekrarli olabilir. Null bircok kere kullanilabilir.
//Map`de Eleman kavrami yerine "EntrySet" ifdesi kullanilir.map in 2 tane entry var deriz
//HashMap`ler rastgele sirama yaparlar,SuperFast`tir.


    public static void main(String[] args) {

        HashMap<String, Integer> strudentAges = new HashMap<>();

        strudentAges.put("Ali", 12);
        strudentAges.put("Veli", 13);
        strudentAges.put("Kenan", 14);
        strudentAges.put("Rose", 12);
        System.out.println(strudentAges);//{Kenan=14, Veli=13, Rose=12, Ali=12}

        strudentAges.put("Ali", 23);//{Kenan=14, Veli=13, Rose=12, Ali=23}
        //Ayni key degerini tekrar ekledigimizde hata vermez,"overwrite" eder.
        System.out.println(strudentAges);

        //key`lerde null tekrarsiz kullanilir,
        strudentAges.put(null, 58);
        System.out.println(strudentAges);
        strudentAges.put(null, 66);
        System.out.println(strudentAges);

        strudentAges.put("Ayhan Isik", null);
        System.out.println(strudentAges);//{null=66, Ayhan Isik=null, Kenan=14, Veli=13, Rose=12, Ali=23}

        strudentAges.put("Sadri Alisik", null);
        System.out.println(strudentAges);//{null=66, Ayhan Isik=null, Kenan=14, Sadri Alisik=null, Veli=13, Rose=12, Ali=23}


        HashMap<String, String> me = new HashMap<>();
        me.put("Su", "Icilebilen,seffaf akiskan sividir.");
        System.out.println(me);

        //Map`ten sadece key`ler nasil alinir?

        Set<String> keys = strudentAges.keySet();
        System.out.println(keys);//[null, Ayhan Isik, Kenan, Sadri Alisik, Veli, Rose, Ali]

        Collection<Integer> values = strudentAges.values();
        System.out.println(values);//[66, null, 14, null, 13, 12, 23]

        //Belli bir key`e ait value nasil alinir?

        Integer roseAges = strudentAges.get("Rose");
        System.out.println(roseAges);//12

        //Example: Tum Integer yaslarin ortalamasini yazan kodu yaziniz.
        Collection<Integer> age = strudentAges.values();

        int sum = 0;
        int counter = 0;
        for (Integer w : age) {
            if (w != null) {
                sum += w;
                counter++;
            }
        }
        double ort = sum / counter;

        //Example 2: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.

        Set<String> names = strudentAges.keySet();
        int sum1 = 0;
        for (String w : names) {

            if (w != null && !w.startsWith("A")) {
                sum1 += w.length();
            }
        }
       //Null`i lenght() ile kullanirsak hata aliriz

        System.out.println(sum1);

        //remove("Rose", 12) key`si ajda ve value`su 76 olan Entry siler ve size boolean return eder
        boolean result = strudentAges.remove("Rose", 12);
        System.out.println(result);

        Integer result1 = strudentAges.remove(null);
        System.out.println(result1);//sildigi null`in value`su 66

        //Key varsa value ver, yoksa sizin istediginiz degeri verir
        Integer result2 = strudentAges.getOrDefault("Sadriye", 0);
        System.out.println(result2);


        //Value null ise ekleme yapar,value null degilse ekleme yapmaz.
        Integer result3 = strudentAges.putIfAbsent("Ayhan Isik", 100);
        System.out.println(result3);
        System.out.println(strudentAges);//{Ayhan Isik=100, Kenan=14, Sadri Alisik=null, Veli=13, Ali=23}

        Integer result4 = strudentAges.put("Ayhan Isik", 100);
        System.out.println(result4);
        System.out.println(strudentAges);

        //Key yoksa ekleme yapar
        Integer result5 = strudentAges.putIfAbsent("Acun Ilicali", 200);
        System.out.println(result5);
        System.out.println(strudentAges);

        //.replace() methodu value`lari degistrimek icin kullanilir.

        strudentAges.replace("Acun Ilicali", 49);//yasi 49 ise degistir.
        System.out.println(strudentAges);


        // replace() methodu value`lari key value`yu kontrol ettikten sonra degistirir
        // yas 47 ise degistir yoksa degirtirme
        strudentAges.replace("Acun Ilicali", 47, 53);
        System.out.println(strudentAges);


        //Example3: Map herbir entry`i ekrana farkli bir satirda olacak sekilde yazdiriniz
       //.entrySet() methodu Map`teki elemanlari bir Set`in icine koyarak bize verir.
        Set<Map.Entry<String, Integer>> entryies = strudentAges.entrySet();
        for (Map.Entry<String, Integer> w : entryies) {//{Ayhan Isik=100, Kenan=14, Sadri Alisik=null, Veli=13, Acun Ilicali=49, Ali=23}
            System.out.println(w);                    // 1.eleman       2.eleman    3.eleman        4.eleman     5.eleman       6.eleman
        }



    }
}
