package ReplitQuestions;

import java.util.Scanner;

public class AlejandroEmail {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

/*
Alejandro has many emails and only has time
 to read the emails that refer to him. Check
  if his name is found in the email and if it
   does print "read", but if his name is not in
   the email print "don't read"
 */

  String a= scan.nextLine();
String b= "Alejandro";
b.equalsIgnoreCase("alejandro");
    if(a.contains("Alejandro")){
        System.out.println("read");



    }else {
        System.out.println("don't read");
    }






    }
}
