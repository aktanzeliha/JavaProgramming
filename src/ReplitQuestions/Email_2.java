package ReplitQuestions;

import java.util.Scanner;

public class Email_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
      /*
      Write a program that will print out information
      about user based on email. Print first name,
      last name, and domain. First and Last name should
      be printed with proper format - uppercase first letter
      and remaining lowercase.

Example:

Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
       */
        if (email.contains("_")){
            String w1 = email.substring(1,email.lastIndexOf("_"));
            String w2 = email.substring(email.lastIndexOf("_")+2,email.lastIndexOf("@"));
            String w3 = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
            char firstChar = email.charAt(0);
            String fc = ""+firstChar;
            String fcU= fc.toUpperCase();
            char firstCHarL = email.charAt(email.indexOf("_")+1);
            String lc = ""+firstCHarL;
            String lcU= lc.toUpperCase();

            System.out.println("First name: " +fcU+ w1+"\nLast name: "+lcU+w2+"\nDomain: "+w3);
        }else {
            System.out.println(email);
        }
        scan.close();

    }
}
