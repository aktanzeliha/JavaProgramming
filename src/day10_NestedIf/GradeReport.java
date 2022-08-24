package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /* 90-100 excellent
         * 80-89 great
         * 70-79 good
         * 60-69 passed
         * 0-59 failed */
        //solution1= if statement
        int grade = 150;// grade yi 150 verinve sonuc in valid cikiyor,
        // 0 ile 100 arasinda bir number verince de o number neye karsilik geliyorsa o cikiyor
     /*   if (grade >= 0 && grade <= 100) {

            if( grade>= 90 && grade<=100){// burada yukarida zaten valid number 100 den kucuk
                // olmak zorunda dedik yada 100 e esit olabilir. bu yuzden burada tekrar grade <=100 yazmamiza gerek yok
                // cunku onu zaten yukarida kontrol edecek. ben yazdim sonuc yine dogru cikti ama
                // ogretmen tekrar yazmaniza gerek yok dedi.
                System.out.println("Excellent");
            } else if (grade>=80 && grade<89) { // butun else if lerde ikinci kismi yazmaya gerek yok
                // zaten hepsinin ikinci kisimlarini bir onceki if lerde test ediyor
                //bu statement false cikardi eger grade<=80 olsaydi
                System.out.println("Great");
// buraya 70-79 arasini yazmayi unutmusum,
            } else if (grade >=60 && grade <=69) {// ogretmen hic bir else if in ikinci kismini
                // yazmadi zaten bir oncekinde kontrol edildi o diye. yani burada da grade <= 69
                // yazmaya gerek yok bir oncekinde kontrol ediliyor o option
                System.out.println("Passed");
            } else if (grade >=0 && grade <= 59) {
                System.out.println("Failed");
            }


        } else {
            System.out.println(" invalid grade");
        }

String result="";
        System.out.println( result);

/*result yazmak icin system.out.println( "excellent");gibi
olan kisimlari sildi ve yerine result= excellent yazdi, bir
alt satirda da resul= great sonrakinde result=good diye butu system.out...lari sildi
bu sekilde result u initilize yapmis oldu . eger oyle yapmak istemiyorsan en son String result yazdiginda
 = yapip " " tirmak isareti koyarsak onu initilize yapilmis sayiyormus yada bu sekilde yapabiliriz */



 /* simdi yukaridaki islemi yapmistik, sonraki derslerde nested if i ogrendik ve buraya
 geri donup bu statementi birde nested if te yani if in short cut iyla yazalim diye karar verdik
    o yuzden asagida tekrar yazacagiz short cut halini */
// :-)) sonra vazgectik yazmaktan
        //int grade1= 150;
        //String result =(grade >= 0 && grade <= 100)? ) */

        // nested if degigi birsuru option olan, ternaries dedigide if in short cuti galiba, oyle anladim.
        //simdi yukaridaki if programinin short cut ini yapacagiz.

        // solution2= use ternaries only
        String result = (grade >= 0 && grade <= 100) ? (grade >= 90 )? "Excellent" : (grade >= 80)? "Great" : (grade >= 70)? "Good" : (grade >= 60)? " Passed" : " Failed" : "Invalid Score";

        System.out.println( result);


    }                    //( burasi pre condition)                                                                                                                               // buradaki : els epre conditionun else si
/*
     pre conditiondan sonra direk else yaz pre conditiondan sonra,                                                                                                            // bu yuzden arka arkaya iki tane else var
     bir onceki else de aradaki conditionlarin else si, ensin da bir tane else olmasi lazim.
     pre conditionun else si eger pre condition tutmazsa ne olurun cevabi,
     burada invalid score olur.once pre condition arkasina pre conditionun
     else si sonraki butun conditionlari bu pre ile  pre conditionun else sinin
     arasina yazacagiz.
     pre conditiondan sonra bir tane daha if kuruyoruz, sonrasindakiler
     else if, else if diye devam ediyor.else=: if=? conditionumuuzu ifden once parantez acip oraya yaziyoruz.
    */
/*birde solution3 var oarada pre condition ile pre conditionun else sini normal
 if condition seklinde yaziyorsun ama aradaki butun condionlarda short cut kullaniyorsun */

}
