package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WhileLoopIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your firs number:");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();
// +,- bu ikisi kabul edilen oporator sayiyoruz, ya invalid operator girerlerse
        System.out.println(" Enter a math operator:");
        char ch = scan.next().charAt(0);

       //** buradaki yazdigim if statementini asagida while olarak degistirdik cunku aciklamasi statementment ten sonra yazildi. if (!(ch == '+' || ch == '-')) {//  burada if statement kullanirsam sadece bir kere yanlis operator girme hakkim var,
            // sadece bir kere soracak operatoru gir diye ve sonra orada kalacak ama while loop kullanirsam ben
            //her yanlis operator girdigimde o bana tekrar tekrar soracak tekrar gir invalid operator diye

            while (!(ch == '+' || ch == '-')) {
            System.err.println(" Invalid operatir, Please re-enter");// burada normal sout ta out yerine err yazdigimiz zaman sistemde invalid operator girildiginde
                // kirmizi yazi ile invalid operator tekrar gir diyor, eger err degilde eski normal sout yazildigindada ayni dogru
                // sonucu veriyor ama yazinin rengi kirmizi olmuyor sadece
           ch = scan.next().charAt(0);
// eger yukaridaki statement dogru yani true ise tektat tekrar bana invalid operator tekrar gir diyecek ki istedigimkizde bu zaten 
        }
        System.out.println((ch=='+')? num1+num2 : num1-num2);
    }
}
/*
bu ornek icin for loop is nor a good option because sadece bir keree yanlis , invalid operator girmeme izin
verir ama while loop da defalarca invalid operator girsemde tekrar tekrar sorar bana ama for loop
sadece sorar ve invalid operator girersem invalid dder biririr tekrar yazmama izin vermez.
 */