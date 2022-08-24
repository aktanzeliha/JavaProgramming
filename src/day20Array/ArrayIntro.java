package day20Array;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // create a variable that is capable enough to contain 5 names

        String[] myGroup = new String[5];// yada [] isaret rigt after myGrouptan sonrada konulabilir
        myGroup[0] = "Gunay";
        myGroup[1] = " Neire";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";// hem buraya hemde bir asagiya ayni index numberi yazsak en son kime yazildiysa ayni olan index number o kisinin adini yazar
        myGroup[4] = "Mikael";
// bu yularidakini 5 elemti icinde tutmamiz gerekiyor ama o 5 elenemt ne onu bilmiyorsak bunu kullaniyoruz, ama elenemtlerin ne oldugunu biliyorsak
        //asagidaki ornekte oldugu gibi yani haftanin gunlerioni sordu biliyoruz haftyamin gi=unlerini o yuzden asagidaki gibi yaptik*****
        /*
         *** negatif index number veremeyiz verebilecegimiz en kucuj index nnumber is 0 dur
         */


// en bas ayaΩdigimiz String veriable ise new den sonrakide STRING OLMAK ZORUNDA
        // System.out.println(myGroup);// hashcode
        System.out.println(Arrays.toString(myGroup));// Gunay, Neira, Suat, Hulya, Mikael


/* mesela 5 name yazsin dedik ama o 5 name yi belirtmedigim zaman hangi variable ise onu verir
yani string se null null null null null verir 5 kere, int ise 0 0 0 0 0 5 tane sifir verir
default values:
non-primitives: null
primitives
byte, short, int , long=====> 0
float, double =====> 0.0
blooen=====> false
 */

        System.out.println("=======================");
        String[] days= {"Monday"," Tuesday", " Wednesday"," Thursday"," Friday", " Saturday", " Sunday "};
                  //          0      1             2             3         4           5            6
        System.out.println(Arrays.toString(days));

       int number=5;

if(number<1 || number>7){
    System.err.println("Invalid Number");
    System.exit(0);
}
        System.out.println(days[number-1]);
/*
yukarida int i 5 olarak versdik yani 5 gun hangisi onu yazsin istedik.
herbir kelime bir index number gibi dudunuluyor yani paxartesi =0 sali=1, carsamba=2 index numberine sahip gibi
int 5 dedik yani 5. kelime hangisi diye soruyor, index numb er 0 dan basladigi icin 5. kelimeyi bulabilmek icin 1 cikarmamiz lazim.    */
    }

}
