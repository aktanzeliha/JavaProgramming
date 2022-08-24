package day24_CustonMethod;

public class BreaksfastTask {
    public static void main(String[] args) {



  /*
  Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

   */


        initials("cydeo", "school"); //

        System.out.println("----------------------------");

        domain("Cydeo.School@amazon.com");

        System.out.println("-----------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (
                String email : emails) {
            domain(email);
        }

        System.out.println("-----------------------------");

        nameOfMonth(11);
        nameOfDay(4);
daysInMonth(5);

    }



    //1. Create a method that can display the initials of the person.    initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);


    }


    //2. Create a method that can display the domain of the email.  domain(String email)
    public static void domain(String email) { // Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){  // 95

        String name = "";

        if(number >= 1 && number <= 12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name = " + name);

    }


    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
String dayname="";
        if(number >= 1 && number <= 7){
            dayname = (number==1)?"Mon" :(number==2)?"Tues" :(number==3)?"Wed" :(number==4)?"Thurs" :(number==5)?"Fri"
                    :(number==6)?"Sat":" Sun";

        }else {
            dayname=" Invalid";
        }
        System.out.println("name = " + dayname);
    }

    //5. Create a method that can print how many days a month has


    public static void daysInMonth(int number) {

        switch (number) {

            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println(" 31");
                break;
            case 4:
                System.out.println("31");
                break;
            case 5:
                System.out.println("30");

                break;

            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("30");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("30");
                break;

            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("30");
                break;
            default:
                System.out.println("30");

        }


        // ageGroups(int age)


    }


}

