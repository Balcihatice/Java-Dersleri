package day31maps;

import java.util.HashMap;

public class HashMap02 {
    /*
     1) HashMap<String, Double> salaries = new HashMap<>(); kodu yazdigimizda Java memory`de 16 kutu iceren bir yapi olusturur
     Bu yapidaki herbir kutuya index verir, Indexler sifirdan 15`e kadardir.
     2) Biz salaries.put("dev",130000.00); kodunu yazdigimizda Java key icin bir HashCode olusturur,Bu hashCodu
     15`e boler ve kalani index olarak kullanir.Bu elemani o index`e yerlestirir.
     Yerlestiriken 4`lu yapi olusturur,Bu yapinin ilk bolumune HasCodu koyar,ikinci bolumune key`i,ucuncu
     bolumune value`yu ve dorduncu bolumune pointer`i koyar.
     Bu cok bolumlu yapi LikedList`lerdeki "Node"dur.Yani HashMap bucked`lara koydugu datayi LinkedList olarak depolar.
    4) Java null icin hep HashCode olarak "zero" uretir,o yuzden key null oldugunda eleman ilk bucket`e yerlestirilir,
    bundan dolayi key`si null olan elemanlar Map`in icinde genellikle ilk sirada gorunurler
    5) Java normalde HashCode`lari unique yapar,ama bazen trafik kazasi gibi farkli iki eleman icin ayni
    HashCode uretilebilir. Buna "Hash Collision" denir Hash Collision meshur bir Java development problemidir,Bu problemle
    karsilasinda developerlar problemi cozmek icin Code yaralar,ama bu coreJava`nin konusu degildir.


     */
    public static void main(String[] args) {

        HashMap<String, Double> salaries = new HashMap<>();
        //HashMap bucket`larin icinde LikedList kullanir. key null oldugunda HashCodu sifir verir.
        salaries.put("QA", 110000.00);//Java hemen 16 tane alan(bucket) acar ve indexler.
        System.out.println(salaries);
        salaries.put("dev", 130000.00);
        salaries.put("SalesForce", 125000.00);



    }
}
