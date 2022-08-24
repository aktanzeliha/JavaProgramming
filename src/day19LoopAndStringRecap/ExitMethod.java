package day19LoopAndStringRecap;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i <5  ; i++) {//i=0,1,2,3,4
            if (i == 3) {
              // break; terminate the poop. it stoprs when it is 3 so it is going to print 0,1,2
              //  continue; boyle yazincada i== 3 oldugunda 3 u skip yap 4 den devam et demis oluyoruz
// break ve continue sadede loop icini etkiliyor loop disindaki seyler yine print olmaya deva ediyor wooden spoon da oldugu gibi
                System.exit(0);// buraya exit yazdigimizda bundan sonraki hocbirseyi yazma, sadece buraya kadar yazar.
            }

            System.out.print(i + " ");
        }
        System.out.println("Wooden Spoon");






    }
}
