package day42_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("------------- Test 1------------");

        System.out.println("Hello");
        Thread.sleep(3000);// normalde compiler error veriyordu
        // yukariya main in yanina throws Inter..... yazinca butun compiler
        // errorlari kaldirdi, try catch metodtan daha paratik bu yokm

        System.out.println("Cydeo");



        System.out.println("----------------Test 1 Completed--------------");

        System.out.println("------------- Test 2------------");

        System.out.println(" Hello");
        Thread.sleep( 3000);
        System.out.println("Batch 25");
    }
}
