package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        // assignment : =
        int number =100;
        System.out.println("number ="+ number); // 100
        number=200;
        System.out.println(" number="+ number);// 200 /*cumku enson numbera hangi
        // degeri vermissem sistem enson degeri hatirlar yani 200*/
        System.out.println("========================");
        String word =" Java Programing";
        System.out.println("word ="+ word);
        System.out.println("=================");
        word=" Wooden Spoon";
        System.out.println(" word="+ word); // sisten en son word u ne olarak tanimladiysan onu hatirlar ve onu yazar.
        // en son word= Wooden Spoon oldugu icin sonucta Wooden Spoon yazdi.
        System.out.println("===============");
        word= "Cydeo";
        System.out.println("word="+ word);
        word="123";
        /* mesela word=123 yazsam sistem hata verir cunku wordu ben String ile assign yaptik, belirttik yani  ve string ile sadece
        kelime yazabiliriz number yazamayiz, number yazmak istiyorsak string yerine int  le yazmaliydik
         ama 123 u tirnak isareti icinde yazarsak bu sefer o number sayilmiyor yani word="123" o zaman direk 123 yazar.*/
        System.out.println("word="+ word);// burada 123 turnak sareti icinde verildigi icin yazdi
        System.out.println("123"+1);// burada da 123 ile 1 i topla,az direk yanyana yazar yani sonuc 1231 olur
        // String ile sadece text yazabilirsin. sadeec tirnak isareti icinde numberlari direk yazdirabilirsin
        // ama islem yaptiramazsin yani toplayip cikarip carpip bolmez.
       //eger bir numberi int ile assingn yapmissak ta onu tirnak isareti icinde yazarsak sistem yine hata verir
         number =100;
         //number ="2000" buradaki gibi double tirnak icinde yazamayiz in ile essignment yapilan seyleri

        System.out.println("===========================");

// Additional Assigment:
        int x=100;
        System.out.println("x="+x);
        System.out.println(x+200); //300 */  buradan sonuc 300 cikti, birsonraki System.out.println de
        // x in degerini yine 100 alir buradaki sonuc 300 ciktigi halde cunku x e yeni deger vermedim o yuzden hafizada x hala 100.
        // x=x+200; bunu yazarak x e yeni deger assign yapmis oluyorum ve x in yeni degerini artik computer 300 kabul ediyor.*/
        //x=x+200;// x in yeni degerini eski degeri yani 100 plus 200 yani 300 olarak algilayacak bir sonraki stepte.
        // x e yeni deger vermenin short cut i x+=200 dir
//x=x+200 bu boylede yazilabilir ama short cut i x +=200 dir 
        x +=200;
        System.out.println("x="+x);// 300

String str = "Wooden";
str += "Spoon";
        System.out.println("str = " + str);

        System.out.println("================");
double num1 =2.5
;
        System.out.println("num1 = " + num1);// 2.5

num1 += 5.5;// bu original num1 kac ise ona 5.5 ekle demek
   double availableBalance = 1000.50;
   // deposit 300$
availableBalance +=300;/* ben bunu yazinsa sistem arkada availableBalace yeni bir deger veriyor, onuda original
degerinin uzerine 300 ekleyerek yapiyor. 1000.50+300=1300.50   */
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("================");

        // withdrawing 500$
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);
/* string ge += uygulayabilirsin wooden spoon da oldugu gibi
wooden a spoon u ekledik sonradan ama  string e -= cikartma islemi uygulanamaz.  */

// withdrawing 20$ then depositin 400$

availableBalance -= 200;// availableBalance=600.5
        availableBalance +=400;//600.50+400=1000.50
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("================");
        double salary =50000.50;

        salary *= 2;// bunu salary= salary*2 yazsanda ayni sonuc cikar ama bizim yaptigimiz short cut.
        System.out.println("salary = " + salary);
        System.out.println("========");
        double doge =0.00000001;
        doge *=1000000;

        System.out.println("doge = " + doge);
        System.out.println("============");

        double num2 = 25000;
        num2 /=2;
        System.out.println("num2 = " + num2);

        System.out.println("===========");
      double num3= 100;
      // %=
        num3 %= 3;/* boyle yazinda num3 nin original degeri olan
        100 u 3 bolunce remainder olarak ne kalir demek istemis
         oluyoruzki 1 kalir, sistemi calistirinda 100 un 3 bolunden
         remainder olan 1 soniucunu verir  */
        System.out.println("num3 = " + num3);

        System.out.println("============");
        int amound =127; // cents
        int quarters = 127 /25;
        int cents = 127 % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("===========");
        int y = 300;
        y %= 16;/* y in original degeri olan 300 u 16 ya
        bolunce reminder olarak ne kalir onu buluyor bu sekilde */
        System.out.println("y = " + y);
        System.out.println("===========");

        int balance = 3500;
        // insurance fee: $153
        balance %= 153;
        System.out.println("balance = " + balance);/* sonuc 134 cikiyor, yani diyorki hesabimda
        3500 var ve herat insurance icin 153 cekilecek, 153,153 cekile cekile hesabimda artik
        insurancemi odeymeyecegim ne kadar param kaliyor diyor . bu yuzden reminderi bulmamiz gereliyordu.   */

        System.out.println("============");



    }









}
