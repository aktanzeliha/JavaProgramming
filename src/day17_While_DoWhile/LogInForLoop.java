package day17_While_DoWhile;

import java.util.Scanner;

public class LogInForLoop {
    public static void main(String[] args) {

  /*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();


        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println(" You logged in");
        } else {

            int attempts = 3;// 3 2 1 // burada attempts i 3 ile sinirladi, asagida attempts >0 dedi ama 3 ile sinirlandigi icin 3 kere izin veriyor username yazmamiza
            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0) ;

            System.out.println("Incorrect username or password, please re-enter");

            System.out.println("Enter your user name");
            username = scan.next();

            System.out.println("Enter your password");
            password = scan.next();

            attempts--;

        }

        if (username.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("Logged in");

        }else{
            System.out.println(" Your account is looked");
        }
scan.close();
    }

}


