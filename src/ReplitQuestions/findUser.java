package ReplitQuestions;

import java.util.Locale;
import java.util.Scanner;

public class findUser {
    public static void main(String[] args) {


/*
Write a program that will look up a user.

Assume that you have only 2 users: Max Payne and Alan Wake. First, ask user to enter full name. Display message: "Enter full name:".
Then take input from user. If name is equals to either "Max Payne" or "Alan Wake", display message: "User found!". Otherwise, display message:
 "User not found!". Please make your search case insensitive!

Example:

Display message: Enter full name:
input: Max Payne
Display message: User found!
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String name = scan.nextLine();

        name = name.toLowerCase(Locale.ROOT);
        String name1 = "Max Payne";
        name1 = name1.toLowerCase(Locale.ROOT);
        String name2 = "Alan Wake";
        name2 = name2.toLowerCase(Locale.ROOT);


        if (name.equals(name1) || name.equals(name2)) {
            System.out.println("User found!");

        } else {
            System.out.println("User not found!");
        }


    }
}
