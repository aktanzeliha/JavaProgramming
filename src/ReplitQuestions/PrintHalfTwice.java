package ReplitQuestions;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String word= scan.next();

/*
Write a program that will print out first half of the word twice.

Example:

input: java

output: jaja
input: unity

output: unun
 */

        scan.close();

        if(word.length()%2==0){

            int fh = word.length()/2;
            String firstHalf = word.substring(0,fh);
            String repeat = firstHalf.repeat(2);

            System.out.println(repeat);

        }else if(word.length()%2!=0){

            int fh2 = (word.length()-1)/2;
            String firstHalf2 = word.substring(0,fh2);
            String repeat2 = firstHalf2.repeat(2);

            System.out.println(repeat2);



        }
}
}
