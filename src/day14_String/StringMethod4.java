package day14_String;

import java.sql.SQLOutput;

public class StringMethod4 {
    public static void main(String[] args) {

 String str="Cydeo";
 String str2=str.repeat(4);
        System.out.println(str2);

        System.out.println("==============");
        String s1="Wooden Spoon";
        String s2=s1.repeat(100);// kac kere ayni kelimeyi yazmak istiyorsan oi numberi yaziyorsun
        System.out.println(s2);

        System.out.println("========");
        System.out.println("FADY\n".repeat(15));
/*
\n yazinca yanyana degilde alt alta yaz demek istemis oluyoruz. 15 defa alt alta yazdi
 */

        System.out.println("==================");

        String name= "Java";
        System.out.println((name+" ").repeat(5));
// tirnak isareti icnde bosluk birakirsak kelimelerin arasinda bir tane bosluk birakir 



    }
}
