package Replit_questions;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);
       // System.out.println("Enter number:");
      //  int x = scan.nextInt();
        //WRITE YOUT CODE HERE:
/*
Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:

Display x if x is greater than or equal to 5 Display -x if x is less than 5

DO NOT USE IF STATEMENT or SWITCH CASE
 */
   // String result=    (x>=5)? "x" : "-x";


     //   System.out.println(result);


     //String result3=   (number >0 )? "Positive " :( number <0)? "Negative" : " zero";
        //        System.out.println(result3);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE:








        int result=(x>=5)?x:-x;
        System.out.println(result);



    }
}
