package dragana.week_9;

public class PasswordValidationTask {

    public static void main(String[] args) {
        String password = "Marie123$";
        System.out.println("passwordValidation(password) = " + passwordValidation(password));

        System.out.println("passwordValidation(\"MAsku&\") = " + passwordValidation("MAsku&"));
    }

    public static boolean passwordValidation(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

    boolean hasUpperCase = false;
    boolean hasLowerCase = false;
    boolean hasSpecialCharacter = false;
    boolean hasDigit = false;

    String specialChars = "!@#$%^&*()_+<>?{}[]|";

        // Check each character
    for (char eachChar : password.toCharArray()){
        if (Character.isUpperCase(eachChar)){
            hasUpperCase=true;
        } else if (Character.isLowerCase(eachChar)) {
            hasLowerCase=true;
        } else if (Character.isDigit(eachChar)) {
            hasDigit=true;
        } else if (specialChars.contains(String.valueOf(eachChar))) {
            hasSpecialCharacter=true;
        }
    }

        // Validate each condition
        if (!hasUpperCase){
            return false;
        }
        if (!hasLowerCase){
            return false;
        }
        if (!hasDigit){
            return false;
        }
        if (!hasSpecialCharacter){
            return false;
        }
        return true;
}


}
