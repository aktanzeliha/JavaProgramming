package Replit_questions;

import java.util.Scanner;

public class VeryfyContains {
    public static void main(String[] args) {



                Scanner scan = new Scanner(System.in);
                String word = scan.nextLine();
                String sentence = scan.nextLine();
                //WRITE YOUR CODE HERE

                if(sentence.contains(word)) {


                    System.out.println("true");
                }else {
                    System.out.println("False");
                }






            }

}
