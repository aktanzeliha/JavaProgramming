package ReplitQuestions;

import java.util.Scanner;

public class WithoutX_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word=scan.next();
/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX

output: Hi
input: apple

output: apple
input: xUxL

output: UxL

Copied!
input: JavaX

output: Java
 */

        if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
            word = word.substring(1, word.length());
        }
        if (word.charAt(word.length() - 1) == 'X' || word.charAt(word.length() - 1) == 'x') {
            word = word.substring(0, word.length() - 1);
        }
        System.out.println(word);


















    }

    }

