package day12_Scanner;

public class GradeLevelWithIf {
    public static void main(String[] args) {

      /*  Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School
        For Any Other grade: Invalid grade level given
        Note:
        Solution 1: Use switch statement
        Solution 2: use if & switch both */

        int year = 29;
        if (year >= 1 && year <= 18) {


            if (year == 1 || year == 2 || year == 3 || year == 4 || year == 5) {
                System.out.println(" Elementary School");
            } else if (year == 6 || year == 8) System.out.println("Middle School");
            else if (year == 9 || year == 10 || year == 11 || year == 12) {
                System.out.println("High School");
            } else if (year == 13 || year == 14 || year == 15 || year == 16) {
                System.out.println("College");
            } else  {
                System.out.println(" Grad School");

            }


        }else {
            System.out.println(" invalid ");
        }
    }
}