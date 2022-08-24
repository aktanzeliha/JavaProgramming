package day17_While_DoWhile;

import java.sql.SQLOutput;

public class BranchingStatement2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E' ; i++) {
          if(i=='C'){
//break;/*
// buraya kadar yazdigimizda sisitem baslangic noktasina bakacak baslangic noktamis A, conditionumuz
//C if i==C diyor i C ye esit olmadigi icin A yi yazacak sonraB ye gececek B  C ye esit olmadigi icin B yide yazacak sonra C
//C C ye esit oldugu icin ve sobrasinda break steatement oldugu icin sadece Ave B yi yazmis ve nirakmis olacak.
//*** ama continue statement te sadece conditiondaki letteri yazmiyor ve o letteri atlayip sonraki letterlari yazmaya devam ediyor simdi berak statemeonti
//etkisiz hale getirip continue statementi calistiracagiz */
continue;
        }
        System.out.println(i);// A B D E, c YI SKIP YAP VE SONRASINDAN DEVAM ET DEMIS OLDUK

    }
        System.out.println("====================");
/*
between 1 to 10 write oll the even numbers

 */

        for (int i = 1; i <=10 ; i++) {
            // if( i==1 || i==3 || i== 5 || i== 7 || i== 9){ ben boyle yazmistim  buda dogru sonuc verdi ama hocanin yaptigi daha basit
            if (i % 2 != 0) {// 1 3 5 7 9 bunlar bu statementi dogruluyor yani bunlar gelince bunlari atla demek // bu da hocanin yaptigi, 1 ile 10 arasinda 2 ye bolumunden remainderi 0 olanlari yaz demis, remainderi 0 olmayanlari skip yap  oluyor
                continue;// skip // yukaridaki sarti saglayanlari skip yap demek continue koydugumuzda
                // if(i%2 !=0) buda 2 ye bolundugu zaman remainderi 0 olmayan  numberleri skip yap demek oluyor onlarda odd numberlar bu durumda even numberlari yazdirmis oluyoruz  demenk
            }
            System.out.println(i + " ");
        }

        System.out.println("=============");
        // print all odd numbers

        for (int i = 1; i <=10 ; i++) {
          //  if(j==2 || j== 4 || j== 6 || j== 8 || j==10)
            if(i%2==0) {// bunda sonra continue koymak demek if statementindeki true olanlari skip yap yazma demek , YAZ demek degil YAZMA demek skip yap demek
                // yani burada 2 ye bolumunden remainderi 0 olanlari skip yap yazma demek istiyor


                continue;

            }
            System.out.println(i+" ");


}

        System.out.println("=============");
        // break statement verice sisitemi durdurmus oluyoruz
        // continue statement kullaninca true olan conditionlari skip yapmis oluiyoruz





    }}
