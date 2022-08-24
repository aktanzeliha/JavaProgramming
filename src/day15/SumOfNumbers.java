package day15;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
//3. Write a program that can calculate the sum of all integers between
//1 to 100
        int  sum = 0;
        // +1 +2 +3.....+100

        for (int i = 1; i < 101; i++) {
            sum += i; // bu sira ile 1 den baslayip numnberlari birbiri ile toplayarak gider

            System.out.print(sum+" ");
        }


        System.out.println("===============");

// burada 5 tane number girmemizi be sonunda da bu 5 numberin toplamini gostermesini istiyor
        // bizden sayi yazmamizi istedigi icin scanner kullandik,
        // 5 tane number girmemizi istiyor, asagidaki gibi tekrar tektar 5 defa sout yazabiliriz yada loop
        // kullanarak 5 kere yazmak zorunda kalmayiz
        int total = 0;
        Scanner scan = new Scanner(System.in);
        for(int i=1; i<= 5; i++) {


            System.out.println("Enter a number");
            total += scan.nextInt();
        }
       /* System.out.println("Enter a number");
        total += scan.nextInt();

        System.out.println("Enter a number");
        total += scan.nextInt();

        System.out.println("Enter a number");
        total += scan.nextInt();

        System.out.println("Enter a number");
        total += scan.nextInt(); */
        System.out.println("total ="+ total);

    }
}
