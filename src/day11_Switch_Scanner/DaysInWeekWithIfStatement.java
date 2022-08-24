package day11_Switch_Scanner;

public class DaysInWeekWithIfStatement {
    public static void main(String[] args) {

        int number = 3;
        String result = "";
        if (number <= 7 && number >= 1) {

            if (number == 1) {
                result = " Monday ";
            } else if (number == 2) {
                result = " Tuesday";

            } else if (number == 3) {
                result = " Wednesday";

            } else if (number == 4) {
                result = " Thursaday";

            } else {
                result = "Friday";

            }


        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }
}
