package day19LoopAndStringRecap;

import java.nio.file.FileSystemAlreadyExistsException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a number");
        int num1 = scan.nextInt();


        System.out.println(" Enter a math operator");
        char operator= scan.next().charAt(0);// burada char kullanarak istemiyorsan stringe donusturebilirsin dedi
        //String operator = scan.nextLine(); //hehalde bu sekilde emin degilim// bu sekilde denedim cikmadi
        if (!(operator == '+' || operator == '-')) {
            // if the operator is not valid

            System.err.println(" invalid math operator" + operator);
            System.exit(0);// terminates the whole program
        }// system.exit den sonraki hic bir program yazdirilmaz


        System.out.println("Enter a number");
        int num2 = scan.nextInt();

        if (operator == '-') {
            System.out.println(num1 - num2);
        } else {
            System.out.println(num1 + num2);
        }


    }
}
