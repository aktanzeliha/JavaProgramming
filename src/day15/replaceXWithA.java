package day15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class replaceXWithA {
    public static void main(String[] args) {
      /*1. write a program that asks to user a word. If the word starts with x, replace it with a.
      input= xcodex
      output=acodex

 */
        System.out.println("Enter a word:");

        String word = new Scanner(System.in).next(); // xcodex
        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a");
            System.out.println(word);

        }

/*
write a code that asks to user a word.if the word's second letter is e, replace it wits i.
 */
        System.out.println("==========================================");

        System.out.println("Enter your second word");
        String word1 = new Scanner(System.in).next();
        if (word1.charAt(1) == 'e') {
            word1 = word1.replaceFirst("b", "i");
            System.out.println(word1);
        }

       /* 2. Write a program that asks user to enter a word. and replace all the x or X with character a
        Input:
        xcodeX
        Output:
        acodea  bnu baska bir clasta yapalim dedi yeni classa geciyoruz bu soru icin */










    }
}
