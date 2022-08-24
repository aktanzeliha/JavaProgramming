package day19LoopAndStringRecap;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(" Even number");
            } else {
                System.out.println(" Odd number ");
            }


            System.out.println(" Would you like to enter another number? yes/no");
// would you like to enter a nother number cumlesine cevap no olana kadar tekrar tekrar sorsun istiyoruz
            // bu yuzden loop kullanmak zorundayiz, kac defa soracagini bilmedigimiz icinde while loop kulnanak daha mantikli
            String ans = scan.next();


            if (!(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
/*
nereyi tekara tekrar sormasini isyotsak porayi kapasyacak sekilde while loop u koylamlit=yiz
mesela buirada once buraya kadar hepsini yazdik sonra taa en basa while loop koyduk, dusunduk
nereyi tekrar tekrar yazdirmak istiyor diye.
 */
            if (ans.equalsIgnoreCase("no")) {
                System.out.println("Thank you!");
                break;
            }


        }
    }
}