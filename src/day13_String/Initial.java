package day13_String;

import java.util.Scanner;

public class Initial {

    public static void main(String[] args) {

    /*  Task:
      initial:
      firsName= " wooden"
              lastName= " Spoon"

output: W.S */
        Scanner scan= new Scanner(System.in);

        System.out.println(" Enter your first name");
        String firstName= scan.next();

        System.out.println("Enter your last name");
        String lastName= scan.next();

        char f =firstName.charAt(0);
        char l= lastName.charAt(0);
        String initial = f+"."+l;// burada "" bunlari yazmazsak sistem hata veroyor cunku l ve f
        // string degil msadece birer karekter, by yuzden basina "" yazinca string bunlari kabul ediyor


/* yukarida yapmaya calistigimiz sey . bir kisinin adini ve
soyadini sorup out put olarakta adinin ve soyadinin sadece
bas harflarini yazsin istiyoruz. Tek bie karekter yazsin istedigimiz
 icin bu da cahar ile oluyor. Java yazdirmak istedigimiz her karektere
  bir number veriyor ve numaralamaya 0 Sifirdan basliyor.
  burada biz ilk harflerini yazmasini istedigimiz icin ve java numaralamaya sifirdan basladigi
  icin  (0)chartArt(0) PARENTEZ ICINE SIFIR YAZDIK KI BIZE ILK LETTERI VERSIN
  , parentez icine 1 yazsaydik 2 ketteri verirdi,,

 */

        System.out.println(" initial="+ initial);

scan.close();
    }
}
