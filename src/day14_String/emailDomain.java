package day14_String;

import java.sql.SQLOutput;

public class emailDomain {
    public static void main(String[] args) {
        String email = "Cydeo.School@gmail.com";// Domain demek. gmail, hotmail vs

        int beginningIndex = email.indexOf("@") + 1;// her email adresinde domain @
        // bu isaretten"@" sonra baslar o yuzden +1 dedik

        int endingIndex = email.lastIndexOf(".");// domain kismi com dan onceki "."
        //     noktada bittigi icin endinge "." yazdik


        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println(domain);

        System.out.println("==================");


        String str1 = "Java is fun, Java is cool, I love Java";
        //                  0123456789
        String s1 = str1.substring(0, 10 + 1); // Java is fun , vermesini bekliyoruz bu kisimdan
        int beg = str1.lastIndexOf(" J") + 1; // begiinneri nin cumleyi sondan taramasini
        int end = str1.lastIndexOf(","); // sondan ilk comma

// istedik lastIndexOf kullanarak be  sondan baslamak suretiyle ilk J ILE BASLA
// DEMIS OLDUK BU SEKILDE YAZARAK// cumlenin sonuna I love Java ekledi ben bu yorumlari yazdiktan sonra , o yuzden biraz degistirdik iclerini

        String s2 = str1.substring(beg, end);
/* Java is cool yazmasin i bekliyoruz.substring de
 sadece beginnerini yazdik cunku sonuna kadar ne
 varsa yazsin istoyoruz o yuzden ending yazmadik*** ben bunlari yazdiktan sonra cumlenin sonuna I
 love Java ekledi
 o yuzden bitraz degistirecegim yazdiklarimi*/

        String s3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println(s1);

        System.out.println(s2);

        System.out.println(s3);

   // system hata verdi ama neden verdi anlamadim. yorumlarla alakali birseyler yazdi

    }
}
