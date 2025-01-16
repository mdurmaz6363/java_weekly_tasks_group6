package kseniia.week_8;

public class reversedString {

    public static void main(String[] args) {

        String str = "ABCD";
        System.out.println("Original string = " + str);
        System.out.println("reversedString(str) = " + reversedString(str));
    }


    public static String reversedString(String str){

        StringBuilder result = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
