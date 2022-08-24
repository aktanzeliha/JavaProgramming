package day18NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter your username");
        String u = scan.next();


        System.out.println("Enter your password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged In");


        } else {


            for (int i = 1; i < 3; i++) {// yukarida zaten bir kere giriyor username and paswordu ve geroye 2 hakki kaliyor, bu kisim o iki haklik kismi
                System.out.println(" Incorrect username or password");


                System.out.println(" Enter your username");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();




            if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                System.out.println("Logged in");

                break;//loopun icinde ne zaman dogru username  ve passwordu girince loopun break olmasi icin break kullandu=ik, 3 hakki var belki ikincide dogru girecek ,
                // dogru girdigi halde tekrar sormasin diye if statement kullanip dogru girdigi anda loopu finis yap demis oluyoruz
            }}
if(!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {


    System.err.println("Your account locked, Please contact support team");


}
    }
scan.close();

    }

}// yout account locked yazdirdiktan sonrada letter yazmama izin veriyor nedense bulamadim