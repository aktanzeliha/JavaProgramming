package day01_JavaIntro;
import utilities.StringUtility;
public class test {
    public static void main(String[] args) {
        //String str="Wooden Spoon";
//StringUtility.printEachChar(str);

  String str="Java Programin Language";

        StringUtility.printEachChar(str);

        System.out.println("=====================");
/*
programi burada yazmadik, utility paccage nin
altinda yazdik, burada sadece cagiriyoruz tek tek i leri
 yazmadan sistem yazdigi cumletyi char cahar yano harf harf ayiriyor
 */
String s1="Wooden Spoon";
String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);
        System.out.println("==================");

        String word="Java";



      //  boolean palindrome = StringUtility.isPalindrome(word);

       // System.out.println("palindrome = " + palindrome);

        System.out.println("-----------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {
           // if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

    //    System.out.println(count);

  //  }
//System.out.println("-----------------------------------------");

    String s2 = "aaaaabbbbbbccccddddd";

   // String nonDup = StringUtility.removeDuplicates(s2);

      //  System.out.println(nonDup);


}
//**** birseyler yanlis oldu ama anlamadim