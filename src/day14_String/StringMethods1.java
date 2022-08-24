package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "         batch 25      ";
        str1 = str1.trim();// trim() bu tirnak isareti icinde
// tirnaktan hemen sonraki ve kapatma tirnagindan da hem onceki
// bosluklari yazmamak icin kullanilir. Ama batch ile 25 arasinda
// gerginden fazla bosluk var ise onlari etkilemez sadece
        // bastaki tirmaktan sonra ve kapatma tirnagindan onceki gereksiz bosluklari yok ederek yazar. ve
        System.out.println(str1);

        System.out.println("====================");


        String str2 = "Cydeo School";// burada ben Cydeo keliesinin basinda bir bosluk birakmisim
        // o yuzden once o yu 5 index olarak gosterdi cunlku bosluklarida sayiyor.
        //boslugu silince o nun index numberini 4 olarak duzeltti.

        int n1 = str2.indexOf("h");
        System.out.println("n1=" + n1);


        int n2 = str2.indexOf("o");// burada Cydeo School un icinde "o"
        // kacinci index numbera sahip onu bilmaya calisiyoruz.Index numberin sol taraftan ve sifirdan 0
        // basladigini unutma. Birde cydeo school yazisind 3 tane o var. Sen sadece o dersen sol taraftan
        // yani cumlenin basindan ilk o hangisiyse onun index numberini verir.

        System.out.println("n2=" + n2);

      /*
      peki Cydeo School daki School yazisindaki ilk o nun index numberini istiyorsak onu
      nasil soracagiz cunku sadece o dersek soldaki ilk onun index numberini veriyor

       */

        int n3 = str2.indexOf("ool");// school yazisindaki ilk o nun index numberini istiyorsak 3 lu yziyoruz,
        // sisitem bu ucluyu bulana kadar ilerliyor ve bu ucluyu buldugu zaman ilk letter neyse onun index nu,berini veriyor.
        // ikinci onun index numberini bulmak isteseydik o zamanda , iki tane ol yazarsan sisten ilk ol a denk geldigi yerdeki
        // o nun index num,vberin i  verecektir
        System.out.println("n3=" + n3);

        System.out.println("================");


        String str3 = "Java Programing Language";
        int n4 = str3.indexOf("a");
        System.out.println("n4=" + n4);
/*
str3 de ilk a yi sorduk ve cevabi 1 olarak aldik. ama ikinci a yi sorsaydik "int n4= str3.indexOf("a ");"
burada oldugu gibi yazida ikinci a den sonra bir bosluk var Programing yazmadan once. paraentez icince "a "
bu sekilde a ve bir bosluk birakirsak sistem soldan aramaya baliyor a ve a dan sonraki bosluk buldugu
ilk a yi sordugumzu anliyor ve ikinci a nin index numberini veriyor bize.
 */

        int n5 = str3.indexOf("a ");
        System.out.println("n5=" + n5);

        // simdide ucuncu a nin index num,berini bulalim
        int n6 = str3.indexOf("am");
        System.out.println("n6=" + n6);

        int n7 = str3.indexOf("g ");
        System.out.println("n7=" + n7);


        System.out.println("===================");

        String s = "Java Nova Cava Wawa Orange";// BURADA CUMLEMIZI STRING DE S ILE IFADE ETTIGIMIZ ICIN ASAGIDA
        // int firstA = s.indexOf("a"); I YAZARKEN INDEXTEN ONCE S YAZDIK, STRING I NEYLE IFADE EDIYORSAK INDEX
        // TEN ONCE ONU YAZIYORUZ.

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");// burada str yi sen degil sistem speech mark acinda otamatik yaziyor
        // elinle yazarsan error veriyor
        int secondA = s.indexOf("a ");//
        int thirdA = s.indexOf("a C");// hangi Anin kacinci index number oldugunu bulmak istiyorsak
        // yazida bir suru A oldugu icin daha net ifade etmeliytiz
        // mesela burada nova ninsonundaki A nin index numberin i merak ettik ve daha sopesifik
        // bir ipucu verdik("a C" YAZDIK TIPKI YAZIMIZDAKI GIBI
       /*
       eger birden fazla ayni letter var ve sen onlardan hangisini istoyorsan sonundakinide yaziyorsun ya,
       eger iki tane ayni sekilde yazilmis varsa ayni yazilmayan harfe kadar yaz,
       diger bir yoluda lasrIndex kullanirsak aynio sekilde yazilmis bile olsa sondaki yazilani secer eger istedigin sondaki yazilan ise
        */
     //   int fourtA = s.indexOf("Ca")= burada bu sekilde yazarsan basinbda fourtA bile desek  bize iln letterin index nuberini verecektir yani C nin, ama biz
        // c nin yanindaki a nin index numberini istiyoruz o zaman asagidaki gibi yapacagiz.
        int fourtA = s.indexOf("Ca")+1;// bu sekilde yazarsan o Cnin index numberini bulacxak ve ona 1 ekleyerek sana sonucu verecek oda senin istedigin
        // A nin idex numberi olmus olacak zaten.
       int FifthA= s.lastIndexOf("va")+1;// burada v nin index numberini bulacak ve biz buna 1 eklemesini istedik cunku bize v degil v nin yanindaki A nin index nu,beri lazim,.

       int sixthA=s.lastIndexOf("aw");// wawa yazrken lastindex number kullaniyorsak cumlenin sonundan basina dogru arastiracak ama biz "aw" yazdik sondan basa gelincede tersten okuyuncada
        // bir aw var ama o sewkilde calismiyor. kalip halinde ilk aw yi ariyor bir en sonda aw var birde ondan sonra wawa


        System.out.println("firstA:" + firstA);

        System.out.println("lastA:" + lastA);

        System.out.println("secodA:" + secondA);

        System.out.println("thirdA:" + thirdA);

        System.out.println("fourtA:" + fourtA);
        System.out.println("sixthA:" + sixthA);
    }
}
