package day17_While_DoWhile;

import java.util.Scanner;

public class MarrigeProposalMyDeneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String ans="";
        ans = scan.next().toLowerCase();

        if (ans.contains("yes")) {// yukarida String kullandigimiz icin if statementin icinde ans== "yes" yerine ans.contains("yes" kullandik
            // String degilde int yada baska birsey olsaydu == kullnabilirdik ama stringde cintains olmak zorunda if statementin ici
            System.out.println("Congurants");
        } else {
            System.out.println("goodbye");
        }


    }
}
