package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);


        System.out.println(" Enter your age");
         int age = input.nextInt();

        input.nextLine();
        System.out.println(" Enter your full name");
        String name = input.nextLine();



        System.out.println(" Enter your GPA:");
        double gpa = input.nextDouble();


        input.nextLine();// double dan nextline a gectigimiz icin "input.nextLine" bunu tekrar girmemiz gerekti yoksa yazmama izin vermez
        System.out.println("Enter your school name");
        String schoolname = input.nextLine();


        System.out.println(" age is: "+ age);
        System.out.println("Full name is: " + name );
        System.out.println(" gpa : "+ gpa);
        System.out.println(" school name: "+ schoolname);




  /*
  1- Ask user to enter age
  2- Ask user to enter full name
   */


    }
}
