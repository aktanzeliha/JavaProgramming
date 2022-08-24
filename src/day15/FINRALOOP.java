package day15;

import javax.management.MBeanAttributeInfo;

public class FINRALOOP {
    public static void main(String[] args) {

      /*  2. Write a method which prints out the numbers from 1 to 100 but for
        numbers which are a multiple of both 3 and 5, print "FINRA" instead of the
        number,  for numbers which are a multiple of 3, print "FIN" instead of the
        number and for numbers which are a multiple of 5, print "RA" instead of
        the number.
        ex:
        output:
        1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
       // burasi baska bir task, biz once task 2 yu yazacagiz 3. Write a program that can calculate the sum of all integers between
        1 to 100

*/

for(int i=1; i<=100; i++){// 1 2 3 4.....100
  if(i %15 ==0){// HEM 3 E HEM 5 E BOLUNEBILEN SAYIYI 15 E BOLUNDUGUNDE KALANI 0 OLAN SAYISIR DIYE CONDITIONLADIK
      System.out.println("FINRA ");
  }else if(i %3==0){// 3 6 9 12....
      System.out.println("FIN ");
  }else if(i % 5==0) {
      System.out.println("RA ");

  }else{//1 2 4 7 ...
      System.out.println(i+" ");
  }




}

    }
}
