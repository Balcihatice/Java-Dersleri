package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    //INTERVIEVDE SORULUR
        /* ArrayListler ayni data type sahip birden fazla datayi depolamak icin kullanilir.
         INTERVIV SORUSU .>>  Array ile ArrayList arasindaki fark nedir,

      1) Aarray olustururken array`in icine kac tane elemaan koymamiz gerektigini soylemeliyiz
      Soyledigimiz eleman sayisindan fazla eleman giremeyiz.
      Array`;er eleman sayisinda "fixed" dirler.

       ArrayList`ler olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList`ler elemaan sayisinda
      "flexible" (esnek) dirler.

       2) Array`lerin icine primitive ve adresler(reference) monabilir,
       arrayListlerin icine ise sadece "nun primitiv" `ler konulur. Wrapper classlar kullanacagiz.

       3) Array`ler "super fast" cok hizlidir. Array`ler memory`i cok az kullanirlaar.
       Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz,ama
       eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin.


        */

    public static void main(String[] args) {
        //ArrayList nasil olusturulur,
        // 1. Yol:
        ArrayList<Integer> ages = new ArrayList<Integer>();

        // 2.yol
        ArrayList<Integer> heights = new ArrayList<>();

        // 3. yol)
        List<Integer> nums = new ArrayList<Integer>();

        // ArrayListler nasil yazdirilir:
        System.out.println(nums); //[]

        // ArrayListlere nasil eleman eklenir
        // add() herzaman elemani en sona ekler. (insertion order)

        nums.add(21); //add=toplama, edision .
        System.out.println(nums);
        nums.add(18);     //boolean return eder. true(gorev tamam) yada false(yerlestirilemedi)
        System.out.println(nums);
        nums.add(20);
        System.out.println(nums);//[21, 18, 20]

        nums.add(2, 34); //2. indexe 34 yerlestirir. burada hicbirsey return etmez.data type void olunca return etmez
        System.out.println(nums);


        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        //addCollections
        nums.addAll(prices); //nums listine prices listindeki herseyi ekle.
        System.out.println(nums);  //[21, 18, 34, 20, 23, 185]
        System.out.println(prices);// [23, 185] ilk list degisir ikinci degismez

        nums.addAll(2, prices); // [21, 18, 23, 185, 34, 20, 23, 185]
        System.out.println(nums);

        // AarrayList`lerin elemaan sayisi nasil bulunur.
        nums.size();
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi); //8

        // ArrayListlerde herhangi bir eleman nasil secilir
        // get() metodu istenen bir indexteki elemani verir.
        int el1 = nums.get(3); //185
        System.out.println(el1);

        // ArryListin bos olup olmadigini nasil anlariz
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1); //false cunku bos degil.

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2); //true

        // ArryListte bir eleman nasil degistirilir?

        nums.set(3, 200); //185, 200 oldu
        System.out.println(nums);//[21, 18, 23, 200, 34, 20, 23, 185]

        //Example 1) nums ArrayListindeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        // [21, 18, 23, 200, 34, 20, 23, 185]
        for (int w : nums) {
            if (w % 2 != 0) {
                nums.set(nums.indexOf(w), w + 11);
                //  System.out.println(nums.get(nums.indexOf(w+11)));  // Ekrana tek sayilari yazdiralim
            }
        }
        System.out.println(nums);// [32, 18, 34, 200, 34, 20, 34, 196] butun tekler 11 artti.


        // ArrayListte remove() metodunun icine tamsayi koyarsak java onu index olarak kabul eder.

        //Example 2) ArrayListten 34 elemaninin ilk gorunumunu siliniz
        // Not 1) Tum tamsayilar java icin aksi soylenmedikce primitive dir,yani int dir.
        // Not 2) Primitiv`ler array listlerin elemani olamazlaar.List`ler nun primitive depolar.
        // Not3) "Primitiv" i wrapper Classa cevirsek nun primitive olur, ve nun primitivler ArrayList`lerin elemani olur

        Integer sayi = 34; // primitivi wrepper classa koyacagiz.(auto boxing)

        nums.remove(sayi); //remov icine sayi yazarsak java bunu index kabul eder ve bulamaz
        System.out.println(nums); // [32, 18, 200, 34, 20, 34, 196]


    }
}
