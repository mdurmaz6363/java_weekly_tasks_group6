package roman_l.week_9;

/*` Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false*/
public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Cydeo!2";
        System.out.println("passwordVerification(password) = " + passwordVerification(password));


    }

    public static boolean passwordVerification(String password) {
        boolean correctPassword = false;
        boolean is6DigitLong = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialCh = false;
        boolean isDigit = false;
        boolean isSpace = false;
        if (password.length() >= 6) {
            is6DigitLong = true;
        }
        for (Character ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                isUpperCase = true;
            }
            if (Character.isLowerCase(ch)) {
                isLowerCase = true;
            }
            if (Character.isDigit(ch)) {
                isDigit = true;
            }
            if (!Character.isLetterOrDigit(ch)) {
                isSpecialCh = true;
            }
            if (Character.isSpaceChar(ch)){
                isSpace = true;
            }
        }


        if (is6DigitLong && isUpperCase && isLowerCase && isSpecialCh && isDigit & !isSpace) {
            correctPassword = true;
        }


        return correctPassword;
    }
}
