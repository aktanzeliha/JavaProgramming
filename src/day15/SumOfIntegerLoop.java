package day15;

public class SumOfIntegerLoop {
    public static void main(String[] args) {
        // write a program that can calculate the sum of all integers between 1to 100
        double sum = 0;// burada double yazarsan sonuc 1.0, 21.0 gibi decimalle verir, int yazarsan whole number seklinde verir
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println(sum + " ");

/*
int  sum = 0;
        // +1 +2 +3.....+100

        for (int i = 1; i < 101; i++) {
            sum += i; // bu sira ile 1 den baslayip numnberlari birbiri ile toplayarak gider

            System.out.print(sum+" ");
        }
 */

        }


    }
}
