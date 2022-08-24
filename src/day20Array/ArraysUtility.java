package day20Array;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

    int[] numbers={10,9, 0,1,2,20, 4,6,7,8};

        System.out.println(Arrays.toString(numbers));// () parentez icine sadece numbers yazsak sistem bize yukaridaki parentez icindeki numberlari vermez
       //eger Array ise  soutun parentezinin icine Array.toString(numbers) yazmak gerekir

Arrays.sort(numbers);// sorts the array in ascending order, burada yukarida parantez icinde verilen numaralari kucukten buyuge
        // dogru siralayip yazdirdi asagida
        System.out.println(Arrays.toString(numbers));
    }
}
