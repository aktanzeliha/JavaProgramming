package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        // substring(beginning index, ending index)

        String word = "Cydeo School";// dikkat et eger
// tirnak isaretinin b asinda bosluk varsa onu sifirdan baslamis sayiyor ve kelimen eksik cikar o zaman
        //          01234

        String brand = word.substring(0, 5);
// burada 4 yazinca
// 4 un index number oldugu lettere yazmiyor bir onesine
// kadar yaziyor yani Cyde yazacakn

        System.out.println(" brand :" + brand);

        System.out.println("==================");
        String str1 = word.substring(6);// buradad 6.index numbere
        // denk gelenden sonraki butun letterlari yazmasini istemis oluyorus. 6. S oluyor bu yuzden School yazdi
        System.out.println(str1);
        System.out.println("=====================");

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" "));// sadece Java yazmamzi istiyor. bu ifade bize Java kelimesini verir.
        // burada index numberlari saymamiz yasak, handi harfe kadar yazmamzii istorsak
        // onu bulmamaiza yardimci olacak formulleri kullanarak hangi kelimeyi yazmak
        // istoyorsak onu yazmamizi bekliyor. Burada tirnak isareti icinde bosluk birakti
        // yani java kelimesinden sonraki boslugu isaret etmek istedi, subindex te en son
        // yazilan index nu,mbere denk gelen karaekter yazilmadigi icin bosluk yazilmamais olacak ve sadece jkava kelime si yazilmis olacak.  denk
        System.out.println("s1:" + s1);

        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
/*
yukarida s2 de ikinci kelime olan programming i yazdirmaya calsiyoruz. farzedelimki kelimemin
 ne oldugunu bilmiyorum o tyuzden P ILE BASLAYAN SEKLINDE YAZDIRAMIYORUZ.indexOf da " " kullandik cunku
 java yazisindan sonra bosluk var yani ilk bosluktan sonraki harften basla yazmaya demek istemis olduk
kelimenin sonunu belirlemek iscinde lastindexOf da yine bosluk verdik. lastindexOf cumlenin sonundan basliyor
 taramata ve sondan baslamak sartiyla ilk bosluk yine porogramming kelimesinden sonra geliyor. yani iki bosluk
 arasindalki kelimeyi yaz demis olduk
 */
        System.out.println("s2:" + s2);

String s3= word2.substring(word2.lastIndexOf(" ") +1);// burada ikinci kisim
// yok cunku bununla baslasin soinuna kadar ne varsa hepsini yazsin demis oluyoruz sinirlamayarak

        System.out.println("s3:"+s3);

/*
yukaridaki sistemi hic degistirmeden 3 kelimeden olusan her cumleye uygulanabilir
 */

    }
}
