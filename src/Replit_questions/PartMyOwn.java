package Replit_questions;

import java.util.Scanner;

public class PartMyOwn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         /*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda

     */
        String list = "";
        while (true) {
            System.out.println("Please enter guest name:");
            String name = scan.nextLine();// beyza
            list += name;
            System.out.println("Do you want to enter new guest name:");
            String ans = scan.nextLine();

            if (ans.equals("yes")) {
                // System.out.println("Please enter guest name:");
                name = scan.nextLine();// betul
                // System.out.println("Do you want to enter new guest name:");

                list += name + ",";
            }
            if (ans.equals("no")) {
                System.out.println("Guest's list: " + list);
                break;
            }
        }
    }
}
/*
  String list = "";
        while (true) {
            System.out.println("Please enter guest name:");
            String name = scan.nextLine();
            list += name;
            System.out.println("Do you want to enter new guest name:");
            String answer = scan.next();


            if (answer.equals("yes")) {
                name = scan.nextLine();
                list += name + ",";
            }
            if (answer.equals("no")) {
                System.out.println("Guest's list: " + list);
                break;
            }


        }


 */