package day10_NestedIf;

public class nameOfMonth {
    public static void main(String[] args) {
     /* eger bizden istenilen seyde pre condition varsa nested if kullanilioyor yani
     * mesela bu numara kacinci aya ait diyor ama ay 12 number ile sinirli 12 den buyuk
     * number verirse invalid olur bunuda sistemde gostermesi lazim. bun
     * uda sistemde gostermesi lazim sonra verilen numaranin kacinci ay oldugunu
     * bulmasi lazim. buna pre condition deniliyor  */
// signe if = for one condition
// if & else =for 2 condition only
// multi-branch if= for 3 or more conditions
//nested if=pre conditionun oldugu durumlarda kullanilir

        int number = 15;
        String result = " ";// temporary "" yaparak gecici bir
// sey vermis oluyoruz resul a, bunu yapmazsak hata veriyor sistem,
// resultun ne oldugunu bilmiyoruz suan o yuzden kesin bir sonu
// yazamiyoruz cunku if lere gore belirlenecek resultun ne oldugu
        if (number >= 1 && number <= 12) {
// if the number is valid (1-12)

            if (number == 1) {

                result= "january";
            } else if (number==2) {
              result=" February";
            } else if (number==3) {
             result="march";
            } else if (number==4) {
             result=" april";
            } else if (number==5) {
             result="May";
            } else if (number==6) {
                result="jun";
            } else if (number==7) {
               result= "july";
            } else if (number==8) {
                result=" august";
            } else if (number==9) {
             result="september";
            } else if (number ==10) {
              result= "october";
            } else if (number==11) {
               result=" november";
            } else {// burada sadece  else yazdik cunku number 11 den sonra tek
                // bir option kaliyor oda number 12, baska secenek olmadigi icin
                // sadece else statementi kullanmamaiz yeterli, yani number==12 diye belirtmeme
                // gerek yok cunku baska option yok 12 den baska .// zaten 12 den buyukse invalid
                // result verecek bir program yazdigim icin tek option 12 kalmis oluyor
            result=" december";
            }
// else lerden onceki curly parentezler sadece bir stement olunca gerek yok, yani tek sart var
// else lerin icinde number==3 se diyor mesela , tek statement yani curly parantez sart degil
            // ben b urada silmedim onlari ama ogretmen sildi video da
// ama ogretmen siz alyas include curly parentez dedi just in case
        } else {// if the number is not valid
            result = "Invalid";
            System.out.println("");


        }
        System.out.println(result);

    }

// numberimizda 15. ayin adini sordugumuz icin sonuc invalid cikti , 15. ay olmadigi icin

}
