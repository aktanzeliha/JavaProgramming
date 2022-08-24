package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {



  /*
palindrome demek tersten yazoildigindada ayni yazilan kelimeler demek
mesela Anna=annA, capital letter onemli degil ayni letterlar kullaniliyor ayni okunuyor
level= level====> palindrome
Java=avaJ=====> is NOT palindrome because ayni okunmuyor
racecar, dad, mom
   */
String word="level";
String reversed="";// reversed demek tersine cevrilmis demek
        for (int i = word.length()-1; i >=0 ; i--) {
   // fori yazip entere basinca for Loop un short cut i olmus oluyor
    reversed+= word.charAt(i);


        }// Asagida equalsIgnoreCase methodu kullanamizin sebebi buyuk kucuk harfleri ignore et demis oluyoruz yoksa
    //    mesela Level kelimesi tersten yazildiginda bastaki l kucuk sondaki l buyuk olmus oluyor yani tatamitle
        //    equal olmamis oluyor, o zaman sistem kabul etmez bu yuzden ignore kisimli olani kullandik
        boolean isPalindrome= word.equalsIgnoreCase(reversed);// burayi ve en sondaki sout u eklersek yazdigimiz
        // kelimenin palindrome olup olmadigini soyluyor , yani true yada false diyor. bunu ve en sondaki sout u
        // yazmazsak yazdigimiz kelimeleri tersten yaziyor bu sistem ama bir asagidaki soutu yazmamzi lazim.
       // System.out.println(reversed);

        System.out.println("isPalindrome="+isPalindrome);


    }
}

