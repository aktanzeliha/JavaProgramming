package Replit_questions;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        char char1;
        char char2;
        char char3;

        int count = 0;

        for (int i = 0; i < str.length()-2; i++) {

          //  if (i + 2 < str.length()) {

                char1 = str.charAt(i);
                char2 = str.charAt(i + 1);
                char3 = str.charAt(i + 2);

                if (char1 == char2 && char2 == char3) {
                    count++;
                }
            }


        System.out.println(count);
    }
}
 /*
 /*We'll say that a "triple" in a string is a char appearing three times in a row.
 Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc

output: 1
Example:

input: xxxabyyyycd

output: 3
Example:

input: java

output: 0
  */