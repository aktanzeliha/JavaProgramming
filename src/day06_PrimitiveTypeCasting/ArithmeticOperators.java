package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {


    public static void main(String[] args) {

   /*
+ addition
- subtract
* multiplication
/ division
% remainder
in maths
10/4= 2.5
100/3=33.3333....
in Java
10/4=2
100/3=33

    */
        System.out.println("12"+ 1);// 121 , concatenation
        System.out.println(10+20);// 30  addition
        System.out.println(100-50);// 50 subtraction
        System.out.println(10*5); // 50 multiplication
        System.out.println(100/3);// 33
        System.out.println(10/4);// 2
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        // one of them must be desimal to get a decimal answer.
        /*integer/integer= integer
        integer/decimal=decimal
        decimal/integer=decimal
        decimal/decimal=decimal

         */
        int a=100;
        double b=a/6; // 16.0 the answer
        // integer/integer= december because it is in the double

        System.out.println("b");
        double c=(double)a/6;
        System.out.println("c");

        System.out.println(100D);


        System.out.println();









    }
}
