package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

   /*
1. Write a program that can return the frequency of a char from a String
			Ex:
				str = "AAABBBC"
				ch = 'A'
			Output:
				3
 */

   String str="AAABBBC";
   char ch='A';
   int frequency=0;//1+1+1= her A ya denk geldiginde sistem index numberi 1 artiracak
        for (int i = 0; i <str.length() ; i++) {// formulu boyle yaziyorsak i<=str.length yazamayiz cunku
            // index number str.lenght ye esit olamaz index number 0 dan basliyor galiba ondan emin
            // degilim ama hocanin kesin soyledigi set i< str.lenght olmasi lazim ayni zamanda = olamaz dedi.
            //sanirim soyle yazabilirixz ama i<= str.lenght -1.

//i= indexes of str
   char eachChar=   str.charAt(i);// eachcHAR = each character of str

  if(ch==eachChar){// if given char is matching with the eachChar, then ch is appeared  in the string

// frequency++; BOYLE YAZARSAKTA SONUC DOGRU CIKAR
      frequency +=1;// boyle yazinca da ayni sinucu veriri


        }






    }

        System.out.println(frequency);
}}
