package day18NestedLoop;

import java.util.Scanner;

public class NestedLoopPracticeValidAgeCoppy {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


while(true){
            System.out.println("Enter your age:");
            int age = scan.nextInt();
// burada 1 tane invalid olma durumu var,  yas araligi dogru girilmemis olabilir
            while( !(age >= 1 && age <= 120)) { // while the age is invalid
                System.err.println("Invalid Entry, Please re-enter your age");
                age = scan.nextInt();
            }

            System.out.println("Would you like to continue?");
            String a =scan.next().toLowerCase();
// burada da diger bir invlid olma durumu var oda devam etmek istiyomusun sorusuna cevep  olarak  yes   ve nmo dan bak     cevAP VERILMIS OLMASI
            while( !(a.equals("yes") || a.equals("no")) ){ // while the answer is invalid
                System.err.println("Invalid Entry, Please re enter. Would you like to continue?");
                a =scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }

        }


        scan.close();








    }
}
