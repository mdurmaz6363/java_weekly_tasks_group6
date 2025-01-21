package kseniia.week_9;

public class PasswordValidation {

    public static void main(String[] args) {


        System.out.println(isValid("Password1!"));
        System.out.println(isValid("pass"));
        System.out.println(isValid("PASSWORD1"));
        System.out.println(isValid("Pass 1!"));
        System.out.println(isValid("Passw1!"));

    }

    public static boolean isValid(String password){

        if (password == null || password.contains(" ")){
            return false;
        }
        if (password.length() < 6 ){
            return false;
        }


        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char eachCharacter : password.toCharArray()) {
            if (Character.isUpperCase(eachCharacter)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(eachCharacter)) {
                hasLowerCase = true;
            } else if (Character.isDigit(eachCharacter)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(eachCharacter)) {
                hasSpecialChar = true;
            }

            if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
                return true;
            }
        }
        return false;
    }

   /*
   Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
    */
}
