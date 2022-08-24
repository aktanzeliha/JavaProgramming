package day15;

import java.util.Scanner;

public class MinumumNumberLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483646;// this is the possible biggest positif integer mis
        // kullanilan butun numberlar bu buyuk numberdan kucuk olur cunku olabilecek en buyuk number buymus
        // burada i++ yerine i__ yazsaydik sonsuza kadar bize enter a number diye soracakti
        // yukarda 5 kere tekrar etmemizi istedigi icin verdigim numberlarin arasinda 5 olduguna dikkat etmeliyim.
        for (int i = 10; i < 15; i++) {// buradaki 10 ve 15 ler hangi number yazdigin onemli degil yereki senin
            // 5 kere number gir diye sormasi icin arasinda 5 number olan herhangi iki number yazabilirsin
            System.out.println("Enter a number:");

            int num = scan.nextInt();// 67 23 42  5 -10
if(num<min){
    min=num;
}
            // neyin loop yapmasini yani repeat etmesini istiyorsak onu
            // for diye baslayan statementin sonunda acilan curly parantezin icinde yazmak zorundayim.
            System.out.println("min:"+ min);

        }


    }
}
