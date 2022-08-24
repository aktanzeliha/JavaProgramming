package ReplitQuestions;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
/*
Write a program that will output length of the text (string).

Example:

Display message: "Please enter the text:"
input: java
Display message: "Length is: 4"

 */

        System.out.println("Please enter the text:");
        String s= scan.next();

        System.out.println("Length is: "+s.length());

    }

    }

