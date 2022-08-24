package ownCalisma;

import java.util.Scanner;

public class ilhami {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int inhabitants = scan.nextInt();

            int i = 0;//day



            if(inhabitants==0){
                System.out.println("---- EXTINCT ----");
                //System.out.println("Day "+i+ " ["+ inhabitants+"]");

            }else {
                for (i = 1; i <=inhabitants+4; i++) {

                    inhabitants=inhabitants/2;

                    System.out.println("Day "+i+ " ["+ inhabitants+"]");



                    // System.out.println("Day "+i+ " ["+ j+"]");

                }
                System.out.println("---- EXTINCT ----");
            }


         }}

