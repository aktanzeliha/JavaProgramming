package week03;

import jdk.swing.interop.SwingInterOpUtils;

public class logicalOperators {

    public static void main(String[] args) {

     int A =20;
     int O= 30;
     int P= 30;
     boolean comp= A<O || --O>P;
     //             TRUE || TRUE
        System.out.println("comp=" + comp);
        System.out.println("0="+O);
/* if its firs part is true compiler doesnt
checked second part because as it ia Or || it
 is enough to have one true part to give true answers  */
boolean compTwo= A>O ||O-->P;
//               false || true
        // burada ilk part false oldugu icin ikinci partida kontrol eder compiler
        // cunku sadece biri dogruysa true cikacak answer bu yuzden ikisinide kontrol eder ilk part false ise

        System.out.println("O="+ O);

boolean compThree= A > O && ++O >= P;
//                  FALSE && ikinci kismi compiler kontrol
//                  etmeyecek cunku && bunda iki kisminda true
//                  olm asi lazim, ilk kisim zaten false ise
//                  ikinci kismi kontrol etmesine gerek yok zaten
        System.out.println("compThree "+ compThree);
    }






}
