package day16_ForLoopStringPractice;

public class DigitLettersSpesialCharacters {
    public static void main(String[] args) {

        String str = "Cydeo12345School!@%WoodenSpoon";
        String digits = "";//12345
        String letters = "";// CydeoWoodenSpoon
        String specialChars = "";//!@%
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //System.out.println(ch);// buraya kadar yazdigimiz yer string icindekibutun karakterlerin dahil olmasi, burada sistemi run yaparsak tek tek butun karakterler index numberlari kullanilarak yaziliyor
// Buraya kadar butun metni yadirdik biradan sionra if statement kullanarak digit, letter charekter diye ayiracagiz

// buradan sonra if statemenk kullnaark soyle ise digit yaz, soyle ise letter soyle ise charakter diye conditionlarimizi belirleyecegiz
            if (ch >= '0' && ch <= '9') {// digitler 0 ile 9 arasinda bir number baska alternatif number yok  bu ikisi arasinda olmak zorunda o yuzden 0 ile 9 araligindaysa yada bun lara esitse dedik
                digits += ch;

            } else if (ch >= 'A' && ch <= 'Z') {// letter olabilme sartlarindan birisi buyu A ile Buyuk Z arasinda bir yerde olmak ama kucuk letterda olabilir o yuzden birde o sarti kosacagiz

                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {// kucuk a ile kucuk z arasindaysada letter olarak  yaz
                letters += ch;

            } else {// hem letter hemde number degilse specialchar olarak yaz

                // arada bir bosluk varsa yazinin icjnde sistem onuda crakter olarak nkabul ediyor ama biz o boslugu ignore etsin istiyorsak bu sekilde yaziyoruz
                specialChars += ch;
            }}

            System.out.println("letters=" + letters);
            System.out.println("digits=" + digits);
            System.out.println("Specialchar=" + specialChars);




    }}