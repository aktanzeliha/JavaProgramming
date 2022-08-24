package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
      /*  3. Write a program that can return the unique characters from a String
        Ex:
        input:
        AABCCD
        output:
        BD
        Hint: You will need indexOf() and lastIndexOf()
        if the first and last index numbers of the character are same, then it's unique
                */
// *** unique demek sadece bir kere olan karekterlere unique denir mesela
        //AABCCD BURADA B VE d UNIQUE CUNKU DIGERLERI BIRDEN FAZLA CIKIYOR KARSIMIZA

String str="aaabccc";
//          0123456
String result="";

        for (int i = 0; i < str.length(); i++) {// i<= kucukten sonra birde == kullanmak istiyorsak lenght den 1 cikarmayi unutma
          char ch= str.charAt(i);

            if (str.indexOf(ch)== str.lastIndexOf(ch)){// mesela burad charda b yi sectik, bu line da diyorzki b nin goruldugu ilk index number kac?
                //== esittir b nin goruldugu son index numbere, bu iki number esitse demekti b sadece bir ke gorulebiliyor Stringimizin icinde
                // bir kere gorulmeside unique oldugu anlamina geliyor. ama goruldugu ilk index numberi last index numbere esit degilse
                // bu demek oluytorki birden gfazla b var yazimizin icinde ve bu unique olmadigi anlamib=na geliyor
                result += ch;

            }



    // loop kullanacagiz cunku 7 tane karekter var stringimizde
    // yani 7 kere bu statementi yazmaya gerek yok
}


        System.out.println(result);


    }
}
