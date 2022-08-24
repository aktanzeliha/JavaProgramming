package Replit_questions;

import java.util.Scanner;

public class QuizQuestion {
    public static void main(String[] args) {


        /*Scanner scan  = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

      String  ans = scan.nextLine();

        //your code here
        String a = " ";
        String b = " ";
        String c = " ";

        switch (ans) {
            case a:
                System.out.println("a is wrong");
                break;
            case b:
                System.out.println("b is correct");
                break;
            case c:
                System.out.println("c is wrong");
                break;
            default:
                System.out.println(ans + " is not a valid answer");

        }




       /* //if (ans.equals(a)) {
            System.out.println("a is wrong");
        } else if (ans.equals(b)) {
            System.out.println("b is correct");

        } else if (ans.equals(c)) {
            System.out.println("c is wrong");
        } else {
            System.out.println(ans + " is not a valid answer");
        }*/

/*
  what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

a

a is wrong
 */

        Scanner scan = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String ans = scan.nextLine();

        //your code here
        ;

        switch (ans){
            case "b":
                System.out.println(ans+" is correct");
                break;
            case "c": case "a":
                System.out.println(ans+" is wrong");
                break;
            default:
                System.out.println(ans+" is not a valid answer");
        }

    }








}
