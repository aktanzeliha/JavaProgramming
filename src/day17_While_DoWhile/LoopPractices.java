package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {
        // eger how many times repeated yapacagini biliyorsan for loop kullanilir
        // i wannted to write 1 to ten  so how many times repeated edecek biliyoruz bu yuzden for loop kullanbiliriz

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);

        }

        System.out.println("===================");
// diger bir yontemide while loop kullanmak
        int j=1;
   while(j<=10){
      // j++;
       System.out.println(j);
       j++;// j++ bunu soutttan once yazrsak 1 den degilde 2 den baslayip 10 a kadar yaziyor o yuzden bu statemento
       //souttan sonra yazmam lazim ki 1 den 10 a kadar yazsin. cunku sistem yukaridan asagiya dogru islem yapiyor,
       // yukarida j=1 vermisiz, souttan once j++ yazinca sistem 1 olan j yi 1 artirarak yazmaya basliyor ama once sout verirsek
       //ve souttan sonra j++ statementi verirsek j==1 oldugu icin once 1 yazar sonra aryirmaya baslayaral condition j<=10 oldugu icin
       // bu condition dogrulugunu kaybedene kadar tekrarlayarak yazmaya devam eder
       /*
       *** ama kac kere loop yapacagini onceden biliyorsan en mantikli oplan for loop kullnamaktir while degil ama while de calisir.
        */
   }

        System.out.println("===================");

   // birde ayni soruyu Do while loop ile yapacagiz.

      int k=1;
      do{
          System.out.println(k);
      }while(k<=10);


    }

}
