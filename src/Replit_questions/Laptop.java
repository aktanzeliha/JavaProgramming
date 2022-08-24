package Replit_questions;

import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {

       /* Scanner scan = new Scanner(System.in);
        int laptopPrice = 0;


        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if (screenSize == 13.3) {
            laptopPrice += 200;
        } else if (screenSize == 15.0) {
            laptopPrice += 300;
        } else if (screenSize == 17.3) {
            laptopPrice += 400;
        }


        System.out.println("Select CPU type:");

        String CPU = scan.next();

        if (CPU.equals(i3)) {
            laptopPrice += 150;
        } else if (CPU.equals(i5)) {
            laptopPrice += 250;
        } else if (CPU.equals(i7)) {
            laptopPrice += 350;
        }


        System.out.println("Select RAM size:");
        int RAM = scan.nextInt();

       if(RAM==4) {
           laptopPrice+=50;
       } else if (RAM==4) {

       }


        System.out.println("Select storage type:");
        String SSD = scan.next();

        System.out.println("Enter memory size:");
        long memory = scan.nextLong();

        System.out.println("Enter screen resolution:");
        String resolution = scan.next();

        System.out.println("Laptop price is: ");*/
// yukaridaki kismi ben yapmaya calistim ama isin icinden cikamadim , asagidakini bir arkadastan coppy paste yaptim.

        Scanner scan = new Scanner(System.in);
        double totalPrice =0;

        System.out.println("Select screen size:");
        double screenSize =scan.nextDouble();
        scan.nextLine();
        System.out.println("Select CPU type:");
        String cpuType =scan.nextLine();
        System.out.println("Select RAM size:");
        int ram =scan.nextInt();
        System.out.println("Select storage type:");
        String storage =scan.next();
        System.out.println("Enter memory size:");
        int memory = scan.nextInt();
        System.out.println("Enter screen resolution:");
        String resolution =scan.next();
        scan.close();

        if(screenSize==13.3){
            totalPrice+=200;
        }else if (screenSize==15.0){
            totalPrice+=300;
        }else if(screenSize==17.3){
            totalPrice=totalPrice+400;
        }else{}


        if(cpuType.equals("i3")){
            totalPrice+=150;
        }else if(cpuType.equals("i5")){
            totalPrice+=250;
        }else if(cpuType.equals("i7")){
            totalPrice+=350;
        }else {}

        totalPrice=totalPrice+ram/4*50;

        if(storage.equals("HDD")){
            totalPrice=totalPrice+memory/500*50;
        }else if(storage.equals("SSD")){
            totalPrice=totalPrice+memory/500*100;
        }else{}

        if(resolution.equals("FULLHD")){
            totalPrice+=100;
        }else if(resolution.equals("4K")){
            totalPrice+=200;
        }else{}

        System.out.println("Laptop price is: $"+totalPrice);



    }
}
