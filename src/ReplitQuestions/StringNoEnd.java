package ReplitQuestions;

import java.util.Scanner;

public class StringNoEnd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String txt=scan.next();
        int lastindex=txt.length()-1;

        String word= txt.substring(0,lastindex);

        System.out.println(word);
    }
}


