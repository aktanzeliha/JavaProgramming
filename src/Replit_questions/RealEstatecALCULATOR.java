package Replit_questions;

import day22_MultiDemantionArray.MultiDimentionalArrayIntro;

import java.util.Scanner;

public class RealEstatecALCULATOR {
    public static void main(String[] args) {

        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        switch(houseType) {
            case "Condo" :
                propertyPrice = 50000;
                break;
            case "Townhouse" :
                propertyPrice = 75000;
                break;
            case "Single Family Home" :
                propertyPrice = 95000;
                break;
        }
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice  += numberOfBedrooms*30000;

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if(backyard== true) {
            switch(houseType) {
                case "Condo" :
                    System.out.println("Backyard is not available for condo!");
                    break;
                case "Townhouse" :
                    propertyPrice += 5000;
                    break;
                case "Single Family Home" :
                    propertyPrice += 5000;
                    break; }
        }
        System.out.println("Do you have garage?") ;
        garage = scan.nextBoolean();
        if(garage== true) {
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if(garageSpots<=10) {propertyPrice += 20000*garageSpots;
            } else {
                System.out.println("Pardon, it's not a public parking!");
            }
        }
        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if(metroAccessibility<=1)
        {propertyPrice += 10000;
        } else if(metroAccessibility<=3) {
            propertyPrice += 5000;
        }

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if(highwayAccessibility<=1) {
            propertyPrice += 15000;
        } else if (highwayAccessibility<=5) {
            propertyPrice += 8000;
        } else if (highwayAccessibility<=20) {
            propertyPrice += 4000; }

        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if(schoolScore>8 && schoolScore<=10) {
            propertyPrice += 45000;
        } else if (schoolScore>=4 && schoolScore<8) {
            propertyPrice += 20000;
        } else {
            propertyPrice += 5000;
        }
        System.out.println("Does any of your family members smoke?") ;
        smoking =  scan.nextBoolean();
        if(smoking== true) {
            propertyPrice -= 5000;
        }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+ propertyPrice+"$");







    }
}
