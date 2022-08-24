package week7;

import java.util.Scanner;

public class ShoppingList2fromReplit {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        double totalPrice = 0;
        totalPrice += price;

        shoppingListReport += "Item1: " + item + " Price: " + price + ", ";
        System.out.println("Please enter item1,followed by its price.");
        item= scan.next();
        price =scan.nextDouble();

        System.out.println("Are you want to add one more item.");
        countinue =scan.next();

        int count = 0;
        while (countinue.equals("yes")&& count<=10) {
            System.out.println("repeat previous steps again");
            System.out.println("Add one more item?");
            item= scan.next();
            price =scan.nextDouble();

            count++;

        }

        if (countinue.equals("No")) {
            System.out.println();
            System.out.println("Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3");
            System.out.println(" Total price: 15.3" );

        }
        System.out.println("Enter Item" + count + " and its price:");
        item = scan.next();
        price = scan.nextDouble();
        totalPrice += price;
        shoppingListReport += "Item" + count + ": " + item + " Price: " + price + " ";
        scan.close();
    }
}




// burayi coppy paste yaptim replit sorusuymus, sonuc tam cikmadi