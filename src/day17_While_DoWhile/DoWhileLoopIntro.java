package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
   boolean a = false;
        for (int i = 0; a;) {
            System.out.println(" Wooden Spoon--------- for loop ");

        }

        System.out.println("=======================");

  while(a){// while sonucu yazmadan once conditionu kontrol eder ve condition true ise sonucu yazar
      // burada boolean false olduu icin burada hic birsey yazmaz while ama sistem hatada vermez sadece sinucta birsey cikmaz ortaya
      System.out.println("wooden spoon------ while loop");
  }
        System.out.println("=================");

  do{
      System.out.println("Wooden Spoone----- do while loop ");

  } while(a);

  /*
  ilk yazdigimiozda sadece while yazdik o zaman while once conditionu kontrol eder c
  condition true ise yazdirmak istedigimizi yazdirir ama condition false ise hic birsey yazdiemaz
  ikinci kisimda ise onde "Do"  yazdik, do dan sonra sout yazip Wooden Spoon yazdik sonra "while(a)"
  yazdik bu Do once wooden spoone yazdirir sonra while de a yi kontrol eder.sistmem yukaridan asagi dogru yazdieildigi oicin
  wooden spoon yazdirilmamasinin hic bir engeli yok yukrada sadecedO YAZ ODA NE isteniyorsa yapar. While gelince "a" nin true olup olmadigini
  control eder eger "a" true ise tekrar yazar wooden spoone.eger a false ise sadece bir kere yukarisindaki
  Do dan dolayi  bir kere yazdirir wooden spoone
*** ben yukaridaki "a" yi true yapip sistemi calisrirdim, sistem sonsuz bir sekilde wooden spone yazmaya devam etti durmadan
   */

    }
}
