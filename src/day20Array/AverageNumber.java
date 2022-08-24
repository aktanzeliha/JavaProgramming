package day20Array;



public class AverageNumber {
    public static void main(String[] args) {

   int[] numbers={ 10,20,30,40,50,60};
   int sum= 0;// 10+20+30...

        for (int i = 0; i < numbers.length; i++) {
          sum+=  numbers[i];// += demek bir sonraki numberi surekli bir onceki sonucla topayarak git demenk


        }
double averageNumber= sum/numbers.length;// sayi bolundugunde decimal number cikma olasiligina karsi double tercih edildi galiba
// double yerine int verirsende calisiyor sonuc whole number ciktigi icin ama double daha mantikli saayilar degisirse decimale number cikma olasiligi yuksek oldugu icin
        System.out.println("avarage number="+averageNumber);



    }
}
