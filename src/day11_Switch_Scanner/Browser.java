package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

       /* 1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
        3. if the browser name does not match with the valid browsers' names,
        out put should be: Invalid Browser Name
        Ex:
        String browser = "chrome";
        Output:
        Chrome Browser is selected
        Note: MUST use nested if = en az 3 condition  olmak zoprunda nested kullanabilmekicin yada 3 den  fazla  */

        String browserName= "chrome";
String result="";
        boolean validBrowser = browserName == "chrome" || browserName == "firefox"
                || browserName == "opera" || browserName == "safari" || browserName == "edge";

        if (validBrowser) {//there are 5 options if it is a valid browser.
            if (browserName == "chrome") {
                result = "chrome browser is selected";

            } else if (browserName == "firefox") {
                result = "firefox browser is selected";

            } else if (browserName == "opera") {
                result = "opera browser is selected";

            } else if (browserName == "safari") {
                result = "safari browser is selected";
            } else {
                result = "edge browser is selected";
            }
            } else{
                System.out.println("invalid browser name");
            }


    }
}



