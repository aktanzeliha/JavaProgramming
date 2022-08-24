package day23_CustomMethod;

public class CustomMethodsIntro {

    public static void main(String[] args) {

        System.out.println("Test Started");

        greeting();
        greeting();

        System.out.println("Test Completed");


    }


    public static void greeting(){// burayi main methodun icinde 2 kere cagirdik oarda iki kere yazdirdi, main metodun disindaki boe seyi main
        //metodun icinde cagirmazsak yazdirmiyor

        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");


    }


}
