package day21;


import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for(char each  : chars ){
            System.out.println(each);
        }

        System.out.println("-------------------------------------");

        String sentence = "Wooden Spoon";

        String[] words =  sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");// burada @isaretten oncesini be sonrasini ayir demis olduk
       // sadece " " boyle yparsak her boslukta ayir demek

        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String[] sentences =s.split("\\. ");// . dan ayitmak istiyorsak mutlaka \\. bu sekilde yazmak lazim yoksa farkli
        // farkli yerlerden ayiriyor ama \\. verince her noktada ayiriyor


        System.out.println(Arrays.toString(sentences));



    }
}
