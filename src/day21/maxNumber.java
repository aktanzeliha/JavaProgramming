package day21;

public class maxNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];// 20

/*
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max ){ // if there is element in the array that's greater than the current max number
                max = numbers[i]; // assigning greater number to variable max
            }
        }
 */

        for (int number : numbers) {// for each yazmanin short cut i "number.for " yazip enter dedigimizde for each i otomatik yaziyor
            if(number > max){
                max =number;
            }
        }
//

        System.out.println(max);







    }
}
