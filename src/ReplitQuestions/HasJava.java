package ReplitQuestions;

import java.util.Scanner;

public class HasJava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        /*
        Given a string word, print true if "java" appears starting at index 0 or 1 in
        the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.

Example:

input: javapython

output: true
input: cjavac++

output: true
input: c#javaruby

output: false
         */

        int length = word.length();

        if (length < 4) {
            System.out.println("false");
        }
        else if (length == 4) {
            String substring = word.substring(0, 4);
            if (substring.equalsIgnoreCase("java")) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else {
            String substring = word.substring(0, 4);
            if (substring.equalsIgnoreCase("java")) {
                System.out.println("true");
                return;
            }
            substring = word.substring(1, 5);
            if (substring.equalsIgnoreCase("java")) {
                System.out.println("true");
                return;
            }

            System.out.println("false");
        }

}


    }

