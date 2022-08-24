package day20Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B';
        letter[2] = 'C';
        ....
         */

        /*
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++ ) { //i: index numbers 0 ~ last index
            letters[i] = (char)j ;
        }
         */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }

        System.out.println(Arrays.toString(letters));  //[A~Z]



        System.out.println("===============");




        char[] letters2 = new char[26];
        char chr='Z';
        for (int i = letters2.length-1,j ='Z' ; i >=0 ; i--,j--) {
            letters2[i]=chr;


        }
        //System.out.println(Arrays.toString(letters2));
        System.out.println(Arrays.toString(letters2));
// enson alfabeyi tersden yazmaya calistigim yer olmadi yeni class da yaptik onu adi alhabeth
    }

}