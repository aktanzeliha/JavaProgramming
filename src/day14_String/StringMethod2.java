package day14_String;

import java.sql.SQLOutput;

public class StringMethod2 {
    public static void main(String[] args) {

String str= "Java is fun, I love learning Java";
        System.out.println("str1 :"+ str);
       String str2= str.replace("Java", "Python");
        System.out.println("str2:"+ str2);

        System.out.println("========================");

      String email="JohnSmith@yahoo.com";
        System.out.println("email:"+ email);
         email= email.replace("yahoo", "gmail");
        System.out.println("email:"+ email);

        System.out.println("===================");

        String sentence=" Java Java Python Python C£ C£ C++  C++ Python Python Python";
        // butun Python lari yok etmemizi ama yerine baska kelime yazmamamizi istiyor.
        // o zaman yine replace methos kullanilir ama replace kismina ici bos tirnak
        // isareti birakirsak boslukla yerlerini degistirmis gibi olur

sentence= sentence.replace("Python", " ".replace(" ",""));
// yukarida baktik cok fazla bosluk kaliyor python lari yok edince bu yuzden ikinci
// bir replace yaparak 2 bosluk olanl yerleri tek boslukla degistirmasini istedik.
sentence.replace("     "," ");
        System.out.println("sentence :"+ sentence);

        System.out.println("=================");

        String s=  "Dog Dog Dog Dog Dog Dog";
        s= s.replace("Dog"," cat");
        System.out.println("s:"+ s);

        System.out.println("====================");
        String S2= "C£ is fun, C£ is cool";// mesela burada
        // birinci C£ nin degilde ikinci C£ nin Java olarak degismasini istiyorsak sadece
        // , ikinci C£ nin onunde bir bosluk var ama birinci C£ nin onunde bosluk yok, " C£"
        // bu sekilde yazarsan onunde bir bosluk olan C£ yi degistirir sadece cun ku sadece io sartlari sagliyor
        S2= S2.replace("C£","Java");
        System.out.println("S2 :"+ S2);
        System.out.println("================");
         String s3= "Java";
         s3=s3.replace("a","e"); // Jeve

        System.out.println("s3:"+s3);

        System.out.println("================");

      String result=" Java Java Java";
      result=result.replaceFirst("Java", "Python");// relace first tede adindanda
        // anlasilacagi gibi ilk java YAZISINIZN YERINE PYTHON YAZ DIFGER JALAV LAR KALSIN DEMEK

        System.out.println("result:"+ result);
        System.out.println("================");

        String result2="C£ is fun, C£ is cool";
        result2= result2.replaceFirst("C£","Java");
        System.out.println("result2="+ result2);
        System.out.println("================");

        String result3="Java";
        result3= result3.replaceFirst("a","e");
        System.out.println("result3:"+ result3);

        System.out.println("================");
        String result4=" Java";
        result4=result4.replaceFirst("va","vo");// bu sekilde yazarakta
        // first letteri keep yapip ikinci letteri deistirtebiliyoruz.
        System.out.println("result4:"+ result4);







    }
}
