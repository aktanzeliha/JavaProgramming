package grupstudy;

import java.util.Scanner;

public class groupstudy2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner( System.in);
        System.out.println(" Please enter two characters and print sum od ascii values of them");

        String w1=scan.next();
        String w2=scan.next();
        char ch1= w1.charAt(0);
        int integerch1=(int)ch1;
        System.out.println("integerch1: "+ integerch1);

 // get 2 inputs from user as char and print sum of them as integer. use ASCII table

        char ch2= w2.charAt(0);
        int integerch2=(int)ch2;
        int sum = integerch1+integerch2;
        System.out.println("integerch2: "+ integerch2);
        System.out.println("sum of ascii values of two character:"+ sum);
scan.close();


    }
}
