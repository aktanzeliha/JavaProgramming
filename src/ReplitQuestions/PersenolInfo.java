package ReplitQuestions;
import java.util.Scanner;


public class PersenolInfo {




    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);




                //Enter your code here
                System.out.println("Welcome to the patient portal!");
                System.out.println("Please enter your personal information");
                System.out.println("Enter your first name");
                String name = scan.nextLine();

                System.out.println("Enter your last name");
                String lastname = scan.nextLine();







                // this part is already provided DO NOT CHANGE
                System.out.println("Enter your email");
                 String email = scan.next();
                scan.nextLine();//to capture Enter key press
                System.out.println("Enter your street");
                 String street = scan.nextLine();
                // continue for city

                System.out.println("Enter your city");
                String cityName = scan.nextLine();

                System.out.println("Enter you state");
                String state= scan.nextLine();

                System.out.println("Enter your zip code");
                int zipCode = scan.nextInt();

                System.out.println("Enter your work phone number");
                long workPhone = scan.nextLong();

                System.out.println("Enter your personal phone number");
                long personalPhone = scan.nextLong();


                System.out.println("Enter your age");
                int age = scan.nextInt();

                System.out.println("Enter your height");
                double height = scan.nextDouble();

                System.out.println("Enter your weight");

                double weight = scan.nextDouble();

                System.out.println("Are you married");
                boolean IsMarried = scan.nextBoolean();

                System.out.println("Patient personal information Full name:"+ lastname+ ","+ name +"Address:" + street + cityName + state + zipCode +   "Contacts:"
                        +workPhone +"-7896542314" +personalPhone +" -2406542314," + email + "Age"+age+" Height:"+ height+"Weight:"+ weight + "Married?:");




            }
        }






