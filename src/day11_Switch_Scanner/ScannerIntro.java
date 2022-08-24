package day11_Switch_Scanner;

import java.util.Scanner;

//import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
Scanner input =new Scanner ( System.in);
        //Scanner input = new Scanner(System.in);// in means input
// Sacnner in icine yazdugimiz yazi make sense olmali ,
// tek bir haft falan olmamali


        System.out.println("Enter an integer");
int num1=input.nextInt();

        System.out.println(" Enter a decimal");
double num2= input.nextDouble();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multipliucation: "+ ( num1*num2));
input.close();// bunu yazmazsan surekli sana hatirlatma
// geliyor her run yapmak istediginde o yuzden en sona bu close u yazman lazim.
// ama bu close islemini en sona yapman lazim., close scannerden sonra islem yapamazsin cunku

    }


    }

/*
scanner yazmanin short cut i main methoddan sonbra
buyuk harfle baslayan Scanner yaziyor entere basiyorsun
 */