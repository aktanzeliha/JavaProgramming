package week06;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String  str ="javaverygoodandsoon";
        String result= " ";// empty simdilik cunku sonra resultumu buraya koyacak
        // iterate through the string for each Char element
        for (int i = 0; i < str.length(); i++) {// this is a String so stary from 0 INDEX NUNBER

          if(!result.contains(" "+str.charAt(i))) {
        result+="" +str.charAt(i);

          }

          }

        System.out.println("result="+result);
        }
    }

/*
sonucta ayni sey cikti bende ne yazmamazi 
 */