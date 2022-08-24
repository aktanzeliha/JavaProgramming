package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
//Scanner scan= new Scanner(System.in) burada Scanner den sonra input,
// scan yada baska birseyde yazabilirsin ama basta ne yazdiysan sonrakilerded
// e hep aynisini kullanmalisin
        System.out.println(" Enter yout full name:");
        String fullName = scan.nextLine();

        System.out.println(" Enter your programing language:");
        String programing = scan.nextLine();

        System.out.println(" Enter your age:");
        int age = scan.nextInt();
         /*burada yanlis anlamdiysam int girdigimiz icin tekrar string de donebilmek icin bir kere daha
        scan.nextLine(); i girmemiz gerekiyorki cunku int den bir sonraki yazmasini istedihimiz sey string, school nam, yoksa
         school name yazmama izin vermiyor
         ***  ama bu sorun sadece nextLine methodta cikiyor diger methodlarda problem yok arka arkaya degostirerekkullanilabiliyor  de cikiyor diger */
/*
*** ama butun stringleri ard arda yazip int i en sona yazarsak problem kalmiyor ama arada bir yerde string
*  den int e gecince, scan.nextLine();
* bunun tekrar yazilm,asi gerekiyor yoksa yazi yazmana izin vermiyor sistem
 */
         scan.nextLine();// bunu tekrar yazmazsan sisten okul nameni yazmana izin vermiyor
        System.out.println("Enter your school name:");
        String schoolName = scan.nextLine();

        //System.out.println(" Enter your age:");
        // int age = scan.nextInt();

        System.out.println("fullName: "+ fullName);
        System.out.println("Programing: "+ programing );
        System.out.println("Age: "+ age);
        System.out.println(" School name: "+ schoolName);





    }



}