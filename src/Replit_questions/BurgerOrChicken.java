package Replit_questions;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String in = s.next();
        double price = 0.0;
        double chicken= 10.0;
        double burger= 10.0;
        //your code here


        /*
        A fast food company has two main order types, burger meal and chicken meal.

Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.

If the order is burger price is 10.0
If the order is chicken price is 10.0
If the order is soda price is 2.0
If the order is fries price is 3.5
hint: or operator in java is ||
         */

        if (in.equals("burger")) {
            System.out.println("10.0");
        } else if (in.equals("soda")) {
            System.out.println("2.0");
        } else if (in.equals("fries")) {
            System.out.println("3.5");

        } else if (in.equals("chicken")) {
            System.out.println("10.0");

        }

    }
}