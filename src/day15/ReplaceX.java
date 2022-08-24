package day15;



public class ReplaceX {
    public static void main(String[] args) {

 /* 2. Write a program that asks user to enter a word. and replace all the x or X with character a
        Input:
        xcodeX
        Output:
        acodea ,
  hem kucuk x hemde buyuk X i replace yapacagimiz icin iki kere replace method kullanacagiz  */
        String str = "xcodeX";
        String result =str.replace("x", "a").replace("X","a");
                                           //acodeX                      acodea
       /* yukarida iki kere degisiklik yaptigimiz icin replace methodu iki kere cagirdik.
       ilk original kelimemiz xcodeX IDI, bnu string str ile tanimladim, degismis halinide string
       result olarak tanimladik ve sout un icine result yazim en son halini yazmasini istemis olduk
       kelimeyi kendi verdigi icin scanner kullanmaya gerek
        kalmadi, scanner sadece ilk bilgiyi bizim girmemizi
        istedigi zaman kullaniliyoir
        */


        System.out.println(result);
    }
}
