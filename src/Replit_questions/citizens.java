package Replit_questions;

import java.util.Scanner;

public class citizens {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int count = scan.nextInt();
        int count1 = scan.nextInt();

        System.out.println("What is new citizen's age?");
        int age = scan.nextInt();



        if (age >= 65) {
            System.out.println("Senior Citizen");
            count++;
        } else {
            System.out.println("Non-Senior Citizen");
           count1++;

        }

        System.out.println("New seniorCitizens count " + count);
        System.out.println("New nonSeniorCitizens count " + count1);

    }
}
