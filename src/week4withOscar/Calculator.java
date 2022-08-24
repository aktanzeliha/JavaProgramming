package week4withOscar;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // we will get two numbers of double from user and we will get a char( + -/%*)
        double num1, num2, result;
        char operator;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter two double type numbers:");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        // comment+option+l, duzenliyor line larei

        System.out.println("Enter aritmatic operation you want ( +,-,/,%,*):");
        operator = scanner.next().charAt(0); // to get char with scanner

        System.out.println(" Is firs number bigger than second number?");
        boolean answer = scanner.nextBoolean();// true or false

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                if (answer) {
                    result = num1 - num2;
                } else {

                    result = num2 - num1;
                    break;

                    }
                }

                // cunku next.char yok bu yuzden next().charAt() seklinde yazdik, buna char manupilation deniyor

// *****bu yarim kaldi  oscarin can,i dersinde week 4, pdf lerden bukuo coppy paste yapabilirsin
        }


    }//(number1!=0) '!=' esit degildir demek