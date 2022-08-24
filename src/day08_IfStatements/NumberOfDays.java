package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {
  // 31 days= 1,3,5,7,8,10,12
  // 30 days = 4, 6,9,11
  // 28 days= 2
int number = 5;
boolean has28Days= number == 2; // for the month that has 28 days
boolean has30Days= number==4 || number ==6 ||number==9 || number==11;
boolean has31Days= !has28Days && !has30Days;
/*! koyunca 28 gun cekmeyen ve 30 gun cekmeyen gunler diye etiketlemis
oluyoruz 31 gun ceken gunleri zaten baska secenek yok bu 3 u var.istersek
 tek tek 28 ve 30 ceken gunlerde yaptigimiz gibide tek tek number lari
 yazabilirdik ama boyle daha pratic oldugu icin ! kulanmayi tercih ettik   */

if(has28Days){
    System.out.println("28 Days ");
}
if(has30Days){
    System.out.println(" 30 Days");
}
if(has31Days){
    System.out.println("31 Days");
}


    }








}
