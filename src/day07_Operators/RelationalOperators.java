package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
  // >,>=,<,<=
  boolean result1 = 20<40;// true
        System.out.println("result1 = " + result1);

        System.out.println("========");

        boolean result2 = 300>=150; /* burada iki secenek var ya buyu olacak yada esit, eger
         ikisinden biri bile dogru ise sonuc true oluyor. iki sarti birden saglamasina
         gerek yok, zaten hem esit hem buyuk olamaz .   */
        System.out.println("result2 = " + result2);// true

        System.out.println("===========");

boolean results3= 100>=100;// true cunku 100 100 den buyuk degil ama esit birbirine.
        System.out.println("results3 = " + results3);

        System.out.println("========");
        boolean result4= 300>=500;
        System.out.println("result4 = " + result4);// false because neither greater neither equal.
        System.out.println("========");
     /* asagida bir kisinin bankadan loan alabilmesi icin eligible score
      nun 720 ye esit yada buyuk olmasi gerekiyormus.o kisininde
      745 score si varmis. eligiblemi degilmi onu bulacagiz. ya esit yada buyuk olmasi gerektigi
      icin hem >= bu iki isareti birden kullandik.  */


// credit score of 720
  int creditScore = 745;

  boolean isEligibleForLoan = creditScore >= 720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        System.out.println("==========");
        boolean result5 =100<120;// true
        System.out.println("result5 = " + result5);

boolean result6 = 200<180; // false
        System.out.println("result6 = " + result6);

        System.out.println("=========");
         int score =9;
                 boolean hasFailed = score <=59;
        System.out.println("hasFailed = " + hasFailed);

int score1 = 69;
boolean hasPassed= score1>= 50;

        System.out.println("haspassed = " + hasPassed);
        System.out.println("===============");

boolean result7= 45<=60;
        System.out.println("result7 = " + result7);
        System.out.println("==========");
    int x=100;
    int y = 200;
    boolean equal = x==y; /* x in y ye esit olup olmadigi soracaksak iki kere ==
       isateri kullaniliyor , eger bir kere == kulla nilirsa bilgisayar o islemi x i y ye
       esit say gibi algiliyoe esitmi degilmi seklinde degilde */
                  // 100==200
        System.out.println("equal = " + equal);

        System.out.println("=======");
        boolean result8= "Muhtar"=="Good Gay";
        System.out.println("result8 = " + result8);
/*result8 false cikar cunku muhtar ile good
gay birbirinin aynisi cumleler degil.    */
boolean result9= 'A'=='a';
        System.out.println("result9 = " + result9);

/* A ile a birbirinin aynisi olmadigi icin result9 is not correct
   */
   boolean result10="Java"=="Java";
        System.out.println("result10 = " + result10);
        /* java java ile tamamiyle ayni oldugu icin true cevap
        cikti, basta ikinci javanin basinda biraz bosluk kalmis
        yanlislikla, false cikmisti yani bu iki yazi ayni degil
        diye yazi cikti sonra o boslugu silince true sonucu cikti */

        System.out.println("========");
        boolean result11= 100!=200;/* != isareti bu iki sey
        birbirine esit degil demek  */
        System.out.println("result11 = " + result11);

        System.out.println("=======");
        boolean result12="Java"!="Break";
        System.out.println("result12 = " + result12);



    }








}
