package ReplitQuestions;

import java.util.Scanner;

public class WithoutX_xMyVersion {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word=scan.next();
String result="";
String result2="";
String result3="";
        if(word.charAt(0)=='X' || word.charAt(0)=='x'){
            result= word.substring(1, word.length()-1);
        }
        System.out.println(result);
        if ( word.charAt(word.length()-1)== 'X' || word.charAt(word.length()-1)== 'x'){

            result2= word.substring(1,word.length()-1);

        }

        System.out.println(result2);

result3= word;
        System.out.println(result3);

    }
}
