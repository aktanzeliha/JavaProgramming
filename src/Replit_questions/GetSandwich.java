package Replit_questions;


import java.util.Scanner;

public class GetSandwich {
    public static void main(String[] args) {


/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance
 of "bread" in the given string, or return string "nothing"
 if there are not two pieces of bread.

Example:

input: breadjambread
output: jam

input: xxbreadjambreadyy
output: jam

input: xxbreadapple
output: nothing


input: breadbutterbread
output: butter

 */
        Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
        int firstIndex=0;
        int lastIndex=0;
        int lastIndexTmp=0;

        firstIndex = str.indexOf("bread");
        firstIndex = firstIndex + "bread".length();

        lastIndex = str.lastIndexOf("bread");

//there should be at least two breads
        if(firstIndex != -1 && lastIndex != -1 && str.length()>10)
        {
            System.out.println(str.substring(firstIndex,lastIndex));
        }
        else
        {
            System.out.println("nothing");
        }
    }
}
