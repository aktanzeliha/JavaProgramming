package Replit_questions;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.nextLine();
        int countJava=0;

        for (int i = 0; i <=word.length()-4 ; i++) {

       if(word.substring(i,i+4).equals("java"))  {
           countJava++;
       }

        }
        System.out.println(countJava);
    }
}
