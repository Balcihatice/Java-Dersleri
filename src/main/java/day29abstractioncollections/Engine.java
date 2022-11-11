package day29abstractioncollections;

public interface Engine extends Vehicle{

     //interfacedeki tum variable`ler otomatic olarak "public" tir.
    //interfacedeki tum variable`ler otomatic(default) olarak final`dir.Degerini degistiremeyiz.
   //interfacedeki tum variable`ler otomatic(default) olarak  statictir. Class ismi ile ulasabiliriz,objeye gerek yoktur


   int price =2000 ;

    double weight = 23.5;


    void run();

}