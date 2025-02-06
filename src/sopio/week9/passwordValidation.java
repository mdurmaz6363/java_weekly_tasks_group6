package sopio.week9;

/*` Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit*/

public class passwordValidation {
    public static void main(String[] args) {

        String password = "Acb9&";
        System.out.println("verifyPassword(password) = " + verifyPassword(password));

    }

    public static boolean verifyPassword (String password){

        boolean isValid = true;
        boolean isNotValid = false;
        boolean sixCharacters = password.length() >= 6;
        boolean containsUpperCase=false;
        boolean containsLawerCase=false;
        boolean containsSpecialChar=false;
        boolean containsDigit=false;

        for (Character each : password.toCharArray()){
            if (Character.isUpperCase(each)){
                containsUpperCase = true;
            }
            if (Character.isLowerCase(each)){
                containsLawerCase= true;
            }

            if (!Character.isLetterOrDigit(each)){
                containsSpecialChar = true;
            }

            if (Character.isDigit(each)){
                containsDigit = true;
            }

        }
        if (sixCharacters && containsUpperCase && containsLawerCase && containsSpecialChar && containsDigit){
            return  isValid;
        }else {
            return isNotValid;
        }
    }
}
