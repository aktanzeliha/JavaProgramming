package day13_String;

public class StringIntro {
    public static void main(String[] args) {
        String name = " Wooden Spone";
        String name1 = " Wooden Spone";
        String name2 = " Wooden Spone";


        String name3 = " Wooden Spone";
        String name4 = " Wooden Spone";
        System.out.println("name==name2");// true
        System.out.println("name2==name3");// true
        System.out.println("name3==name4");// true

        System.out.println("===============");


        String str1=new String("Wooden Spoon");// burada String yazip parentez acinda
        // direk double tirnak isareti yazinca otomatik olarak "original" yazisi cikiyor
        // original yazisini sen yazrsan error veriyor, kendi yazmasi lazim
        String str2=new String("Wooden Spoon");
        String str3=new String("Wooden Spoon");
        String str4=new String("Wooden Spoon");



        System.out.println("str1==str2");// false

        System.out.println("str2==str3");//false

        System.out.println("str3==str4");//false








    }}






