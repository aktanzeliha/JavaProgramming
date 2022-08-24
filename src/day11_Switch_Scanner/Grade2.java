package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        //char ch = 'A';
        //switch (ch) {
    /* case 'A':
         System.out.println(" passed");
         break;
     case 'B':
         System.out.println(" passed");
         break;
     case 'C':
         System.out.println(" passed");
         break;
     case 'D':
         System.out.println(" passed");
     default:
         System.out.println("failed");
 }*/

/* yukari daki yaptigimiz ornegin daha
 kisa yolu  var cunku cocuk A da alsa
 B de alsa C de alsa D de alsa ayni sey
 yazilsin isteniyor yani "passed". asagiya
 onu yazacagim yukaridakileri commentleyip.


 */

/*
if the grade A,B,C ,D =====> PASSED
OTHER WISE ======> FAILED CIKSIN
 */
        char ch = 'A';
        String result= " ";
        switch (ch) {
            case 'A':// case leri arka arkaya bu sekilde yazmak "or" logic olmus oluyor
            case 'B':
            case 'C':
            case 'D':
                result= "passed";
                //System.out.println(result);
                break;

            default:
                result= "failed";
                //System.out.println(result);
/* *** system.ot,println" passed" dan sonra break
yazmadigim icin sistem hem passed hemde fail yazdi, DONT FORGER TO WRITE BREAK
**** switch boolean kabul etmiyor, yukaridaki ornekte A || B || C || D YAZABILIRDIK
AMA OR operatoru yani "||" bu iaret boolean da kullanildigi icin tek tek case leri yazmamiz gerekiyor
 */ }
        System.out.println(result);
    }
} /*
sout un icinde result yazdigimiz kismi
switch in curly parentezinin disina
yazarsak  sadce bir tane yazmamiz
 yeterli, eger switch in curly
 parentezinin icine yazmak istiyorsakta
 2 tane yazmamiz lazim biri passed icin digeri invalid result icin
*/


