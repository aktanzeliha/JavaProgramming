package day11_Switch_Scanner;

public class crewAndPassergers {
    public static void main(String[] args) {

/*
create a class called crewAndPassergers, given a number
 of people on the ship
 Total= 50====> 20 crew, 30 passerger
 Total= 75 ====> 25 crew, 50 passertger
 Total= 100 ====> 30 crew, 70 passenger
 anay other number of people on the ship ins not valid
 *** MUST USE NESTED IF . DO NOT USE MORE THAN ONE PRINT STATEMENT
*/

int number=75;
String result= "";
boolean validNumber = number==50 || number==75|| number==100;
if ( validNumber){// number must be 50 or75 or 100
    if(number==50){
        result= " 20 crew, 30 passenger";
    }else if ( number== 75){
        result= "25 crew, 50 passenger";
    }else {
        result=" 30 crew, 70 passenger";
    }






}else {
    result =" Invalid Number";
}
        System.out.println(result);








    }


}
