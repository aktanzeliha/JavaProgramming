package Replit_questions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        long result=1;// burada int yerine long kullanamak lazim cunku 1 den baslayip sayinin kenidisne kadaxr carparak gidinve
        // cok buyuk sayilar cikabiliyor ortaya , int daha kucuk sayilar icin

        for (int i = n; i >= 1; i--) {
            result *= i;

        }



        System.out.println(result);
}

}
/*
input: 5
output: 120

5 * 4 * 3 * 2 * 1
 */
/*
long result = 1L;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }

        System.out.println(result);

  }
 */