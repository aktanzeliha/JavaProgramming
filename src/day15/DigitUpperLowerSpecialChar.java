package day15;

import java.util.Scanner;

public class DigitUpperLowerSpecialChar {
    public static void main(String[] args) {
/*
Ask user to enter a word,
if the word stars with digits, print" first character is digit".
if the word stars with uppercase letter, print" firs character is upper case letter"
if the word stars with lowercase letters, print "first character is lower case letter"
if the word stars with special characters, print"firs character is special charecter"

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= scan.next();
        scan.close();


        char firstChar=word.charAt(0);
        String result="";
        if(firstChar>='0'&& firstChar<='9'){
            result="first character is digit";

        }else if(firstChar>='a' && firstChar<='z'){
            result="first character is lower case letter";

        }else if(firstChar>='A' && firstChar<='Z'){
            result="first character is upper case letter";

        }else {
            result=" first character is special character";

        }

        System.out.println(result);
    }
}
