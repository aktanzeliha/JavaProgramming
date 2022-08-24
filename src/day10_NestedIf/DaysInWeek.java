package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

   // bu kismi 09 daki NameOf Day den coppy paste yaptik.
       /*  int n= 5; // 5. gunun adini yazan bir kod
// yazmamizi bekliyor.
        String day;
        if(n==1){
            // System.out.println("Monday");
            day= "Monday";
        }else if(n==2){
            // System.out.println(" Tuesday");
            day= "Tuesday";
        }else if(n==3){
            //System.out.println(" Wednesday");
            day= " Wednesday ";
        } else if(n==4){
            //System.out.println(" Thursday");
            day= "Thursday";
        }else if (n==5){
            //System.out.println(" Friday");
            day= "Friday";
        }else if(n==6){
            //System.out.println(" Saturday ");
            day= "Saturday";

        }else{
            //System.out.println(" Sunday");
            day="Sunday";*/

    /*basta string ile day i belirtirsen her if den sonra day yazip o if dogruysa
     o haftanin gunnu yaz demis oluyoruz, yada stringle day belirtmeyip sout
     pazarakta haftanin 5. gununun ne oldugunu yazabiliyoruz yani 2 yontemi var.  */



       // short cut kullnaabilmek icin every single block must return one value.
// butun sonuclar same data type yani string so we can use short cut of if.

/*if= ( condition)?
else = :
else if = :( condition )?  */

        System.out.println("=====================");

        int number= 5;
         String result=  (number== 1)? " Monday" :(number==2)? " Tuesday" :(number==3)? " Wednesday" :(number==4)? " Thursday":(number==5)? "Friday"
                          :(number==6)? " Saturday" :" Sunday";

        System.out.println(result);

        System.out.println("===================");



        }









    }


