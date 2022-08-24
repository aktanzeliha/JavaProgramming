package ReplitQuestions;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        /*
        Given a String str and a number n check if the prefix
         (made of up of the first n characters) appears in the
          remaining part of the String. Print true or false.

Assume that the String is not empty and that n is in the range from 1 to str.length().
         */

      /*  input: abXYabc
        input: 1

        output: true */

      /*  Assume that the String is not empty and that n is in
        the range from 1 to str.length().  */


        Scanner scan= new Scanner(System.in);
        String word= scan.next();
        int n=scan.nextInt();






        if(word.substring(n).contains(word.substring(0,n)))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
}

    }



}
