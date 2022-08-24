package week15;

import java.util.Scanner;

public class MultyCatchExample {
    public static void main(String[] args) {
        System.out.println(" hello enter an integer number");
        int x= 5;

        Scanner scanner = new Scanner (System.in);

        int y= scanner.nextInt();
        try {


            System.out.println(x / y);// trhere is a possibility that you might get AritmaticException
        }catch (RuntimeException r)  {
            r.printStackTrace();// try ile baslayan kisimdan buraya kadarki kismi yapinca yanlis bile olsa
            // bunu sayma ve bundan sonraki codlari yaz demis oluyoruz.
            //0 yazmazsak yanlios cikmiyor ama yanlois cikma ihtimalinde burayi  yok say demis oluyoruz try and catch ile,
            // dogru ise zaten bir sikinti yok. ama compile verecek ise complie veren line dan sonraki codlari yazdiramiyoruz
            // normalde ancak bu try and catch ile sonraki codlari yazdirabiloiyoruz
        }
        // below lines of code very important for my yest case, even if i get exception i dont want execution to stop
        System.out.println("How are you ?");
        System.out.println(" Some more lines of code");







    }
}
