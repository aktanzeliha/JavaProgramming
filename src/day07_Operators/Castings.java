package day07_Operators;

public class Castings {

    public static void main(String[] args) {
float averageScore = 20.5F;



byte num1= (byte) averageScore;// explicit casting
short num2= (short) averageScore;// explicit casting
int num3= (int)averageScore;// explicit casting
long num4= (long)averageScore;// explicit casting
float num5= averageScore;// no casting
double num6= averageScore;//implicit casting

        System.out.println("num1 ="+ num1);
        System.out.println("num2 ="+ num2);
        System.out.println("num3 ="+ num3 );
        System.out.println("num3 ="+ num3);
        System.out.println("num4 ="+ num4);


/* What we have learned so far:
1- main method
2-print() and println(), print olunca yazmak istedigimizi
 yazdiktan sonra line birakmiyor ama println
olunca sonrasinda bos bir line oluyor.
3- escape sepuences
4- primitives and string variables
5- concatenation
6- casting( explicit)
=======================
Aritmatic operators:
20/6=3
20.0 /6= 3.333333
10/2=5
10/3= 3.333333
remainder=numerator-(denominator * result)
            10     -(3*3)=1

10 % 3 = 1
45/8= 5.625
45-(8*5)=5
45 % 8=5 // 45 i 8 e bolunce remainderi 5 cikiyor demek buradaki % isareti
 */


    }
}
