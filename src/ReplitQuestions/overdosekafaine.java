package ReplitQuestions;

import java.util.Scanner;

public class overdosekafaine {

    public static void main(String[] args) {

        int mgInDrink;
        int lethalDose= 10; // in grams
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter number of milligrams in drink:");

        mgInDrink= scan.nextInt();

        System.out.println("It would take about "+(lethalDose*1000)/mgInDrink + " drinks for a lethal overdose ");






    }
}