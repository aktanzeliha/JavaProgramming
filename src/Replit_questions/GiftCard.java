package Replit_questions;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {
     /*   Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.

        If item is not in the list, display message: "Invalid item!".
                If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
                List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

        Hint: if/ else if / else or switch statement

        Examples:

        input: Hat
        output:
        Thank you for your purchase!
                Your current balance is: 75$
        input: Pants
        output:
        Thank you for your purchase!
                Your current balance is: 50$
        input: Laptop
        Output:
        Sorry, not enough funds on your gift card!

                Copied!
                input: Cupcake
        output: Invalid item!    */

        Scanner scan = new Scanner(System.in);
        String nameOfItem = scan.nextLine();





       /* int blanket = 60;
        int charger = 25;
        int hat = 25;
        int headphone = 30;
        int Laptop = 200;
        int pans = 50;
        int pillow = 40;
        int smartphones = 1000;
        int socks = 5;
        int USBcable = 10;
        int priceItem = 0;
        */
        int totalBalance = 100;
        int currentBalance = 0;



        if (nameOfItem.equals("blanket")) {
            System.out.println("Thank you for your purchase!");
            int priceItem = 60;

            currentBalance = 100 - priceItem;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (nameOfItem.equals("charger")) {
            System.out.println("Thank you for your purchase!");
            int priceItem = 25;
            currentBalance = 100 - priceItem;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (nameOfItem.equals("hat")) {
            System.out.println("Thank you for your purchase!");
            int priceItem = 25;
            currentBalance = 100 - priceItem;
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (nameOfItem.equals("headphone")) {
            System.out.println("Thank you for your purchase!");
            int priceItem = 30;
            currentBalance = 100 - priceItem;
            System.out.println("Your current balance is: " + currentBalance + "$");

        } else if (nameOfItem.equals("laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");

        } else if (nameOfItem.equals("pans")) {
            System.out.println("Thank you for your purchase!");
            int priceItem = 50;
            currentBalance = 100 - priceItem;
            System.out.println("Your current balance is: " + currentBalance + "$");

        } else if (nameOfItem.equals("pillow")) {
            System.out.println("Thank you for your purchase!");
            int priceItem = 40;
            currentBalance = 100 - priceItem;
            System.out.println("Your current balance is: " + currentBalance + "$");

        } else if (nameOfItem.equals("smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");


        } else if (nameOfItem.equals("socks")) {
            System.out.println("Thank you for your purchase!");
            int priceItem = 5;
            currentBalance = 100 - priceItem;
            System.out.println("Your current balance is: " + currentBalance + "$");

        } else if (nameOfItem.equals("USB Cable")) {
            System.out.println("Thank you for your purchase!");
            int priceItem = 10;
            currentBalance = 100 - priceItem;
            System.out.println("Your current balance is: " + currentBalance + "$");

        } else {
            System.out.println("Invalid Item!");
        }


    }}

