package Replit_questions;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

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
/*
1

1 Split:
2 Number of people:
3 Check amount:
4 Service Quality:
5 Number of people entered: &&&&&
6 Total to pay: 600.0
7  Total tip: 100.0
8 Total per person: 120.0
9 Tip per person: 20.0

 */

       /* Scanner scan = new Scanner(System.in);

        System.out.println(" Split:");
        String YesOrNo = scan.next();

        System.out.println("Number of people:");
        int num = scan.nextInt();

        System.out.println("Check amount:");
        int checkAmount = scan.nextInt();

        System.out.println("Service Quality:");
        String Quality= scan.next();

        System.out.println("Total to pay:");
        double pay = scan.nextDouble();

        System.out.println("Total Tip:");
        int tip = scan.nextInt();

        System.out.println("Total per person:");
        int perPerson = scan.nextInt();

        System.out.println("Tip per person:");
        int tipPerPerson = scan.nextInt();

*/
       /* Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split");
        String splitOrNon = scan.next();

        System.out.println("Enter the number of people");
        double nOfPeople = scan.nextDouble();

        System.out.println("Enter the check amount:");
        double checkAmount = scan.nextDouble();
        double totalAmountSplit = checkAmount / nOfPeople;
        double totalTip;

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scan.next();

        if (quality.equalsIgnoreCase("Excellent")) {
            totalTip = checkAmount * 0.25;
        } else if (quality.equalsIgnoreCase("Great")) {
            totalTip = checkAmount * 0.20;
        } else if (quality.equalsIgnoreCase("Good")) {
            totalTip = checkAmount * 0.15;
        } else if (quality.equalsIgnoreCase("Fair")) {
            totalTip = checkAmount * 0.10;
        } else {
            totalTip = checkAmount * 0.05;
        }
        double totalTipSplit= totalTip/nOfPeople;
        System.out.println("Number of people entered: "+nOfPeople+"\nTotal to pay: "+checkAmount+"\nTotal tip: "
                +totalTip+"\nTotal per person: " +totalAmountSplit+"\nTip per person: "+totalTipSplit);*/// bu replitten gecmedi


        Scanner scan= new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int numberOfP = scan.nextInt();

        String n = "&";
       n = n.repeat(numberOfP);

        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        
        System.out.println("Service Quality:");
        String quality = scan.next();

        double totalTip=0.0;


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

        double totalPay = checkAmount+totalTip;
        double totalPerPerson = totalPay/numberOfP;
        double tipPerPerson = totalTip/numberOfP;


        System.out.println("Number of people entered: "+ n);
        System.out.println("Total to pay: "+ totalPay);
        System.out.println("Total tip: "+ totalTip);
        System.out.println("Total per person: "+ totalPerPerson);
        System.out.println("Tip per person: "+ tipPerPerson);
        scan.close();// bu replitten gecti




    }
}
