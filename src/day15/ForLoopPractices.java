package day15;

public class ForLoopPractices {
    public static void main(String[] args) {
        // 15 16 17 18 19 .......45 e  kadar yazdir
    // tek tek sout yazarak yazdirabilirz ama cok vakit alir o   yuzden loop kullanacagiz

    for(int i= 15; i<=45; i++) {
        System.out.print(i+" ");  // i= 15 16 17.....45
    }// yukaridaki gibi yazdirdigimizda 15 den baslayip 45 e kadar sayilari yan yana  yazdiriyor.
        // dikkat et println degil sadece print var parentezden once.
     //   peki biz yan yana degilde sayilari alt alta yazsin istiyorsak o zamanda soutu asagidaki gibi yazmaliyiz
        //System.out.println(i);// bu sayilari alt alta yazdirir
        System.out.println(); // bunu yazinca hello numberlarla ayni hizada degil bir sonraki line da yazilir
        System.out.println("Hello");
        System.out.println("====================");
// ***butun soutlarin for ile baslayan statementen hemen sonra acilan curly parentaz icinde olmasi lazim yosa "i" error verir
        // 100 99 98 97 ....... 50
        for(int i= 100; i>=50; i--){//burada i>=50 yerine i> 49 yazarsakta ayni conditionu vermis oluruz ayni sonuc cikar
            System.out.println(i);// println in soundaki ln oldugu icin numberlari alt alta yazdi
        }
// i=49 oldugunda condition artik saglanmadigi icin sayi 50 olunca yazmayi  birakacak
        // numberlari yanyana yazsin istiyorsak aralarinda bosluk birakarak asagidaki gibi yazariz
       // System.out.print(i+" "); dikkat et print yaziyor sadece println degil
        System.out.println();// bunu verince yeni bir line gecmis oluyoruz

        System.out.println("===============");

// print all the even numbers between 1-55
        for(int i= 1; i<= 55; i++ ){
if(i% 2==0){
    System.out.println(i);
}

        }

        System.out.println();
        System.out.println("================");

for(int i= 2; i<=54; i +=2){// boylede yazilirsa yine 1 ile 55 arasindaki even numberlari verir
   System.out.println(i);
   // System.out.print(i +" ");// bu sekilde yazarsanda yantyana yazmis oluyor
}

/*
write a program to write
A-Z
a-z
Z-A
z-a
 */






    }}

