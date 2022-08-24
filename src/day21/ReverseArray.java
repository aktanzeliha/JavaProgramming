package day21;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};
        //               0    1   2   3

        int[] reversed = new int[numbers.length]; //to mke sure that the array has enough capacity to contain all the elements of first array

        /*
                 j            i
        reversed[0] = numbers[3];// burada parentz icleri j artiyor, i azaliyor o yuzden asagida i--, j++ yazdik
        reversed[1] = numbers[2];
        reversed[2] = numbers[1];
        reversed[3] = numbers[0];
*/

        int j = 0;
        for (int i = numbers.length - 1 ; i >= 0; i--, j++) {// numbers.forr ndeyince bunun short cuti oluyor, inverse olanin
            reversed[j] = numbers[i];
        }




        System.out.println(Arrays.toString(reversed));






    }
}
