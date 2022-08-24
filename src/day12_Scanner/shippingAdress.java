package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class shippingAdress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();


        input.nextLine();
        System.out.println("Enter your city name");
        String cityName= input.nextLine();


        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();


        input.nextLine();
        System.out.println(" Enter your street name");
        String streetName= input.nextLine();


        System.out.println("Full name: "+ fullName) ;
        System.out.println("Building Number: "+ buildingNumber);
        System.out.println("city name: "+ cityName);
        System.out.println("State name: "+ state);
        System.out.println(" zip code: "+ zipCode);


input.close();// bunu yazmayi unutma




 /*
 1- eneter your full name
 2-enter your bulding number
 3- enter your city name
 4- enter your state
 5- eneter your zip code
 6- enter your street name
  */









    }
}
