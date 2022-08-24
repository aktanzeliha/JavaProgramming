package onlineLesson;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MinNum {

    public static void main(String[] args) {
        Integer [] num ={ 2,4,6,8,};

        int min = Collections.min(Arrays.asList(num));

        System.out.println("min num is "+ min);
    }
}


