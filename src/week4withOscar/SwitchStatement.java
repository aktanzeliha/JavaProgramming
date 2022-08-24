package week4withOscar;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        // ask the user for whitch floor the user is living
        System.out.println(" Which floor are you living?");
        int floorNumber;// declaring my variable no value
        floorNumber = input.nextInt();
        System.out.println(" with if statement");
        // with if else statement
        if (floorNumber == 1) {
            System.out.println(" You are living  at first floor");
        } else if (floorNumber == 2) {
            System.out.println(" You are living  at second floor.");
        } else if (floorNumber == 3) {
            System.out.println("You are living  at third floor");
        } else {
            System.out.println(" invalid floor number 3");
        }


        input.close();// bunuda yapmak tavsiye ediliyor yoksa surekli warning veriyor

// Switch statement
        System.out.println(" with switch statement");
        switch (floorNumber) {
            case 1://condition1
                System.out.println(" You are living  at first floor");
                break;
            case 2:// condition2
                System.out.println(" You are living  at second floor");

                break;
            case 3:// condition3
                System.out.println(" You are living  at third floor");
                break;
            default:
                System.out.println(" There is no such a floor");
// *** if i pur default ortaya biryere onunda soinuna mutlaka break yazmaliyim ama
// en sona koyuyorsan break yazmama gerek yok
      /*  1- if else , if else
      2-Switch
      a-it can only perform
      b-
      c-
      d-
      e-


       */





        }
    }
}
