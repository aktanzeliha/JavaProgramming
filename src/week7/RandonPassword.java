package week7;

import java.util.Random;

public class RandonPassword {
    public static void main(String[] args) {
    String source= "ABCDEFGHIJKLMNOPRESTUYVYWZabcdefghijklmnoprstuywxz123456789_@£$";


    // create a loop that will generate 8 character password randomly


        Random random= new Random();// create random object

     //int number= randon.nextInt(10);
       // int randonIndex= random.nextInt(source.length());
        //System.out.println("number"+ number);// buraya kadar her run yap degidinde farkli bir number veriyor ,. rondom number veriyor
// yukarida benim yzdigim error verdi, oscardan coppy paste yaptim

       String password="";

       // Random random = new Random();  // create random object

        int randomIndex = random.nextInt(source.length());


        //int randomIndex;



        for (int i = 0; i < 8; i++) {
        //    int randomIndex = random.nextInt(source.length());
        }

        System.out.println("randomIndex = " + randomIndex);
/*
*** tatamiyle yanlis oldu, oscarin canli yayinindan yaptigi birsey, sonra bul yap biryerlerden
 */

    }
}
