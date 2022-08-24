package day11_Switch_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

public class salaryAfterTax {
    public static void main(String[] args) {
        double salary = 75_000;
        boolean isMarried = true;
        double taxRate = 0;
        if (salary >= 130000) {// false if the salary is salary <130000
            taxRate = 0.35;

        } else if (salary >= 100000) {// false if salary< 10000
            taxRate = 0.30;

        } else if (salary >= 80000) {// false if salary< 80000
            taxRate = 0.25;

        } else {
            taxRate = 0.20;
        }if(isMarried) {

            taxRate -= 0.05;
        }

     double salaryAfterTax = salary -(salary*taxRate);
        System.out.println("Salary After Tax = " + salaryAfterTax);





        /*
write a program  that can calculate the salary afyer tax based on the following requorements the tax rates are:
35% for salary of 130K or more
30% for salary of 100K TO 130K ( EXCLUDED)
25% FOR SALARY OF 80K TO 100K ( EXCLUDED)
20% FOR SALARY LESS THAN 80K
in addtion if the person is married , he/ she will pay 5% less tax
 */


    }
}