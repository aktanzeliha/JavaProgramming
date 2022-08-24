package grupstudy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class groupstudy {
    public static void main(String[] args) {

 /*
 get 5 input from user as numbers to print all
 then side by side as one string variable
  */
        Scanner scan= new Scanner(System.in);
        System.out.println(" Please enter 5 numbers and print them as one string");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();
        int num4= scan.nextInt();
        int num5= scan.nextInt();
        System.out.println(" Out put of 5 numbers :"+ num1+num2+num3+num4+num5);
       scan.close();


    }
}
