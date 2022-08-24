package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
    String name= "Steven";
  int age= 19;
  String citizen = "USA";
  boolean isEligible = age>= 18;
        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("===============");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income= 40000;
        boolean isEligible2= creditScore>= 700 && age2 >= 21 && income>=60000;
/*  burada bir kisinin bankadan credi cekip cekemeyecegini ogrenmeye calsiyoruz.
 bankadan para cekebilmesdi icin burada 2 sarti birden saglamasi gerekiyor.
   birincisi crediscoru en ya en az 700 yada 700 deb buyuk olmadi birde
    yasi ya 21 yada 21 den buyuk olmali. bu sekilde bir cok sarti bir arada saglamasi
     gereken durumlarda && bu isareti kullaniyoruz ve oisle buradaki gibi yapiliyor */

        System.out.println(name2 +" is eligible for loan  = " + isEligible2);

/* eger ektra bir sart daha saglamasi gerekiyor ise && isateri kullanarak
* yukariya boolean eligible2 nin yanina && bu isareti kullanarak herseferinde oncesinde
* && isareti yazmak sarti ile istedigimiz kadar yeni sart ekleyebiliriz    */

/// kac tane sart varsa hepsinin tutmasi lazim true cikmasi icin, bir tanesi bile tutmasa
// false cikiyor yani bu kisi eligible degil manasinda
// **** && isaretin adi logical AND operators ***
        System.out.println("=====");

        String name3= "Shay";
        int age3= 21;
        char gender ='F';
        boolean isEligible3 = age3 >=18 &&  (gender =='M' || gender =='F');/*Or OPERATURUNU PAZANTEZ ICINDE YAZIYORUZ*/
        //                     21>= 18 && ('F' =='M' || 'F' == 'F')
        //                      true &&    ( false   ||  true)
//                               true && true
   //                                 true

        System.out.println(name3 +" is eligible to register : " + isEligible3);

/* Hemen bir ustte yaptigimiz seyede OR OPERATOR deniliyor ve && bu isaret
 yerine || bu isaret kullaniliyor.Mesela 2 yada 3 sart tutmak zorunda
 ama bir tane sartta 2 tane alternatif koymus, yukaridaki ornekte olgunu
 gibi bayanda olabilir erkekte her iki durumdada eligible olsun istiyorsak
 && yerine or operator olan || kullanmaliyiz parantes icinde ama    */

        System.out.println("===============");
    String name4= " James ";
    String countryOfBirth= "US";
    boolean marriedToUSCitizen= false;
    boolean isEligible4= countryOfBirth == "US" || marriedToUSCitizen;// OR operatorde bir tanesinin true cikmasi yeterli
//                               true            ||          false      // cunku zaten OR dedigimiz icin iki siktan
//                                                                           biri true ise eligible oluyor

        System.out.println(name4 + " is eligible to apply for US citizenship :" + isEligible4);

        System.out.println("===========");
        String student = " Anna";
        double gpa = 3.5;
        int familyIncome = 100000;
        boolean isEligible5= gpa>=3.5 || familyIncome <= 60000;// Or operator kullandigimiz icin birinin
        //                                                       true olmasi yeterli
        //                        true || false

        System.out.println(student +"is eligible5 for scholarship: " + isEligible5);
        System.out.println("============");

        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3=!result2;
        System.out.println("result3 = " + result3);
        System.out.println("===========");

        int score= 65;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

/*  yukaridaki son iki ornekte de birseyin tersini
 yazmaya calisiyoruz, mesela 65 yada daga ustu puan
  alirsa gececek, bunun tersi olursa da kalacak iste
   o ilk yazigimizin tersi olsun istedimizi belirmek
   icin unlem ! isaretini  yaziyoruz neyin tersi olsun
    istiyorsak onun basina   */



    }








}
