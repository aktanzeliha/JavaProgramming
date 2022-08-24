package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
  String str="Cat Cat Dog Dog";

  int frequency=0;

        for (int i = 0; i <= str.length()-3 ; i++) {// kac kere yazildigini bulmaya calistigimiz kelime kac harf ise toplam dan onu cikariyoruz, Cat 3 harfli 3 u cuikardik
            String eachSub= str.substring(i,i+3);//*** burada paarantez icindekin kizin hangi index numberla baslayip hangi index numbere kadar yazacagini belirliyor
            // mesela i,i+3 yazdigimizda i=0 zaten en basta cunku index number 0 ile baslar, 0 a 3 ekle 3 yani index nukbere 0 olandan basla,1 i 2 yi birde 3 olani yaz demis olutoruz
            // bir sonraki seferdede index numberi bir artiriip cunku yularda i++ yzadu=ik bu birer birer artir demek, ikoinci stepte index nubler 1 artacak ve 1 olacak +3 oluncada 4 olacak yani
            //index numberi 1-4 arasini yaz demis oluyoruz. tek yek birer birer ibdex numberlari artyirarak yazacak ve asgida equals"Cat) olanlari yazdir yazdir yasa=da kac defa Cat yazisi denk geldi onu yazfir demis olduk,
            // eger string str mizde buyuk kucuk karisik harflerle yazilmis cat lerde var ve biz onlarda sayilsin
            // istiyorsak mesela CAt, cAT. CAT ETC.O ZAMAN ASagidaki kismi equals(Cat) degil egualsIgnoreCase kullnarak yapacagiz,
            //if)(eachSub.equalsIgnoreCase("Cat"))=======> boyle yazarsak buyuk letter kucuk letter takilmadan butun cat leri yazar







            if(eachSub.equals("Cat")){// burasi taamiyle parantez icinde yazildigi sekloyle kac tane Cat var onu bulur

                frequency++;
            }

        }


        System.out.println(frequency);



    }
}
