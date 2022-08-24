package ReplitQuestions;
import java.util.Scanner;
public class HasJavaArkadasSolution {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int length = word.length();

        if (length < 4) {
            System.out.println("false");//jva yazisini icine alamaz 4 den kucuk olursa
        }
        else if (length == 4) {
            String substring = word.substring(0, 4);//substring de baslama ve bitis indexleri veriyoruz,
            // buyuk  bir string icinden verdigimiz index numberlari arasini yazdiriyor
            if (substring.equalsIgnoreCase("java")) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

        }else {
            String substring = word.substring(0, 4);
            if (substring.equalsIgnoreCase("java")) {
                System.out.println("true");
                return;
            }
            substring = word.substring(1, 5);
            if (substring.equalsIgnoreCase("java")) {
                System.out.println("true");
                return;
            }

            System.out.println("false");
        }




    }
}
