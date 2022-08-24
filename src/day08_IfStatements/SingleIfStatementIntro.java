package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

int number= 300;
        /*System.out.println("Odd Number");
        System.out.println("Even Number ");*/
        boolean evenNumber= number % 2==0;/* bu numberin (300) 2 ye
          bolumunden kalanin 0 a esit olmasi lazim eger even number sa sarti kosmak icin yaziyoruz .*/
        if (evenNumber) {
            System.out.println(number +" is even number");
           boolean oddNumber= !evenNumber;

            if(!evenNumber){
                System.out.println(number+" is odd number ");

/*if den sonra parantes acik statementimizi yaziyoruz sonra noktali virgul ; koymuyoruz
parantezden sonra hemen sonrasinda curly parantez aciyoruz ve sout ile baslayan kismi
o yeni actigimiz curly parantezin icine yaziyoruz.  sonra yine if kullanip parantez acip parantesin
icine ! unlem isateri ile baslayip even number yazdigmda aslinda bu odd number olmus oluyor cunku
baska secenek yok numberlar ya even olur ya odd.yine ; isateri pazantesin sonuna koymadan
curly parantez acip sout umuzu yaziyoruz.  sisitem en sonunda biz iki tane sout yazdigimiz halde hangisi
 dogru ile onu yazditracak yani bir tane sonuc verecek  bize , bu islemde 300 even number oldugu icin
 sadece even number sonucunu yazdirdi digerini yazdirmadi sonuc kisminda   */

                System.out.println("============");
                int n =200;
                // bu number positive mi
                if(n > 0) {
                    System.out.println(n+" is a positive number");

                }
                // negative mi
                if(n < 0) {

                    System.out.println(n+" is a negative number");

                }


                // zero mu ispatla
                if(n==0){
                    System.out.println(n +" is a zero");
/*yukaridaki n = positive mi negatif mi zero muyu coppy
paste yapip PozitiveNegativeZero classinin icinde
calistirdim orada calisti ama burada calismadi nedense    */
                }



                  }
                }








            }


        }

























