package Replit_questions;

public class PrintEvenFrom80To20 {
    public static void main(String[] args) {

int i=0;
        for ( i = 80; i >20; i --) {
            if (i % 2 == 0) {


                System.out.print(i+" ");

            }

        }
        System.out.print(i);// burada en yukarida 1>20 dedik yani 21 e kadar loopun icinde islem yapacak ve i=20 oldugunda loop dan cikacak
        // cun ku loop i> 20 oldugu surece calisacak, i=20 oldugunda loop tan cikacak ve biz zaten i yi loopun disinda beliorledikki loopdan
        // ciktigimizdada i yi yazdirabilelim diye, en sona sonunda bosluk olmayan 20 yazmamaizi istiyordu sisuitem bu yuzden 22 ye kadar loopun icinde
        // her rakamdan sonra bosluk olaacak sekilde yazdirdik, 20 den sonra bosluk olmasin istedigi icin loopu 21 ile sinirlayip i=20 oldugunda loopdan cikincada
        //i nin degeri olan 20 yi yazdirsi istedik.
    }
}

/*
Write a for loop that prints all even integers
 from 80 through and including 20. Seperate
 each number with a space
 */