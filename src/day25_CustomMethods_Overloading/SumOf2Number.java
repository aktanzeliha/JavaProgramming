package day25_CustomMethods_Overloading;

public class SumOf2Number {
    public static void main(String[] args) {// main method olmadan program runable olmaz o
        // o yuzden mutlaka main methodumuz olmak zorundq

        int sum = sumOf2Numbers(10, 20);

        System.out.println("sum = " + sum);

        int sum2 = sumOf3Numbers(10,20,30);// 2. sorunun cevabi, 3 integerin toplamini bulmak ile alakali
        System.out.println("sum2 = " + sum2);

        int sum3 = sumOf4Numbers(10,20,30,40);// 3. sorunun cevabi
        System.out.println("sum3 = " + sum3);
/*
cod bas ka abska day larde baska baska yerlerde  bile olsa basinda publiuc yazdigi icin her zaman istedigimiz sayfadan geri cagirabiliytoruz
 */

    }

    public static int sumOf2Numbers(int num1, int num2){// burada codu yaziyoruz, yukarida main methodun icinde
        // sadece  adini yazip  buradan cagiriyorzu codu.
        return num1+num2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }



}
/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers
	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */
