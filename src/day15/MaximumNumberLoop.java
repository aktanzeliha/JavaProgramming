package day15;

import java.util.Scanner;

public class MaximumNumberLoop {
    public static void main(String[] args) {
 /*
  write a program that asks the user to enter a number for 5 times. return the maximum number
  */
        Scanner scan = new Scanner(System.in);
        int max = -2147483648;// any user entered number will be greter then -2147483648( bu numarayi sanirim intern etten buldu)
       // this numbere is smaller integer numbermis
        for (int i = 0; i < 5; i++) {// 5 number girmemizi istedigi icin 0 ile 5 den kucuk olan 4 u aldik, toplam 5 kere number giorebilecegiz boyleikle
            System.out.println("Enter a number");
            int num = scan.nextInt();//1,2,3 4,5
            if (num > max) {// if the user entered number is greter that current maximum number
                max = num;
            }


            System.out.println("max:" + max);
        }
    }
}