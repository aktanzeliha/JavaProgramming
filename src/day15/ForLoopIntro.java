package day15;

public class ForLoopIntro {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        System.out.println("==============");

        for(int i =1; i <= 10; i++){// i++ demek hersewferinde i degerini 1 artir demek
            System.out.println("Hello World!");
        }// conditionumuz i must be smaller or equal to 10, ve kuralimiz her sefereinde 1
        // artiracagiz i yi. i=1 di.herseferinde 1 aruta artira i=11 oldugunda artik sistem Hello World
        // yazmayacak cunku arik sarti saglamiyor, i nin 10 dan kucuk yada esit okmasi gerekiyordu ama
        // artik i=11, yani sadece 10 kere hello world yazabilecek cunku herseferinde 1 arira artira condition
        // sadece 10 defa saglanabiliyor 11.cide bozuluyor.

    }
}/*
loop un genel amaci mesela 100 defa hello world yazdirmak istiyoruz o zaman 100 dega sout yazmamiz gherekiyordu
ama loop kullanarak 100 defa sout yazmadan condition vererek direk 100 defea hello world yazdirabilriz.*/
