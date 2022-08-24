package week15;

public class ErrorExample {
    // somehow you created a bad   code that generatesinfinite loop
// we usually do not handle errors , we just dont do it.
    /*
    errors are due to bad coding, it is a run time error
    it means you can see it when yiou are running the code.
    it means your code is nor COMPILE you dont understan there
    is an error before running it.
     */
    public static void main(String[] args) {
        try {


            deathlyMethod();
        }catch ( StackOverflowError error) {
            System.out.println(error.getCause());
            System.out.println(error.getMessage());
        }
        System.out.println("codes after error executes or not ");
    }
    static  int counter =0;

    private static void deathlyMethod(){

        System.out.println(counter++);
        deathlyMethod();
        // infinitive errior veriyor ama sen run yapinca goruyorsun codun hatali oldugunu run yapmadan anlayaiyorsun kirmizi cikarmiyor





        }




        // devami var

    }



