package Replit_questions;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
    /*
   Write a program that will create a triangle of asterisks based on size n.

Example:

input: 5

output:
*
**
***
****
*****
Example:

input: 3

output:
*
**
***
     */


        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
           String result="";
        for ( i = 1; i <= n; i++) {
            result+="*";
           // for ( j = 1; j <=n ; j++) {

            //}
            System.out.println(result);
            }
        }

    }

