package day15;

import java.sql.SQLOutput;

public class StringMethod {
    public static void main(String[] args) {

        String str = "   ";// tirnal isaretinin icinde bir bosluk
        // bile olsa empty sayilmiyoe o zaman false cikiyor.
        // ama tirnak isaretinin icinde hicborsey yoksa bir bosluk bile ozaman true cikiyor
        boolean r = str.isEmpty();
        System.out.println(r);


        boolean r1 = str.isBlank();
        System.out.println(r1);
/*isempty de "" tirnak icinin icinde bosluk bile
 olmazssa true oluyor. ama isblank da icinde bosluk olursa ama herhangi bir karekter
 olmazsa true oluyor, "" tirnak isaretinin icinde bosluk yoksada hem empty hem blank sayilioyor
 ama icinde bosluk varsa blank sayiliyor ama empty sayilmiyor
 */
  String str2="Cydeo";
        System.out.println(str2.isBlank());
// hemen yukaridada str2 nin icinde karekterler var ve bu blank mi diye sorduk, false cikti cunku blank degil cydeo yaziyor
        System.out.println("====================");

        String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals((s2)));// false
        System.out.println(s1.equalsIgnoreCase(s2));// true

        System.out.println("===============");
        System.out.println("yEs".equals("yes"));// boyle yazdigimizda false cikar

        System.out.println("yEs".equalsIgnoreCase("yes"));// boyle yazdigimizda true cikar cunku buyuk harf kucuk harf onlari ignore et dedik

        System.out.println("=======================");

        String sentence= " My favourite programming language is Java";
        boolean hasCSharp = sentence.contains("C£");
        boolean hasJava= sentence.contains("Java");
boolean hasJava2= sentence.contains("java");// burada kucuk harfle baslamis java varmi
// diye sorduk, kucuk harfle baslamis java olmadigi icin false cikti

 boolean hasJava3= sentence.toLowerCase().contains("java");// burada kucuk harfle baslayan java
        // var ama uppercase leri lowercase lere cevir  dedigimiz icin true cikti

   boolean r3= sentence.contains("java") || sentence.contains("Java");// jAvA BOYLEDE YAZILABILIR, O ZAMAN BU STAATEMENT FALSE CIKAR CUNKU IKISINDEDE UYMUYOR
// || or operatoru kullanamiyoruz cunku hangi harfi buyuk hangi harfi kucuk yazacaklarini bilmiyoruz



        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
//*** ignore metodu containste kullanamiyormusuz
   /*
   contains de cumlenin tamaminin tamamiytle ayni olup olmadigina
   degilde icinden bir parcasinin olup olmadigina bakmak icin kullaniliyor
   mesela "Java"yi sorduk, cumlenin icinde Java kelimesi oldugu icin true cikti,
   C£ bunu sordugumuzda cumlemizde bu olmadigi icin false cikti.
    */

        System.out.println("=================");
        String input1= " I love JAvA";// BASTA NORMAL Java yazmistik ve 3. sout true cikmisti sonra A lari upper casese cevirdik
        //buyu kucuk harfe bakmadan true cikarsin diye cod yazacagiz 4. de
        String input2="Java";


        System.out.println(input1.equals(input2));// false
        System.out.println(input1.equalsIgnoreCase(input2));//false
        System.out.println(input1.contains("Java"));// true, basta true idi sonra javanin A larini upper yaptik artik false olsu cunku tamamiyle ayni degil artik.

        System.out.println(input1.toLowerCase().contains("java"));// true
        System.out.println(input1.toUpperCase().contains("JAVA"));// true
        System.out.println("====================");

        String a= "Wooden Spoon";
       boolean x= a.startsWith("Woo");
       boolean y=a.endsWith("Spoon");
        System.out.println(x);// true
        System.out.println(y); //true
// we dont have ignore method for startswith and endswith

    boolean z=a.toLowerCase().startsWith("wooden");
    /*
    in order to ignore the case sensitivity we first create the lower/upper case version of string and then
     compare the upper and lower case in the method
     */

        System.out.println(x);
        System.out.println(y);



    }
}
