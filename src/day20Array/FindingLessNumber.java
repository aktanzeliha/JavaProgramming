package day20Array;

public class FindingLessNumber {
    public static void main(String[] args) {

  int[] numbers={100,500,30,40,600,80,90,-30};

   int minNumber= numbers[0];//10 // assumption, farzediyoruzki minnumber index numberi 0 olan yani 10.sonra kiyaslayarak tek tek deniyor hepsini
        for (int i = 0; i < numbers.length; i++) {


       if(numbers[i]< minNumber){
           minNumber=numbers[i];



            }

        }
        System.out.println(minNumber);
    }
}
