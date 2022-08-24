package day10_NestedIf;

import jdk.swing.interop.SwingInterOpUtils;

public class NestedIfIntro {
 public static void main(String[] args) {
  int score = 95;
  System.out.println("Passed");
  System.out.println("Failed");
  System.out.println("===========");
  if (score >= 60) {
   System.out.println("Passed");
  } else {
   System.out.println("Failed");
  }

  System.out.println("===========");

  int score2 = 400;
  if (score2 >= 0 && score2 <= 100) {// this part means if the score is valid
   if (score2 >= 60) { // if the student passed the exam.
    System.out.println("Passed");


   } else {// if student failed the exam
    System.out.println("Failed");
   }
  } else { // is the score is not valid
   System.out.println("  Invalid score");


   System.out.println("=========");

   int age = 25;
   boolean hasId = true;
   if (hasId) {// if the person has Id


    if (age >= 21) {// if the person 25 years old or older
     System.out.println(" Eligible to buy alcohol");

    } else {
     System.out.println(" Not eligible to but alcohol");
    }
   } else {
    System.out.println("You must have an Id to buy alcohol");

   }
  }
  System.out.println("===============");
  int number = 7;
  if (number >= 1 && number <= 7) {// if the number is a valid number
   //yani haftanin 7. gununun hangi gun oldugunu bulmaya
   // calisacagiz.bize 8. gun hangisi diyebilirdi o zaman number
   // is not valid cikmasi lazim cunku bir haftada 8 gun yok
   // o yuzden pre condition oluyor yani once istenilen numberin
   // olma olasiligi olma zorunluluguna bakiyoruz sonra secenekleri
   // yaziyoruz.1-7 arasi sayilar  valid cunku bir haftada 7 gun var
   if (number == 1) {
   System.out.println(" Monday");
  } else if (number == 2) {
   System.out.println(" Tuesday");
  } else if (number == 3) {
   System.out.println("Wednesday");
  } else if (number == 4) {
   System.out.println("Thursday");
  } else if (number == 5) {
   System.out.println(" Friday");
  } else if (number == 6) {
   System.out.println("Saturday");
  } else {
   System.out.println(" Sunday");

  }
 }else
{// if the number is nor valid
 System.out.println("invalid number ");


}

/*ozetle nested if de iki tane conditions
 oluyor. birinci kondisini yaziyoruz genelde
 valid olma sartini yaziyoruz ve taaa en sona
    ilk yazdigimiz valid conditionun tersi durumunu
     ifade eden else yi yaziyoruz ama bu else yi bu
     ilk actigimiz curly parantezin yanindan baslayarak
     yaziyoruz. ilk covalid conditiondan sonra ikinci if
     conditisonumuzu yaziyoruz sonra else if diye devam ediyoruz.
      aradaki bu else if ler ilk valid condition ile bu valid conditionun
      else sinin arasinda kalmasi lazim.*/

  System.out.println("=========");

  }
}