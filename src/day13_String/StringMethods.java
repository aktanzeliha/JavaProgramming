package day13_String;



public class StringMethods {
    public static void main(String[] args) {


 String word =" Cydeo";
         //     01234
 char thirdChar = word.charAt(2);
        System.out.println("thirdChar: "+ thirdChar);

       /* char tenthChar= word.charAt(9);// burasi once note seklinde degildi, burayi calistirinca sistem error verdi cunku 10 karekter yok cydeo nun icinde
        System.out.println("tenthChar"+ tenthChar);

        */


        System.out.println("===============");

        String s1="Batch 25 is the best batch";
// uzerini secince bir yazinin en altta kac karekterden
// olustugunu soyluyor, bosluklarida karekter olarak sayoyor yanliz.
 int totalChars= s1.length();
        System.out.println("totalCharts ="+ totalChars);

        System.out.println(" ====================");
// eger bize cumlenin son karekterini sorsaydi dusunecegiz nasil son index numberi bulabiliriz diye
char lasrChar = s1.charAt( s1.length()-1);
        System.out.println(" last characters ="+ lasrChar);

        System.out.println("=======================");


        String str="wooden spoon";// kucuk harfle yazilan cumleyi buyuk harfle yazmaya yarayan sisitem
        str=str.toUpperCase();
        System.out.println(str);

        System.out.println("========================");

        // Todat is a great day to lear java programing language.
        String sentence="Today is a great day to lear java programing language.";
        sentence=sentence.toUpperCase();
        System.out.println( sentence);

    }
}
