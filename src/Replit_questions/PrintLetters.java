package Replit_questions;

import java.util.Scanner;

public class PrintLetters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        String str="";

        for(char i=start; i<=end; i++) {
            str += i;


        }
        System.out.print(str);

    }
}
