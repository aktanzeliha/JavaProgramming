package ReplitQuestions;

import java.util.Scanner;

public class GradeCalculation {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
String subjectName1, subjectName2,subjectName3,subjectName4,subjectName5;
subjectName1= scan.next();
subjectName2=  scan.next();
subjectName3=scan.next();
subjectName4= scan.next();
subjectName5= scan.next();
Double score1,score2, score3,score4,score5, sum,averageScore;
score1= scan.nextDouble();
score2=scan.nextDouble();
score3= scan.nextDouble();
score4=scan.nextDouble();
score5=scan.nextDouble();
sum= scan.nextDouble();
averageScore= scan.nextDouble();

sum= score1+score2+score3+score4+score5;
averageScore= sum/5;


        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        System.out.println("Please enter subject name number 2 and score for this subject");
        System.out.println("Please enter subject name number 3 and score for this subject");
        System.out.println("Please enter subject name number 4 and score for this subject");
        System.out.println("Please enter subject name number 5 and score for this subject");
        sum= score1+score2+score3+score4+score5;

        System.out.println("Summary:"+ subjectName1+" - "+score1+", "+subjectName2+" - "+score2+", "+subjectName3+" - "+score3+", "+subjectName4+" - "+score4+", "+subjectName5+" - "+score5 );
        System.out.println(" Your average score is"+ averageScore);



        /* Write the program that will calculate the average grade. Use 5 String variables and
        6 double variables to hold the subject and the grade value. Build a summary
        with all the information by concatenating the subjects and grades.
        Then calculate the average grade and print display the average score too.

        Execution flow with example:

        Welcome to the Grader!
                Please enter subject name number 1 and score for this subject
                Math
        5.0
        Please enter subject name number 2 and score for this subject
                Biology
        4.2
        Please enter subject name number 3 and score for this subject
                English
        4.4
        Please enter subject name number 4 and score for this subject
                Chemistry
        4.8
        Please enter subject name number 5 and score for this subject
                Music
        3.4

        Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
        Your average score is: 4.36
        Thank you for using Grader!
                Goodbye!   */







    }

}


