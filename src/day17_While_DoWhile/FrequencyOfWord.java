package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

   /*
2. write a program that can return the frequency of the word Java from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3
           	Str = "JavaJava";
           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)
 */

String str="JavaJavaJavaJavaJava";
int frequency= 0;// asagida -4 yetine -3 yazarsak = i silmemiz lazim
        for (int i = 0; i <=  str.length()-4; i++) {// burada -4 yazdik cunku stringimizde enfazla 7 olabilir index
            // nu,berimiz ama -4 yazmazsak str.lenght diye biraktigimizda bu 5 oldugunda +4 yapacak ve 9. indexi bulmak isteyecej ama
            // bizde en fazla 7 index numberi var. i= baslangic nu,mberimiz, biz-4 yazdikki o zaman i =0,1,2,3 olabilir en fazla cunku str.lenght-4=3 yapar
           // i= 0,1,2,3, oldugu zaman bu numberelara 4 eklendiginde (cunku bitis indexini bulabilmek icin 4 ekliyoruz cunku Java yazisi 4 inexten olusuyor)
            // bu numberlara 4 ekledigimizde out of index olmamis olacak, eger -4 eklemezsek sisitem hata veriyor cunki i=4,5,6,7 oldugunda bitis indexleri bu numbrerlara 4 eklenenrek  bulunutor on zamanda out of index nu,mber olmus oluytor

         String eachSub=   str.substring(i,i+4);
           // System.out.println(eachSub);
if(eachSub.equals("Java")){// eachSub.Equals ("Java") burasi eachSun Java ya esit oldugu zaman demis oluyoruz yani condition vermis oluyoruz cunku kac kere java yazisi cikacak onu bulmak hedefimiz

}
            
        }


    }
}
