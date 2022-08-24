package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {

        //  for (char i = 'A'; i <='Z' ; i++) {
        //   System.out.print(i+" ");
/*
yukaridaki gibi yzinca adan baslayip Z ye kadar butun letterlai yazdirmis
oluyoruz peki biz A dan Z ye kadar hepsini degilde alfabenin bir kismini yazdormak istotyorsak o zaman break statement kulnmamiz lazim
 */
   // }


        for (char i = 'A'; i <='Z' ; i++) {
            if(i=='F'){
                break;
            }
            System.out.println(i+" ");
        }
// ALFABENIN HEPSINI DEGILDE BIR YERE KADAR YAZMASINI ISTIYORSAK BUNU IF SATEMENT ILE BELIRTIP BREAK ILEDE BITIRMEK LAZIMM
// IF STATEMENTI BEFORE SOUTTAN ONCE VERDIGIMIZ ICIN F I YAZMADIO, ama if satatementio after souit ttan sonra verorsek f i de yazar

        System.out.println();
        System.out.println("==================");
        Scanner scan=new Scanner(System.in);
        while(true ){
            System.out.println(" Enter a number");
            int num= scan.nextInt();// buraya kadar while nin icine true statementi verdigimiz icin sonsuza kadar
            // bize numara sormaya devam edecek ama biz biz negatif number yazdigimizda durssun artik
            // bize enter a number diye sormmasin istiyoruz bu yuzden if statementi ile break verecegiz asagida
            if(num<0){
                break;// suan sisitem bize surekli enter a number diye soruyor taki biz negatif number girince artik sormayi birakiyor

            }

        }



    }
}
