package week5;

import java.sql.SQLOutput;

public class DynamicSubstring {
    public static void main(String[] args) {

     String researchResult="result count: 34521";
        System.out.println(researchResult.length());// last index then 18 -1=17
        // just taking numbers with substring

        String numbers= researchResult.substring(13,18);
        System.out.println(" numbers="+numbers);

        /*
        instead of static way= indexOf() method----> takes a string / char from you as parameter
        returns the index */


        int columnIndex= researchResult.indexOf(":");
        System.out.println("columnIndex="+columnIndex);
        String numberNew= researchResult.substring(columnIndex+1);
        // ogretmen yaptiginda beginindex cikmadi benimkinde cikti

        System.out.println(numberNew.equals(numbers));
        String researchResultNew ="username: oscar search result count: 12345 more then colum: more information";
        // we will overloaded method of indexOf()
        int firstColumnIndex= researchResultNew.indexOf(":");
        System.out.println("firstColumnIndex +"+ firstColumnIndex);
int secondColumnIndex= researchResultNew.indexOf(firstColumnIndex+1);
// rearach starts from index 10
        System.out.println("secondColumnIndex ="+secondColumnIndex);
    // where the number starts= secondColumnIndex +2
    //whwre the number finishes= secondcOLUNMiNDEX +7

        // yarim kaldi 5 haziran canli yayin videosunun 1saat 45 dakika olan kisimlarinda

    }
}
