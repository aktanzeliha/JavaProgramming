package day15;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
                    input:
                        firstName = "cyDEo";
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */
String firstName="cyDEo";
String lastName="SCHOOL";

//firstName= firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
//burasi bize first letter olan c yi buyuk harfle verir + burasida kalan letterlari kucuk harfle yazar verir.
        // ilk harften sobnrasi icin sadece beginning number olan 1 i verdik, ending number vermezsen o o kelimenin
        // kalaninin hepsini buyuk harfe ceviriri zaten
// yukarida parentez icinde (0,1 ) yazdik cumnku sadece ilk hafri buyuk olsun
// istiyoruz, nerede baslayip nerede buyuk harfle yazmayi  birakacak onu verecegimiz
// index numberlarla belirliyoruz, indezx numver zarekende begining  en basa yazdigin
// index numbere ait olan letterden ama ending yazdzigin index numberdan bir kucujk
// olan lettere kadar yazar, bu yuzden 0,1 yazzinca zaten index numberi 1 olan lettere
// buyuk harfe yazmayacak demektir
//
        //System.out.println(firstName);
        /*
        yukaridaki cozumun birde charAt()yontemi kullanilarak yapilan cozumu var.

         */
       firstName=(""+firstName.charAt(0)).toUpperCase()+ firstName.substring(1).toLowerCase();
        System.out.println(firstName);
       /*
       yukaridaki gibide cozulebilirdi ama ilk cocum daha mantikli olabilir cunku first letter
        i capital yapmak istiyoruz ve toUpperCase, charAt() ta calismiyor sadece Stringde
         calisiyor.  charAt() i Stringe cevirmek icin parentez icine aldik ve basina "" isareti koyduk
          o zaman sistemn bunu stringe cevrilmis kabul ediyor ve toUpperCase kullanmama izin veriyor bu sekilde yapmazsan toUpperCase hata veriyor
        */

  lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(lastName);
       // System.out.println(firstName+" "+lastName); boyledee yazabilirsin sonucu
        String fullName= firstName+" "+lastName;
        System.out.println(fullName);// bu sekilde de sonucu yazdirabiliriz, sonuz istedigimiz gibi ciktigi surece hepsi dogru
/*
b ykaridaki yazdigmiz kod ile ismini ve soyadinin henagi harfi buyuk, lucuk yazilsin farketmez, bu kod ile herzaman asdinin ve
soyadinin ilk harfi buyuk digerleri kucuk yazilmis olacak
 */



}
}
