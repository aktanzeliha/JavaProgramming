package week06;

import java.util.Scanner;

public class FibonacciTask {
    public static void main(String[] args) {
  /*
  noun= Fibonacci sequence
  a series of numbers in which each number (fibonacci numbers)
  is the sum of the two preceding  numbers. The simples is the series 1,1,2,3,5,8 etc.
   Write a program to print
         Fibonacci series of n terms
         where n is declared by user :
         0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......

        This is a example of Fibonacci series of 6 terms

        term number        0    1    2    3    4    5    6  7
        Actual value    0,     1,     1,     2,     3,     5,     8  13
 let's  use for looop just for the purpose of COUNTER
       num1       num2        sum
       0           1           1 =======> 2nd term
       1           1           2========> 3rd term
       1           2           3======> 4th term
       2           3           5======> 5th term
       3           5           8  ========> 6 th term
       num1+num2= sum1, num1=sum1
 we need a counter of 5 times iteration
 */

        Scanner scannere= new Scanner(System.in);
        System.out.println(" What is the term number for Fobonacci Series?:");
        int n= scannere.nextInt();// 6
        int num1=0;// it is just a container and hold the number temporarily
       int  num2=1;
       int sum;
       // variables are containers that hod values
        String series =" "+num1+" "+num2+" ";
        boolean check= true;
        for( ; check;){
            if(n>2){
                for (int i = 2; i <=n ; i++) {// if n=6 , it will do 5 times iteration
                    sum=num1+num2;
                    num1=num2;// num2 is empity burada
                    series += sum +" ";
                    num1=num2;
                    num2=sum;
            }
                check= false;
        }else{
                System.out.println("Please enter term number for Fibonacci Series agai?=");
            }

       // for (int i = 2; i <=n ; i++) {// if n=6 , it will do 5 times iteration
         //   sum=num1+num2;
          //  num1=num2;// num2 is empity burada
           // series += sum +" ";
          //  num1=num2;
           // num2=sum;
            System.out.println("series ="+ series);
            System.out.println(" final number in the sequence ="+num2);
/*
 int n = scanner.nextInt();  // 6
        int num1 = 0;
        int num2 = 1;
        int sum ;

        // Variables are containers that hod value

        String series = ""+num1+" "+num2+" ";

        for (int i = 2; i<=n ; i++){   // if n=6, it will do 5 times iteration
            sum = num1+num2;
            series +=sum+" ";
            num1 = num2;
            num2 = sum;
        }
        System.out.println("series = " + series);
        System.out.println("final number in the squence = " + num2);
*** yukarida yoruma ekledigim hocanin chet de paylastigi sey, benimkiyle
ayni cikmadi o yuzden coppy yaptim buraya, benimkinden farki

nerde bulamadim ama benimkide dogru cikti ama butun stepleri tek tek yazdi, hocaninki direk answeri yazdi
 */
        }








    }
}
