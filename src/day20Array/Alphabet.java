package day20Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {


        char[] alphabets = new char[26];// Z-A
        /* alphabets[0] = 'Z';// 90 axi tabledaki Znin karsiligi 90
        alphabets[1] = 'Y';//89, BU NUMBERLAR ch yi temsil ediyor
        alphabets[2] = 'X';//88
        alphabets[3] = 'W';//87
       boyle de yazabiliriz tek tek ama cok vakit alir onun yerine loop kullanmak adaha mantikli  */


       /* char ch='Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i]=ch;*/ // burasi dogru baska  biy yonten gostermek icin burayi boyke yaptik

            // i yani index number birer  birer artoyor ama char birer birer geriloiyor
            // cunku burada artik Z nin index numberi 0 , y ninki 1  so on, yani birer birer artiyor
        for (char i = 0, j='Z'; i < alphabets.length; i++, j--) {
           alphabets[i]= j;
        }


        System.out.println(Arrays.toString(alphabets));

// ikiside calisiyor
    }




        //System.out.println(alphabets[0]);

    }