package day15;


import day03_EscapeSequences.Err_VS_Out;

public class EmailTask1 {
    public static void main(String[] args) {

        /*create a class called EmailTask1.
        Assume that email address is constructed
        by person's first name and followed by an
        underscore and last name.
 Write a program that can swap first name with
 last name in the email ( saparates by an underscore)

 if the email doesnt contain on underscore print the given input email.
 ex:
 input: mike_tyson@gamil.com
 output:tyson_mike@gmail.com
  */
        String email = "mike_tyson@gmail.com";
        String firstName = email.substring(0, email.indexOf("_"));// ikinci verilen ending index yazilmiyor bir onceki yaziliyor unutma
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@")); // yani @ i yazmayacak, @ den bir onceki letter e kadar yazacak yani
        String rest = email.substring(email.indexOf("@"));// burada da ending vermedik yani rest i @ den basliyor cumlenin sonuna kadar yaz diyor

        email=lastName+"_"+firstName +rest;
        System.out.println(email);


    }
}
