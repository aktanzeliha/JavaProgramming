package ReplitQuestions;

import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String subjectName1, subjectName2, subjectName3, subjectName4, subjectName5;

        double score1, score2, score3, score4, score5, sum;


        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        subjectName1 = scan.next();
        score1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        subjectName2 = scan.next();
        score2 = scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        subjectName3 = scan.next();
        score3 = scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        subjectName4 = scan.next();
        score4 = scan.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        subjectName5 = scan.next();
        score5 = scan.nextDouble();



        System.out.println("Summary:" + subjectName1 + " - " + score1 + ", " + subjectName2 + " - "
                + score2 + ", " + subjectName3 + " - " + score3 + ", " + subjectName4 + " - " + score4 +
                ", " + subjectName5 + " - " + score5);
        System.out.println("Your average score is: "+ (score1 + score2 + score3 + score4 + score5)/5);
        System.out.println("Thank you for using grader!");
        System.out.println("Goodbye!");


    }
}
