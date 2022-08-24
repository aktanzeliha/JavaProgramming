package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {

     /*   if (number == 1) {

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

}*/ //yukaridaki herseyi nameOfMonts class name olan
// kisimdan coppy paste yaptik. bugun ternaise if i  ogrendik, if in short cuti
      //  simdi burada short cut i uygulayacagiz.

        int num = 4;

         String result=(num==1)?" January" :(num==2)?" February":(num==3)? " March" :(num==4)? " April":(num==5)?" May":(num==6)? " Jun":( num==7)? " July":( num==8)? " August "
:(num==9)? "Septem":( num== 10)? " October":(num== 11)? " November": " December";
        System.out.println(result);

// number==1 gibi yadigimiz kisimlarin istersek
// hepsinin pRENTEZLERINI KALDIRABILIRIZ AMA OGRETMEN TAVSIYE
// EDIYOR PARATEZ KULLANMAMIZI. Ama parntez kaldirilacak ise hepsinden
// kaldirilmali sadece bir ikisinden kaldirilirsa errror verir


    }
}
