package week4withOscar;

import java.util.Scanner;// we need to use this class, we have to import this library

public class scannermethods {
    public static void main(String[] args) {
        /*
        scanner is 0 class and from this class we create object so we can get input from console
         */
/*
datatype variable name/referencename=somevalue
scanner scan/input/justsomename= new Scanner(System.in)
new Scanner(System.in).....>object of Scanner= theis object can now reach our methods


 */
        Scanner scan= new Scanner( System.in);
        System.out.println(" Output");
        int x=5;
   x= scan.nextInt();
        System.out.println("x=" + x);
        System.out.println("Enter an intyeger number");
        int y= 0;
                y=scan.nextInt();
int sum=x+y;
        System.out.println("sum ="+ sum);



    }


}
