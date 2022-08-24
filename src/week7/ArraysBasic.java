package week7;

import java.util.Arrays;

public class ArraysBasic {
    public static void main(String[] args) {
        int code =200;

       int[] codes= new int[8];// my array holds 8 elements, they are all integers type

        codes[0]=200;// first element
        codes[2]= 204;// third element
        codes[codes.length-1]=500;// last element
        for (int i = 0; i < codes.length; i++) {

            System.out.println("codes["+i+"]=" + codes[i]);

        }
        System.out.println(Arrays.toString(codes));

        System.out.println(".............second way of creating arrays ");

        int[] statusCodes={200,201,204,400,401,403,404,500};
    }
}
