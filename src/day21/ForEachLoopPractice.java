package day21;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for(String  each : words ){
            System.out.println( each.charAt(0)+ ""+ each.charAt( each.length()-1 )  );// bu string oldugu icin sanirin ""
           // kullanmamiz gerekti arada
        }
// birs ve last kareterini yazdir herbir elementin

    }
}
