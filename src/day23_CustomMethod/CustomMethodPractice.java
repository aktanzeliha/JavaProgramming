package day23_CustomMethod;

public class CustomMethodPractice {
    public static void main(String[] args) {

        helloWorld5Times();// bu ismi asagidaki main static.... ile baslayan kisimda biz vermistik
        // burada direk adini yazinca oradakini burada yazdiriyor,

        System.out.println("------------------------------");

        helloCydeo5Times();

        System.out.println("------------------------------");

        evenNumbers();

    }


    // create a function that can print hello world 5 times ==> helloWorld5Times()
    public static void helloWorld5Times(){// burasi main method icinde olmadigi icin burada yazdirilmaz,
        // yazdirilabilmesi icin main method icinde adini yaziyoruz o zaman direk oradan alip main methosd icinde yazdiriyor

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }


    // create a function that can print hello Cydeo 5 times  ==> helloCydeo5Times
    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }

    }


    // create a function that can print all the even numbers from 1 ~ 10 ==> evenNumbers
    public static void evenNumbers(){

        for (int i = 2; i < 11 ; i+=2) {
            System.out.println(i);
        }


    }
}
