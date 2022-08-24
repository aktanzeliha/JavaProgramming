package Replit_questions;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();


/*
int countOfHi = 0;
        int lastIndex=0;

        while(lastIndex != -1)
        {
            lastIndex = str.indexOf("hi",lastIndex);

            if(lastIndex != -1)
            {
                countOfHi++;
                lastIndex += "hi".length();
            }
        }

        System.out.println(countOfHi); bu kisim calisiyor ama bana jklarisik geldigi ici daha kolay bir cozum buldum asagida
 */

        int count = 0;

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.substring(i, i + 2).equals("hi")) {// burada last indexi saymadigi icin hi 2 harfli bir kelime oldugu halde i+2 dedi cunku 3. harf dahil edilmiyor
                count++;
            }
        }

        System.out.println(count);

    }}
/*
Print out the number of times that the string "hi"
appears anywhere in the given string.
 Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2

Example:

input: hi code java please

output: 1
 */