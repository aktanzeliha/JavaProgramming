package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {

//write a program that can convert numbers 0-9 to words
// note= must use ternary
/*if(number >= 0 && number <=9){boyle yazabiliriz ama bizden must use ternary dedigi icin ternary if in short cut i,o yuzden onu kullanacagiz.
*/
int number=11;
String result= (  number>=0 && number<=9)?
        (number==0)? "Zero" :(number==1)? "One" :(number==2)?  "two" :(number==3)?   " three" :(number==4)? " four"  :(number==5)? "five"  :(number==6)? " six"    :(number==7)?  " seven"  :(number==8)?  "eight"  : "nine"

        :" invalid Number";

        System.out.println(result);

    }
}
/* Ternary is a chort cut og if */