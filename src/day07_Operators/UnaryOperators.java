package day07_Operators;


public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;
        System.out.println(num1 < 0);//false
        System.out.println(num2 < 0);// true
        System.out.println("===================");
        int a = 5;
        ++a; // it is pre increment: increase the number by 1 immediately
        System.out.println(a);
        --a;// pre decrement: decreased the value by 1 immediately
        System.out.println(a);/*
         a nin ilk degerini degilde en son degeri olan 6 dan 1 azaltiyor
         cunku en son hafizasindaki a degeri 5 degil 6. */

        int b = 100;
        System.out.println(b++);/* post increment. (post: GECIKTIRMEK MANASINDA )
        immediatelly by 1 artirmayacak daha sonra artiracak*/
        int c = 100;
        System.out.println(c++);
        System.out.println(c);/* post incrementte 2 steps var, birincide ayni degeri
        veriyor ikinci asamada increase the value by 1.*/

        System.out.println("=========================");
int x= 200;
        System.out.println(--x); // pre decrement: decreases the value by 1 right away
        int y= 200;
        System.out.println(y--);/* post decrement: ( post has 2 steps before changing the value)
         first it passes the correct value, then decreases the value by 1.*/

        System.out.println(y);
        System.out.println("======================");
        int z= 45;
        System.out.println(++z);/* burasi bence 46 olacak cunklu pre increase yani right away artiracak by 1.
         after this line artik z nin yeni degeri 46 , 45 degil                 */

        System.out.println(z++);/* burasi  z nin en son degeri neyse hafizasindaki
        ayni kalacak yani en son right away artip 46 olmustu, 46 olarak aynen kalacak
        post increase var yani iki steps olmasi lazim burtada , next stepde 1 artiracak       */

        System.out.println(z);/* burasi bence en son hafizasindaki degerden bir artacak
        ve 47 olacak cunku post increase nin ikinci stepi burasi       */

        System.out.println("=====================");
        int q= 30;
        System.out.println(--q);/* burasi bence 29 olacak cunku pre decrement yani right away by 1 decrease yapacak.       */


        System.out.println(q--);/* burasi hafiuzadundaki enson deger neyse q olarak onu koruiyacak cunku
         bu post dercrease yani ikinci stepde 1 dusurecek degeri , yani 29 olacak   */
        System.out.println(q);/* burasi post decrease den sonra geldigi icin
         1 dusurecek en son hafizasindaki q degerini yani 28 yapacak       */
// sadece bir tabne + yada - varsa bu positif yada negetif number oldugu anlamina geliyor sadece

    }

}