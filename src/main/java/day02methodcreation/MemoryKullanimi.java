package day02methodcreation;

public class MemoryKullanimi {
    /*
    java da iki türlü memory var

   1) büyük memory : heap (huge: çok büyük) non primitive data`lar konur >>> String,oluşturulan classlar,
    'heap' içine konulan şeyin adresi bilinmeli String ve classlar oluşunca java hemen adres oluşturur
    ve bu adresi 'stack' e koyar
     java heap memory ye yerleştirilen her non primitive data için bir adres oluşturur ve bu adresi stack memory ye koyar

    ör: ormana hazine sakladık adresi çebimize koyduk. hazineyi almak için hemen cebimden adrese bakarım

    Hey java bana tomu bul: java önce adresi bulmak için stack e gider ,sonra heap de adresi(Reference)  bulur
    ve içindeki bilgiyi bana verir

    Eger adres kırıldı ve yoksa , heap deki bilgi otomatik java (çöp toplayıcılar tarafından: garbege collector)tarafından silinir


   2) küçük memory : stack (small) ör: primitive data type  ve non primitivlerin adreslerini içerir >>> byte,short,int,long,float,double,boolean,char

        >>>>>>>  NOTE: Class ==>içinde ==> variable ve metod vardır
          sonra Objeck öğrenmemiz lazım

    /*
        1)Java'da iki turlu "memory" var
            i)Stack Memory:
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory:
                a)Buyuk Memory'dir
                b)Non-Primitive'leri icerir
        2)Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu adresi(Reference) Stack Memory'ye koyar.
          Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference) olmayan Heap deki non-primitive data yi otomatik siler.
          Memory'nin temizligini saglayan "Garbage Collector" vardir.
     */

}
