package week13;

public class Credentials {
    public String email = "oscar@cydeo.com";
    private String userName = "Scolfield";
    private String passWord = " Cydeo123";

    public String getUserName(String emailInput) {
        if (emailInput.equalsIgnoreCase(email)) {
            return this.userName;
        }
        return "condition has NOT been satisfied";
    }

    public String getPassWord(String emailInput, String userNameInput) {

        return this.passWord;

    }
   // return "condition has NOT been satisfied";
    }

// her zamanki gibi yareim kaldi Oscarin dersi, notlardan bakabilirsin