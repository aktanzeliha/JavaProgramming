package day18NestedLoop;

import java.util.Scanner;

public class NestedLoopPracticeValidAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("Enter your age");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.err.println(" Invalid Entry, Please re-enter your age ");
                age = scan.nextInt();

            }
            System.out.println("Would you like to continue?");

            String ans = scan.nextLine().toLowerCase();

            while (!(ans.equals("yes") || (ans.equals("no")))) ;
            System.err.println("Invalid Entry, Please re-enter your age");

            ans = scan.next().toLowerCase();
        }// bu eksik oldu neden calismadi anlamadim, bunun aynisini coppy li olan class acip oraya muhtarin notlarindan copyaladim ,
        // diger scalla bak bunun icin burasi eksik, yanlis

        }


    }