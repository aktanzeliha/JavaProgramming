package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
      /*
      yazinin icndeki java yazilarini tek tek silen bir program yazmamizi istiyor
// yukarida soyledigi bir program yazmadik, cumle icinde kac tane ayni kelimeden var onu bulan bir program yazdik
 *** deletinbg proggress kac kere oluyormus butun ayni yazilan yazilari silmek icin onu buluyormusuz.      */

    String str="Java Java Python Python";
    int frequency=0;
    while(str.contains("Java")){
      str=  str.replaceFirst("Java"," ");
        // yukarida str icindeki ilk javadan baslayarak one by one java lari bosluk ile replace et demis olduk
       // bu en son yazdigimiz kisimda, bosluk ile replace yap demek delete yap demek gibi birsey aslinda
        // direk deleyte yapamadigimiz icin bosluk ile replace et dedik kisacasi
        frequency++;

    }
        System.out.println(frequency);

        System.out.println("=============================");

        String sentence="cat cat cat cat cat CAT  dog dog";
          //               " cat dog dog"
        //                 " dog dog"

sentence= sentence.toLowerCase();
int countCat=0;//2
while(sentence.contains("cat")){
    sentence= sentence.replaceFirst("cat","");// burada replace Firs yerine sadece replaca yi kullanbirsak bir seferde
    // buyun catleri boslukla doldurur ve kac seferde butun cat leri sildigini bulmaayiz, amaca=miz her sferde bir cat silmek sartiyla kac seferde silebiliyoruz onu
    // bulabilmek o yuzdende replacefirst methodu kullandik
countCat++;
}


        System.out.println(countCat);

        System.out.println("===================");

   String s=" Java Java Java Phyton Phyton Phyton ";


 int countJava=0;
 int  countPython= 0;

  while(s.contains("Java")||s.contains("Phyton")){

      if(s.contains("Java")){
          s=s.replaceFirst("Java","");
          countJava++;

      }
if(s.contains("Phyton")){
    s=s.replaceFirst("Phyton","");
    countPython++;

}
        }

        System.out.println("counyJava:"+ countJava);
        System.out.println("countPython:"+ countPython);


        System.out.println("========================");




    }

}
