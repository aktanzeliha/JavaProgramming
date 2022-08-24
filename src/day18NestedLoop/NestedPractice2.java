package day18NestedLoop;

public class NestedPractice2 {
    public static void main(String[] args) {
/*
1. Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
     */ // burada kac tane repeat yapilmasigerektiginibiliyoruz budurumda for loop
        // kullanm,ak dahamantikli
        for (int j = 0; j < 10; j++) {// j= 0, 1,2,3....// burasi 0 oldugunda asagiadaki for 10 kere yildiz yazacak ve burasi 1 oldugunda asagidaki
            // yine 10 defa yildiz yazacak, 2 oldugunda tekrar 10 defa boylelikle toplamda yanayab=na yazilmis 10 yildizi alt altada 10 defa tekrarlamis olacgiz


            for (int i = 0; i < 10; i++) {
                System.out.print("* ");
// buraya kadar run yapinca yanyana yazilmis 10 tane yildiz cikiyor
                // * * * * * * * * * * bu sekilde bunu asagi dogruda 10 defa tekrarlanmasini yapmamaiz lazim
            }// ama bu yanyana ayazilmis yildizlarin asagi adiguda 10 defa tekrarlamsini istiyorsak bu sistemin ustene bir for loop daha yapmamiz lazim
            //yani ilk bastaki loop sonradan yazildi
            System.out.println();// empy sout yapinca sisitem asagi gecmis oluyor

        }







    }







}
