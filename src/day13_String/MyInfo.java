package day13_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int age = 0;
        String gender = "";
        String fullName = "";
        long phoneNumber = 0;
        int zipCode = 0;
        String schoolName = "";
        String CityName = "";
        String stateName = "";
        int buildingNumber = 0;
        String streetName = "";
// *** yukaridaki gibi ayri ayrida yazilabiuliyor yasa "int age= scan.nextInt" bu sekilde tek cumle
// *** halinde de yazilabilioy. ogretmen tek cumle seklinde yazdi ben ayri ayri yazdim ikiside calisti

        System.out.println("Enter your age");
        age = scan.nextInt();

        System.out.println("Enter your gender");
        gender = scan.next();
        scan.nextLine();// bu additional nextLine() method
        // bunu yazmazsam fullname ini yazmana izin vermeden phone numbera geciyor
        System.out.println("Enter your full name");
        fullName = scan.nextLine();// if the previous scanner is not nextLine() method
        // then we need to provide one more nextLine()merhod.

        System.out.println("Enter your phone number");
        phoneNumber = scan.nextLong();

        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();

        scan.nextLine();// ekstra nextLine() method

        System.out.println("Enter your school name");
        schoolName = scan.nextLine();// her nextlIne()method kullanildiginda bir onceki metodu kontol et, eger bir
        // onceki method nextLine() degilse ust kisma ektra bir sacn.nextLine() elemek gerekiyor, diger metodlar arka arkaya gelebiir
        // problem yok bu sadece nextLine icin gecerli

        System.out.println("Enter your city name");
        CityName = scan.nextLine();

        System.out.println("Enter your state name");
        stateName = scan.next();

        System.out.println("Enter your building number");
        buildingNumber = scan.nextInt();

        scan.nextLine();// ekstra nextLine() methos

        System.out.println("Enter your street name");
        streetName = scan.nextLine();

       /*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age ( int --> nextInt() )
			2. Enter your gender (String- One word ONLY --> next())  nextLine()
			3. Enter your full name (String- Multiple words --> nextLine())
			4. Enter your phone number (long --> nextLong())
			5. Enter your zip code (int --> nextInt())   nextLine()
			6. Enter your School name (String- Can be Multiple words --> nextLine())
			7. Enter your city name (String- Can be Multiple words--> nextLine() )
			8. Enter your state name (String- One word ONLY --> next())
			9. Enter your building number (int --> nextInt())  nextLine()
			10. Enter your Street name ( nextLine() )
		MAKE SURE USER CAN ENTER ALL THE INPUT
		Display all the inputs that user entered in following order in sperate lines:
			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode
			6. school name
 */
scan.close();


        System.out.println("Full name: " + fullName);// buranin tamamini copy paste yaptim ama ustekileri kendim yazdim.
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: \n\t"+buildingNumber+" "+streetName+"\n\t"+CityName+", "+stateName+" "+zipCode);
        System.out.println("School name: "+schoolName);

/*
yukarida Address yazmamizi istedigi kisimda adresten sonra bir sonraki line gecmemizi ve paragraf basindan degilde
icerden yazmaya baslamamizi istedigi icin \n\t kullandik.
 */


    }
}
