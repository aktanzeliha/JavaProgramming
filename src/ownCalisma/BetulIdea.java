package ownCalisma;

import java.util.Scanner;

public class BetulIdea {
    public static void main(String[] args) {


        System.out.println(" What is your favourite colour?");
        Scanner scan= new Scanner ( System.in);
        String answer= scan.next();

        if(answer.equals("green")){
            System.out.println("Ohhh MY God! Me too!");
        }else {
            System.out.println("Cool");
        }

    }
}
