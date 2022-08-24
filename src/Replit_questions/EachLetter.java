package Replit_questions;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word=scan.next();
 char result=0;

        for (char i = 0; i <=word.length()-1 ; i++) {
           result = word.charAt(i);
            System.out.println(result);
        }

    }
}
/*
Given a String, use a loop to print every character from the String on a new line.

Examples:

Input: hello
h
e
l
l
o
Input: zimbabwe
z
i
m
b
a
b
w
e
Input: wow!
w
o
w
!
 */