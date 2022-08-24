package day18NestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your first number");
            int n1 = scan.nextInt();

            System.out.println("Enter your second number");
            int n2 = scan.nextInt();

            System.out.println("Addition:" + (n1 + n2));

            System.out.println("Would you like to continue");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {// bu inner loopu bug i duzeltmek icin verdik cunku no demedigimiz surece devam ediyordu
                // yani no demiyoruz ama no haricinde ne dersek tekrar soruyordu enter your firs number diye. yes degilde maybe desem yada
                //   herhangi bir number bile girsem sistem sormaya devam ediyor sadece no dedigimde duruyordu
                // oysaki biz sadece yes deigmizde bize tekrar number girmemizi istesin istiyoruz

                System.err.println("Invalid Entry, Please re enter");
                a = scan.next().toLowerCase();

            }

            if (a.equals("no")) {
                break;
            }


        }
    }

}
