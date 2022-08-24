package week7;

public class CharArray {
    public static void main(String[] args) {


        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for (char letter : letters) {
            System.out.print(letter + " ");

        }


// squence of chars = String
        String sentence = new String(letters);
        System.out.println();// bunu koyunca birsonrakini alta yaziyor
        System.out.println("sentence=" + sentence);


         char[]  newletters= sentence.toCharArray();
        for(char newLetter: newletters) {// burasi hata veriyor neden bilmiyorum( iki nokta ustuste yerine esittir yazmisim o yuzden error vermis
         System.out.println(newLetter+" "); //oscarin canli dersinde push yapmistir oradan bakabilirsin
        System.out.println("===================");
            System.out.println();
        String str="aaabbcddeffff";
        char[] arr= str.toCharArray();
        int size=0;
        String result="";
            for (int i = 0; i < arr.length ; i++) {
              char c=arr[i]  ;

              int count= 0;

                for (int j = 0; j < arr.length; j++) {
                  if(c== arr[j]){
                      count++;
                  }
           if(result.contains(" "+c)) {
               continue;
           }
             result+= c;
           result+= count ;
                }

            }

        }


// son kisim hic olmadi, oscarin push yaptigi yerden al

    }}

