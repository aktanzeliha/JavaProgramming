package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {

   /*
   write a for loop that will displays the following set of numbers
   0,10,20,30,40,50.......1000
    */
  //int i= 0; // this called initialization // baslangic number initilize diye geciyor buraya her zaman baslamak istedigimiz numberi yaziyoruz
  //  i<=100;// this ic our condition
  //i+=10 iteration= kacar kacar artsin istiyoruz yani loopumuz hangi atralika olsun

        for (int i = 0; i <=1000 ; i+=10) {
       if(i<1000){
           System.out.println(i+",");
       }else {
           System.out.println(i);
       }
        }
        System.out.println("===========");
        // do iy by one by
        for (int i = 0; i <=1000 ; i++) {
            if(i%10==0){

            if(i<1000){
                System.out.println(i+",");
            }else {
                System.out.println(i);
            }
        }
/*
ayni sonucu pek cok yontemle bulabiliriz , yukarida 2 farkli yontem gosterildi
 */
            /*
            How can I USE " int i" variable declaration twice inside same java class?
            int i= = is local to the for loop that we created
             */
        }
    int x=0;// initialization
    for(;x<=1000 ;){
        if(x%10==0 ){
            System.out.println(x+" ");
        }
        x++;
//  iteration     }


// ayni sonuc cikti 3. farkli bir yontem kullandik

}

        System.out.println("x="+x);
    /*
    enson yaptigimiz yontemin faydasi loop disinda bir initilasition yapiyoruz ve soutu loopun curtly parantezinin disindada yazdirabiliyoruz ayni sonucu alabilmek icin
     */

        System.out.println();
        System.out.println("=================");

    boolean check =true;
        for (int i = 0; check ; i+=10) {
            if (i==1000){
                check= false;
            }
            System.out.println(i+" ");
        }


    }

}
