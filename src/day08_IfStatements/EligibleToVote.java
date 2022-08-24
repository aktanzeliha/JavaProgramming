package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

 String name = "Josh";
 int age = 38;
 String citizen = "USA";

  boolean isEligible = age >=21 && citizen == "USA";
  //                     true            true


  // Eligible
        if(isEligible){
            System.out.println(" Eligible ");
        }




 // Not eligible
if(!isEligible){
    System.out.println("Not Eligible");
/* burada boolean kullandik cunku birkac statementin
true mu false nu oldunun kontrol edilmesi lazim ama
bir tane number verip bu pozitifmi negetif ti zeromu
diye soruldugunda booleasn kullanmaya gerek yok cunku
ortada true false olacak b ir durum yok . yani galiba oyle   */

}















    }







}
