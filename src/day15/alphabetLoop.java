package day15;

public class alphabetLoop {
    public static void main(String[] args) {
  /*
write a program to write
A-Z=====> 65-90 acse tabledaki A dan Zye number karsiligi bu 65-90
yani bu numberlarii yazartasamda letter olarak cikacak soinuc
a-z
Z-A
z-a
 */
for(int i= 65; i<=90; i++){
    System.out.println((char)i+"");
}
        System.out.println();
        System.out.println("======================");

for(char i='A'; i<='Z'; i++){
    System.out.println(i);
}
        System.out.println("================");

for(char i='a'; i<='z'; i++){
    System.out.println(i);
}
        System.out.println("===========");
// z-a

for ( char i='Z'; i>='A'; i--){
    System.out.println(i);
}
        System.out.println("===============");
// z-a
        for(char i = 'z'; i >= 'a'; i--){
            System.out.println(i);
        }
        System.out.println("=================");
        System.out.println("==================");

        for(char i=1; i<=40000; i++){// acsi table da 40000tane karekter varmis, onlarin hepsini yazdirdik.
            System.out.print(i+" ");
        }

    }
}
