package ReplitQuestions;

import java.util.Scanner;

public class shoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

String  item1, item2, item3;
double price1, price2, price3, totalPrice;
        System.out.println("Enter Item1 and its price:");
        item1= scan.nextLine();
        price1= Double.parseDouble(scan.nextLine());

        System.out.println("Enter Item2 and its price:");
        item2= scan.nextLine();
        price2= Double.parseDouble(scan.nextLine());

        System.out.println("Enter Item3 and its price:");
        item3= scan.nextLine();
        price3= Double.parseDouble(scan.nextLine());

      totalPrice= price1+price2+price3;

        System.out.println("total price:" );
        System.out.println("Item1: "+ item1+" Price1: "+ price1 + " Item2: "+ item2+" Price2: "+ price2 + " Item3: "+ item3+" Price3: "+ price3 );
        System.out.println("Total Price: " + totalPrice);

/*
In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

Declare integer variables num1, num2, num3, sum.

Create a Scanner object named scan.

Flow:

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"
 */


    }
}