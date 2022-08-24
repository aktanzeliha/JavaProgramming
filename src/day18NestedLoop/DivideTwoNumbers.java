package day18NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {


/*
write a program that can divide 2 positive number
without using / and * operators
 20/6=3 remainder of 2
 a=20
 b=6
 a-=b; // a=14
 a-=b;// a=8
 a-=b;// a=2
 x=100
 y=8

 while(a>=b){
 a-= b;
 count++;
}

/ ve * kullanamayacagimiza gore cikarma islemi yaparak bolme
isleminin sonucunu bulmaya calisacagiz. kac kere cikarilabiliyorsa
o kadar var demekytir o sayinin icinde
*/
int a=30;
int b= 7;
int count=0;

while (a>=b){
   // a-=b;// boylede yazilabiliyor a=a-b; seklinde de yazilabiloiyor
    a=a-b;
    count++;

}

        System.out.println(count+" remainder of "+a);


    }
}
