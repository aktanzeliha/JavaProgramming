package day17_While_DoWhile;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "AABBCC";
        String result = " "; // result ABC olsun istiyoruz yani birden fazla yazilan her karekteri sadece bir kere yazmis olmak istiyoruz


        for (int i = 0; i < str.length(); i++) {// burada i< str.length yazdik <= degil be careful.index number o dan baslar. kelimedeki bulunan toplam sayidan 1 eksiktir en son index number

// normalde char methodu kullnalabilirdi belki ama contains method kullanacagimiz icin ve contains
            // method da sadece string de kullanilabildigi icin char i stringe cevireecgiz

            /*char*/
            String ch = " " + str.charAt(i);// char i stringe boyle donusturuyoruz yoksa bir sonraki step te contains kullanamayiz
           // yukarida chari Stringe cevirdik cunku contains method sadeece string de kullaniliyor ama stringe cevirmaden
           //su sekilde de yapabilirdik.

           /* char ch=str.charAt(i);
            if(result.contains(""+ch));*/
            // yukaridaki gibide yapilinca char olmasina ragmen parentez icinde "" yaziba string gibi KABUL EDIYOR VE CONTAINS KULLANMAMA IZIN VERIYOR
            // BU YONTEMDE DOGRU . *** IKINCI YONTEM BANA DAHA AKILDA KALICI GIUBIU GELDI
            if (result.contains(ch)) {
                //break; exit
                continue;// skip//  eger resultun icindeki ch daha once yazildi ise continue kullanarak skip yap demis oluyoruz
// continue koymasaydik AABBCC seklinde yazacakti
            }// YUKARIDA CONTINUE YERINE  BREAK KULLNSAYDIK, O ZAMAN sadece ilk A yi yazip bitirecekti cunku break exit demek yani bitir, cik demis oluyoruz.
            // ilk ayni letter geldiginde sisitemi durdur demek break, A dan SONRA hemen diger A geldigi icin sadece ilk A yi yazip birakacakti
            result += ch;// += yazarak sistem her result buldugunda bir oncekine ekleyerek yeni result cikart demis oluytoruz
        }
        System.out.println(result);

    }


}
