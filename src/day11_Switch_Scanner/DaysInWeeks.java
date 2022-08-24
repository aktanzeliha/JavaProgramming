package day11_Switch_Scanner;

import java.sql.SQLOutput;

public class DaysInWeeks {
    public static void main(String[] args) {

        int number = 9;// bu haftanin kacinci gunu
// onu yazan bir program yazacagiz
    /*if( number== 1){
        System.out.println("monday ");
    } */ //ykaridaki gibi yapabiliriz
        // o sekilde devam etesekte dogru ama burada
        // swich statement te ornek cozdugumuz icin farkli
        // yapacagiz burada. cunku swich statement is faster
        // than if statement

        switch (number) {// 1,2,3,4,5,6,7,// switch in icinde number
            // yaziyor, bir altida case nin icinde 1 yaziyor bu ikisi match yapmak zorunda
            case 1:
                System.out.println("monday");
                break;// exits the switch after executing the case block
            case 2:
                System.out.println(" Tuesday");
                break;// exits the switch after executing the case block
            case 3:
                System.out.println(" Wednesday");
                break;// exits the switch after executing the case block
            case 4:
                System.out.println(" Thursday");
                break;// exits the switch after executing the case block
            case 5:
                System.out.println(" Friday ");
                break;// exits the switch after executing the case block
            case 6:
                System.out.println(" Saturday");
                break;// exits the switch after executing the case block
            case 7:
                System.out.println(" Sunday");
            default:
                System.out.println("invalid");
        }
// biz int number==5 yazdigimiz icin case 5 deki 5 un uzeri secilmis gozukuyor
/*** eger soiut dan sonra break yazmazsak number =5 diyelim ve case 5
 * de break yazmayi unuttum, sisten number=5 bile olsa sistem hem friday hemde satirday yazacaktir. bir sonraki
 * case olan case 6 yi yaziyor otamatik olarak
 * in order to switch the case , we have to write break other wise it gives somethingelse.*/
// **** ya break yazarak yada kapanma curly paraentez ile ancak bir sonraki statementi yazmasini engelleyebiliriz sistemin
 /* hic break yazmazsan numberim 2 bile olsa haftanin butun gunlerini yazar hic birinde break yada
 curly parentz ile kapatmazsam  */
/*
default sadece bir tane olmak zorunda.
 */

//default executed only non of case not match
}
//sadece bir ane default yazabiloiyoruz ama istedigmiz kadar case miz olbilir
} /*default u istedigin yere yazabilirsin ama mesela ben case 3 den sonra
 yazdim diyelim defaultu,ve number == 9 dedim, default invalid olan durumlari
  beloitmek icin yazilir ama ben defaultun case 3 den sonra yazdiysam ve sout
  tan sonra berak yazmadiysam sistem hem invalid yazacak hemde defaultu yerlestirdigim
  case den bir sonraki case de yazacak, burada case 3 den sonra yerlestirdiysem
   invalid yazisindan sonra ythursday de yazacak, eger case 4 dan sonra break yazisi
    yoksa friday da yazacak taki berak yada curly parentez ile kapaytilana kadar yazmaya devam edecek */
/*
int number= 5 buradaki 5 single value olmak zorunda
float, double, boolean and long  kullanilmaz ama byte, short and char
 kullanililabilioyor switch de. String de kabul ediliyor ama
 string number= "3" tirnak isareti icnde kullanilmak zorunda
 */
