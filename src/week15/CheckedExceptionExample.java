package week15;

public class CheckedExceptionExample {
    public static void main(String[] args) {

        try {


            Thread.sleep(5000);// checked exception : inside the method it throws an exception so we need to handle iot
            // there are 2 ways of handeling it
            //1- throws InterruptedException
            //2- try- catch method

            System.out.println(" Hello after 5 second sleep ");
        }catch (InterruptedException e){

            e.printStackTrace();
    }
}}