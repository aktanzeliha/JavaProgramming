package week06;

public class BasicLoopExamples02 {
    public static void main(String[] args) {

      //  write a proggram  that displays the number of even numbers between 5 to 50 (include)
        // i am asking how many



        int countOfEven= 0;
        for (int i = 5; i <= 50 ; i++) {
         if( i%2==0  ){
             ++countOfEven;

         }
        }

        System.out.println("countOfEvenNumber="+countOfEven);
    }
}
