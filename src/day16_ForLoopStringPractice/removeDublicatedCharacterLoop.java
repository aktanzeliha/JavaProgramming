package day16_ForLoopStringPractice;

public class removeDublicatedCharacterLoop {
    public static void main(String[] args) {

      /*  2. Write a program that can remove the duplicated characters from a String
        Ex:
        input:
        AABBCCBC

    Output:
        ABC

        Hint: You can add each characters of the string into another String
        Condition: the character is not contained in the other String yet before you are adding

    */


        String str = "AABBCCBC";
        String result = "";
//            i<=7 yada i<8 ikiside ayni sey, yani i<=str.(length)-1 de yazabiliriz yada i< str.(lenght)de yazabiliriz,
//            -1 ile 7 ye denk geliyor -1 yazmazsakta 8 e denk geliyor birinde kucuk ve esittir diyoruz gigerinde sadece kucuktur diyoruz esit demiyoruz
        for (int i = 0; i < str.length(); i++) {//

            String ch = "" + str.charAt(i);// represent each of the character of str
            if (!result.contains(ch)) {// if the character is not contain in the result
                result += ch;// the character will be added to the result
/*
**** contain method Stringde kullanilir char methodta kullanilmaz bu yuzden error verdi basta o yuzden String ch diye yazip
* esittirden = den sonra bos tirnak isareti koyunca sistem onu string kabul ediyor ve contains method kullanmaiza izin veriyor
 */
            }}
                System.out.println(result);
    /*    String str = "AABBCCBC";

        String result = ""; //"ABC"

        // i <= 7 ===>  i < 8
        for(int i = 0; i < str.length(); i++ ){ //i: represents the all the index numbers of str (start from 0)

            String ch = ""+str.charAt(i); // represents each Character of str

            if( !result.contains(ch) ) { // if the character is not contained in the result
                result += ch; // the character will be added to the result
            }

      }
        System.out.println(result);*/



            }
        }
