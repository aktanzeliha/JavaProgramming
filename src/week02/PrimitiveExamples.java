package week02;

import java.sql.SQLOutput;

public class PrimitiveExamples {

    public static void main(String[] args) {
  // variables: Primitive Types: Number|| Characters|| Boolean
        /*
        Number: integers-----> byte->short->int->long->decimals( floating points)----->
        float and double
        Characters: char data type
        not primitive however String: collecting of chars

        Boolean: true/ false ( 1000100111)

        char ch ="a";

        */

// data type

/*
Data type variableName= value; 1. declare and 2. initialize at the same line
data type variableName= 1. declare
variableName = value; 2. initialize
datatype  variableName 1, variableName2;
*/

byte num1; // declare a variable
        num1 = 123; // initialize, assign a value
        num1= 121;// re assign a different value
        short num2= 12398; //declare and initialize
        int distance = 1_000_000_000;
        System.out.println("distance ="+ distance);
        long distanceMore= 3_000_000_000L; // passing the limit  so I have to put L
        long distanceShorter= 1_000_000_000; // INSIDE THE LIMIT

        float rate = 1000.5F;
        double dNumber = 123.4;
        System.out.println("-----Casting-----");
        // I will assign num1( byte) to num2 ( short)-----> from smaller datatype to bigger data Type
        num2= num1; // there is implicit casting: done by compiler
        System.out.println("num2="+num2);
        // I will assign distance variable value to num2 variable ----> from bigger datatype to a smaller

        num2=(short) distance; // explicit casting -----> done by developer/ tester
        System.out.println("num2="+ num2);
        char ch ='a';
        System.out.println("ch ="+ ch);

        int x= 5+ ch; // 97 ='a' ascii table
        System.out.println(" x="+ x);
        String str =""+'J'+'a'+'v'+'a'; // empty ""; makes all the chars coming after to turn into Strings
        // important rule of java; java runs from left to right; String+ char= String
        int y= 'J'+'a'+'v'+'a';
        System.out.println("y="+y); // 386

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("===================");

        String EU9 = " EU9 is great";
        /*
        Naming Convertion Examples for avlid and invalid examples;
        average; V-----> we can use  _ and $ under score at the beginning od variablename eu9; ve can use numbers if they are not first characters
        ABC; valid
        " hello"; invalid because it started " it is not acceptable
        sum_ of_ data ; valid
        first-name ; invalid, we can not use - dash
        variable name : starts with small letter, and if you have more word, then we use camel case
        SomeOfData ( naming convention)
        42IsTheSolution: invalid because it can not start with numbers




         */









    }






}
