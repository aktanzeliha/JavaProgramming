package day19LoopAndStringRecap;

public class LoopWithourCurlyBraces {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) // buradaki baslamis olan curly braceles ile conditionda verildigi kadar tekrar tekrara yazack,
            // biz burada iki statement verdik cydeo ve batch25. curly braceles varsa iki statemente 5 defa tekrar yazsilacak ama curly braceles yoksa sedece ilk
            // statement 5 defa ayazilaacak ama ikinci tstataement sadece bir kere yazilacak . ama curly baraceles var se curly in icindeki hersey condition kadar tekrar eder

            System.out.println("Cydeo");
// ikinci statementinde tekrar tekrara yazilmasini istiyorsak onun icinde tekarar fo loop vermemizlazim
        for (int i = 0; i < 5; i++)
            System.out.println(" Batch 25");
        }
    }
