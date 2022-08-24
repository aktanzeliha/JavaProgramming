package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */


// while(invalid && hasAttempt)
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter your user name");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            int attempts = 3;

            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {
                if (attempts == 1) {// tersten gidiyor yano 3 den azaltarak 0 a dogru gittigi icin ==1 last chance oluyor
                    System.out.println(" This is your last chance");
                }
                System.out.println("Incorrect username or password");

                System.out.println("Enter your user name");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();

                attempts--;// bunu yazmazsam 3 attemps hakkimiz degilde sonsuz deneme hakkimiz olur o yuzden 3
                // kere yanlis denmede accountun locked oloabilmesi icin bunin yazilmasi lazim


            }
            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("you logged in ");
            } else {
                System.out.println(" Your account is locked");
            }

            scan.close();

        }
    }
}