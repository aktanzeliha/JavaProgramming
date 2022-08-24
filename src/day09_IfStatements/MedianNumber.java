package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

 /* write a program that can find the median
 number between three different given integers

  a=10, b=15 , c=20
output:
15 is the median number.
  */
        int a = 10;// a, b, c n nin degeri belli degil, yani hangisi 10, hangisi 15 hangisi 20 belli degil ama by 3 unden birisi
        int b = 15;
        int c = 20;
/* possibility 1= a is the median number
  possibility 2= b is the median number
  possibility 3= c is the median number
*/
        /*eger if yazmakta confidentsen boolean yaz,ana gerek yok
         * asagidaki gibi direk if conditionun yazabilirsin   */


//if(a<b && a>c)//
//                  a=15, b=10, c=20 || a=15, c=10, b=20
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);// a anacak bu sartlar saglanirsa median number olabilir
/* a nin median number olabilmesi icin bazi sartlarin olmasi gerekir mesela if c is
 the maximum number and b is  the minimum number, then a is  the median number
 Anin median number olabilmesi icin diger sart ise  c is the minimum number and b is the max nu,mber olmasi lazimki a median number olabilsin
* */
//                b=15 a=20,c=10 || b=15, a=10, c=20
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;
// we dont know what a is what b is what c is
        // bu yuzden butun possibility leri degerlendiriyoruz
        if (aIsMedian) {
            System.out.println(a + " is a median number");
        }

        if (bIsMedian) {
            System.out.println(b + " is a median number");

        }
        if (cIsMedian) {
            System.out.println(c + " is a median number ");
        }
    }
}
