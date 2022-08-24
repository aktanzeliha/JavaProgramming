package day10_NestedIf;

public class TernaiesIntro {
    public static void main(String[] args) {
// check given number even or odd number
int n= 100;
if ( n%2== 0){

    System.out.println(" even");
        }else {
    System.out.println(" odd");
        }
        System.out.println("=========");
// ayni islemi ternaise  if ile daha basit yoldan tekrar yapacagiz simdi

String result1=(n%2==0)? " Even" : " Odd";
/*burada "?" if i temsil ediyor,conditionumuzu if den once parentez
acip onun icine yazmamiz gerekiyor. ? den sonra , parentez icindeki
condition eger dogruysa sistemden ne yazmasini istiyorsak onu yaziyoruz
parentez icinde yani biz burada "Even" yazsin istedik. : iki nokta ust ustede else eyi temsil
 ediyor, yanio parentez icindeki condition dogru degilse demek.
  iki nokta ust usteden sonra , parentez icindeki condition dogru degilse ne yazmasini istiyorsak
   sistemin onu yaziyoruz yani  burada " odd" yazdigimiz gibi. bu sadece if conditionun short cut i */


        System.out.println(" resulr1 = "+ result1);

        System.out.println("===============");
/* asagida 23 yasindaki birisinin alkol satin almasi
eligible mi degilmi onu yazdiracagiz. once eski yonlemle yazacagizb */
        int age = 23;
      if( age >= 21){
          System.out.println(" Eligible");// string
      } else{
        System.out.println(" Not Eligible ");//string
    }
  /*yanliz ternaies yani short cut of if kullanabilmem icin sistemdeki sout
  larin icinde yazilmasini istedigim kisimlarin ayni tip olmasi lazim.
    yani burada ikiside String yani kelime yazacak, yani eligible, yada not eligible
     , int, double yada baska birsey degil ikiside ayni tio olmali  */
        System.out.println("==============");
        age=21;

       // (age >=21)?" Eligible":" Not Eligible "// bunu boyle yazdiktan sonra bunu sout un icine yerlestirebilirim direk yada
        //sistemin en son sonuc olarak bize cikaracagi sey bir metin yani yazi oldugu icin String data type kullanama gerekiyor,
        // String = dire yazabilirim , ikiside oluir
       // System.out.println((age >=21)?" Eligible":" Not Eligible ");// buda sonucu dogu verir yada
        String result2=((age >=21)?" Eligible":" Not Eligible ");
        System.out.println(result2);
        System.out.println("===============");
// simdi verilen numberin positifmi negatifmi yoksa 0 mu oldugunu test eden bir program yazacagiz
        int number=100;
        /*if(number>0){
            System.out.println("Number "+ number +" is positive ");
        }else if( number <0){
            System.out.println(" Number "+number+" is negative");
        }else {
            System.out.println("Number " + number +" is zero");
        }*/
// yukaridaki dogru cikti, simdi onu comment icine alip short cut i yazacagiz

     String result3=   (number >0 )? "Positive " :( number <0)? "Negative" : " zero";
        System.out.println(result3);
// iki tane if oldugu icin iki tane ??

    // Data type ayni olmali, yani hepsi
        // String olmali yada hepsi int yani sonucta cikabilecek
        // olasiliklarin yazim sekli ayni data type olmali, biri string digeri
        // int olursa bu short cut i kullanmaayiz. ama hrpsi int olursa kullanilabilir, yani ayni olmasi lazim

    }

}
