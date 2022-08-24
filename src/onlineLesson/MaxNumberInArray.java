package onlineLesson;

import java.util.Arrays;
import java.util.Collections;

public class MaxNumberInArray {
    public static void main(String[] args) {


        Integer [] num ={2,4,7,5,9};

        int max= Collections.max(Arrays.asList(num));

        System.out.println("Max number is : "+ max);
    }
}
