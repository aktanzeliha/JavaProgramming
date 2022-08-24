package Replit_questions;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word=scan.next();

        char isVowel;

        for(int i=0;i<word.length();i++)
        {
            isVowel=word.charAt(i);
            if(isVowel=='a'||isVowel=='e'||isVowel=='i'||isVowel=='u'||isVowel=='o')
            {
                System.out.print(isVowel);
            }
        }
    }
}
/*
Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho

Output: oo
Input: huehuehuehue

Output: ueueueue
 */