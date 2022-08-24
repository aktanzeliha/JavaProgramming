package day09_IfStatements;

public class PassOrFail {
    public static void main(String[] args) {
   int score=  75;
/* if else statement te sadece 2 option olmali
,  2 den fazla degil az da degil. */

if( score >=60){
    System.out.println(" Congrats, you passed");

}

    //  if( score <60){......... ikinci statementi bu sekilde de kurabilirsin sonuc yine dogru cikiyor ama el
 // eger sadece 2 option varsa "else " kullanmaliyiz o da su sekilde
    //System.out.println( " You failed");
//}
else { // else yazip curly parantez acip o parantesin icinse sout yaziyoruz
    System.out.println(" failed");
}
    }
}
