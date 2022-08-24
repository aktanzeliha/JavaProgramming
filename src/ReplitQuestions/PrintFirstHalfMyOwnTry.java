package ReplitQuestions;

import java.util.Scanner;

public class PrintFirstHalfMyOwnTry {
    public static void main(String[] args) {

 /*
 Write a program that will print out first half of the word twice.

Example:

input: java

output: jaja
input: unity

output: unun

  */
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        scan.close();


        if (word.length() % 2 == 0) {

            int lastIndex = word.length() / 2;
            String firstHalf = word.substring(0, lastIndex);
            System.out.print(firstHalf);
            //System.out.print(firstHalf);
            String repeat = firstHalf.repeat(2);

        } else if (!(word.length() % 2 == 0)) {
            int SecondLastIndex =( word.length()-1)/2;// yani burada yazdirmak isredigimiz kismin son indexinin ne oladugunu tesbit etmeye calsiyoruz
       String firstHalf2= word.substring(0,SecondLastIndex);
            System.out.println(firstHalf2);
       String repeat=firstHalf2.repeat(2);
        }




    }


}
