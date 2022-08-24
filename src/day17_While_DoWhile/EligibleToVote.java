package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();// valid age is 21-120

        // burada while loop kullanarak valid age yazmamizi isteyecej
        // ve for loop dsa oldugu gibi sadece bir kere sorsun istemiyoruz
        // eger invalid age gireresek herseferinde tekrar gir desin istiyoruz bu ytuzden while loop kullanacagiz.

        while (!(age >= 1 && age <= 120)) {
            System.err.println(" Invalid entry, please re enter again!");
            System.err.println("Enter your age");
            age = scan.nextInt();
        }


        System.out.println("Are you a US citizen? yes/no");// we are expecting yes or no but if the user
        // provide invalid entry, sisitem should ask re enter again.
        String answer = scan.next().toLowerCase();


        while (!(answer.equals("yes") || answer.equals("No"))) {

            System.err.println("Invalid entry, please re enter");
            System.out.println("Are you a US citizen? yes/no");
            answer=scan.next().toLowerCase();

        }
if (age>= 18 && answer.equals("yes")){
    System.out.println("You are eligible to vote");
}else{
    System.out.println("You are not eligible to vote");
}

    }


}
