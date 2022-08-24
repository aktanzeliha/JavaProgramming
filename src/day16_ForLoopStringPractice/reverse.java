package day16_ForLoopStringPractice;

public class reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
// index     01234567891011
        String result = ""; //simdilik buna bos tirnak isareti veriyoruz ki bize error vermesin
// byn yukaridaki string de reserved tyapilmis halini yani tersten yazilmis halini saklyacagiz

     /*   result += str.charAt(11);//n, burada cumle kisa saya biliyoruz indexlerini saymak kolay o
        // yuzden saydik son index 11 oldugu icin direk charAt in icine 11 yazdik
        // ama cok uzun bir cumle olsa ve hepsini tersten yazdirmak istesek  ozan
        // tek tek saymayacgimiz bir cumle olsa son indexi asagidaki formulle bulabilirz
      //**** result str += charAt(str.length()-1);// burasi bize cumlenin en son numberinden
        // bir cikarirsan son indexin bulundugu letteri verir diyor,
        // index sifirdan basladigi icin 1 cikarmak gerekiyor karakter sayisindan son letteri bulmak icin.


        result += str.charAt(10);//o


        result += str.charAt(9);//o
        result += str.charAt(8);//p
        result += str.charAt(7);//S
        result += str.charAt(6);//
        result += str.charAt(5);//n
        result += str.charAt(4);//e
        result += str.charAt(3);//d
        result += str.charAt(2);//o
        result += str.charAt(1);//o
        result += str.charAt(0);//W

*/

        /*
        *** Burada yukarida 12 ayri program yazmamiz gerekti sonucu bulabilmek icin,
        *  forLoop kullanarak cok daha az islemle ayni sonucu yazdirabilriz.
         */
        /*
        yukarida mantik olarak karakter karakter sondan
         baslayip basa dogru gidersek cumleyi tersten basa
         yazmis oluruz mantigi ile charAt metodunu kullandi

         */
// simdide forLoop kullanarak cozecegiz
      //buda dogru ama asagida last index numberi bilmedigimiz durumkarda hangi formulu kullaniyorsak onunla yazdik tekrar .
        //  buda dogru for (int i= 11; i>=0;i--){// ayterisin olarak dogru olan i-- dir i++ degildir
//int i=11 buradaki 11 hangi number ile baslayacagini verir, ikincisi condition oda nerede duracagini verir,
// ucuncusude baslagidi numberdan hangi aralikta artacakmi azaacakmi onu verir. ama eger int i=11 yazdigimda last ondexi biliyordum yazdim,
// ya bilmiyorsam last indexi o zaman last index formulunu yazariz oda
       //     **** for(int i= str.lenght() -1 ) bu formul last indexi bilemeyecegimiz zamanlarda last lettere bulmak icin kullanilan formuldur
            // str.lenght bize toplam karakter sayisini verir, index 0 dan basladigi icin toplam karakter sayisindan 1 i cikarirsak last letteri bulmus oluruz
          // for(int i= 11; i>=0;) yazdigimizda  i 0 dan buyuk olmali diyoruz eger buna bundan sonraki sinirlamayi vermezsek infinitive oluyor ve
            //running bitmedigi icin istedigimiz seyi yazmiyor, we need to wrire ayterisin , we need tp pick right ayterisin, mesela 1++
            // yzsak intinife olarak hep i greater then 0 olacak yani i++ dogru ayterisin degil
//*** butradaki i index number of str( starting last index to index 0)
for(int i= str.length()-1; i>=0; i--){
result += str.charAt(i);// yukarida condition verdik, o conditiona uymayana kadar sistem yeni i bulacak ve biz
// o i larin hepsini yazmasini istedigimiz icin resul+=kullandik yani + koyduk == den once,
    //bu sartlari saglayan her dogru buldugun resultu bir oncekine ekleyerek yani onun yanina yaz demis oluyorum.
    // birde charAt kullandik resul yazarken cunku karakter karekter bulmasini sonra += metoduyle yanyana yazmasini istedik
            // int i=11 initilitation and i>=0 da condition, condition kismi loopun nerede duracagini bildirir
        }
            // teker teker birer boirer number asagi in ce i 0 olunca dur demis oluiyoruz
            //initilation dada nereden baslayacagi konutunu vermis oluyoruz
        System.out.println(result);
// minumum index number is 0, 0 dan kucuk olmaz index number

       /* 1. Write a program that can reverse a String
        Ex:
        input:
        Wooden Spoon

        output:
        noopS nedooW


        2. Write a program that can remove the duplicated characters from a String
        Ex:
        input:
        AABBCCBC

        Output:
        ABC

        Hint: You can add each characters of the string into another String
        Condition: the character is not contained in the other String yet before you are adding

        3. Write a program that can return the unique characters from a String

        Ex:
        input:
        AABCCD

        output:
        BD

        Hint: You will need indexOf() and lastIndexOf()
        if the first and last index numbers of the character are same, then it's unique



        indexOf('A') ==> 0
        lastIndexOf('A') ==> 1


        indexOf('B') ==>2
        lastIndexOf('B') ==> 2

*/


    }
}
