package day15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
     /*
     Create a class called TipCalculator, write a program for a tip calculator.
     there will be diffrent service quality benchmarks that will determine the tip given.
     there will also the ability to calculate based on the number of people
     in the party and if there is a split of the bill
 poor=5%, Fair=10%, Good=15%,Great= 20%, Excellent= 25%
 the program should display the following informatio based on the user inpur:
 Split or no split( yea or no)
 Number of people entered(number)
 Check amount(number)
 Service quality(String)

 And display:
 number of people entered:
 total to pay
 total tip
 total per person
 tip per person

 example:
 Split or no split(yes or no )
 yes
 enter the number of people
 4
 enter the check amount
 476
 How was the service quality?(Excellent/great/good/fair/poor)
 Excellent

 output:
 number of people entered:4
 total to pay:595.0
 total tip:119.0
 totap per person:148.75
 tip for perr person:29.??
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Split or no split(Yes or No)?");
        String yesOrNo=scan.next().toLowerCase();

        System.out.println("Enter the check amount:");
        double amount=scan.nextDouble();

        System.out.println("How was the service quality? ( Excellent/Great/Good/Fair/Poor)");
        String service=scan.next().toLowerCase();// toLowerCase is cokda onemli degil yazi duzgun
        // olsun bir kismi buyuk harf bir kismi kucuk harf olmasin diye oye yazmisiz

        double tipRate=( service.equals("Excellent"))? 0.25 :( service.equals("great"))? 0.2
                :(service.equals("good"))? 0.15 :(service.equals("fair"))?
0.1 : 0.05; // burada if statement kullandi/ eger

double totalTip=amount*tipRate;
int numOfPeople='0';
        System.out.println("Number of people entered:"+ numOfPeople);
        System.out.println("Total to pay:"+ amount);
        System.out.println("total tip:"+ totalTip);
        if(yesOrNo.equals("yes")){
            System.out.println("Total per person:"+(amount/numOfPeople));
            System.out.println("Tip per person:"+(totalTip/numOfPeople));

        }
scan.close();





    }
}
