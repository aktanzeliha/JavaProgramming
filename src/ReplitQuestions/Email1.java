package ReplitQuestions;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        /*
        Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: barakobama@gmail.com

output: barakobama@gmail.com
         */

        Scanner scan= new Scanner(System.in);
        String email= scan.nextLine();

        if(email.contains("_")){





       email=email.substring(email.indexOf(0)+1,email.indexOf("@"))+"_"
               +email.substring(email.indexOf(""),email.indexOf("_"))
               + email.substring(email.indexOf("@"),email.indexOf("."))
               +".com";

            System.out.println(email);

        }else {
            System.out.println(email);
        }






    }


}
