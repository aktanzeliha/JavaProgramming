package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        //int s = 85;
/*if(s >=0 && s<=100){

if(s>= 60) {
    System.out.println(" passed");
}else {
        System.out.println(" Failed");
    }


}else{
    System.out.println("Invalid score");
}*/


// simdi short cut kullanalim
        int s = 85;
        String result = (s >= 0 && s <= 100) ? (s >= 60) ? " Passed" : " Failed" : " Invalid Score";
        System.out.println(result);

/* yukaridaki yaptigimizin aynisini asagida short cut ile yapmis olduk. */


    }
}