package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
/* create a class called MinNumber and write
 a program that can print the minimum number
n1 & n2
possibility 1= n1 is min
possibility 2= n2 is min
possibility 3= equal

   output=
   100 is the minimum number
   */
        int n1 = 100;
        int n2 = 200;
        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n1 > n2;
        boolean n1Equaln2 = n1 == n2;
        if (n1IsMin) { // if n1 is the nimimum number
            System.out.println(n1 + " is the minimum number");

        }


        if (n2IsMin) {
            System.out.println(n2 + " is the minimum number");


        }
        if (n1Equaln2) {

            System.out.println(n1 + " is equal " + n2);
        }


    }
}