package Replit_questions;

import java.util.Scanner;

public class TipClaculatorMyVersion {
    public static void main(String[] args) {

     /*
     /* Write a program for a tip calculator. There will be different service
        quality benchmarks that will determine the tip given. There will also the
        ability to calculate based on the number of people in the party and if there
         is a split of the bill or not.

                Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%

                The program should display the following information based on the user input:

        Split or No split (Yes or No) Number of people entered: (number) (each person = & in output)
         Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:
*/
/*
Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */

        Scanner scan=new Scanner(System.in);

        System.out.println("Split or Not split: Yes/No");
        String ans= scan.nextLine();

        System.out.println("Number of people");
        int NumOfP=scan.nextInt();

        System.out.println("Check  Amount");
        int checkAmount=scan.nextInt();

        System.out.println("Service Quality");
        String quality= scan.next();


        System.out.println("Total to pay");
        double totalPay=scan.nextDouble();

        System.out.println("Total tip");
        int totalTip=scan.nextInt();

        System.out.println("Total per person");
        double TotalPerPerson=scan.nextDouble();

        System.out.println("Tip per person");
        double TipPerPerson=scan.nextDouble();




        if(quality.equals("Excellent")){
            totalTip = checkAmount/100*25;
        }else if(quality.equals("Great")){
            totalTip = checkAmount/100*20;
        }else if(quality.equals("Good")){
            totalTip = checkAmount/100*15;
        }else if(quality.equals("Fair")){
            totalTip = checkAmount/100*10;
        }else if(quality.equals("Poor")){
            totalTip = checkAmount/100*5;
        }
      //  double totalPay = checkAmount+totalTip;
        double totalPerPerson = totalPay/NumOfP;
        double tipPerPerson = totalTip/NumOfP;

    }
}
