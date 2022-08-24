package ReplitQuestions;

import java.util.Scanner;

public class PrintMiddleLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

/*
You have a word, do the following:

When word has odd number of characters and:
3 or more characters, print middle letter
oak ==> a
javav ==> v
Single character, print that character 3 times
# ==> ###
q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
java ==> av
apples ==> pl
#$%^&* ==> %^
2 characters, print those 2 characters twice
@@ ==>@@@@
$$ ==>$$$$
hi ==> hihi
 */
String word= scan.next();



      /*  if (word.length() %2==1){
 int lastIndex   = (((word.length()-1)/2));
    System.out.println(word.charAt(lastIndex));


} else if (word.length()% 2==0  && word.length()>=4) {

      int beginningIndex= word.length()/2;
      int endingIndex   =(word.length()/2)+1;


            String word2= word.substring(beginningIndex,endingIndex);
            System.out.println(word2);

} */

        boolean oddNumber = (word.length())%2==1;
        boolean evenNumber= (word.length())%2==0;

        if(oddNumber){
            if(word.length()==1){
                System.out.println(word.repeat(3));
            }else {
                System.out.println(word.charAt((word.length()/2)));
            }
        }else if(evenNumber){
            if(word.length()==2){
                System.out.println(word.repeat(2));
            }else{
                System.out.println(word.charAt((word.length()/2-1))+""+word.charAt((word.length()/2)));
            }
        }else{
            System.out.println("invalid");
        }


    }
}
