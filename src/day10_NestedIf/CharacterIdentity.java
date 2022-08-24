package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {
   char ch= '@';

if ( ch>='0' && ch <= '9') {// burada b numaralari temsil eden baska numaralar var onlarida yazarsak ayni sonuc cikar

    System.out.println(" Digit");
}else if ((ch>='A' && ch<= 'Z') || (ch>= 'a'&& ch <='z' )){
            System.out.println(" Alphabetic");
        } else{
            System.out.println("Special character");
        }

// conditionlatrimizi yazdiktan sonra yeni bir
// curly parentez acip kapatip ve o curly parantez icinde sout yazmayi unutma




    }
}
