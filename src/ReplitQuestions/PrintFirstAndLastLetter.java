package ReplitQuestions;

import java.util.Scanner;

public class PrintFirstAndLastLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

//char first= word.charAt(0);
//char last = (char) (word.length()-1);

        System.out.print(word.charAt(0));
        System.out.print(word.charAt(word.length()-1));


    }
}
