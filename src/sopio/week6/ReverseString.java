package sopio.week6;

public class ReverseString {
    public static void main(String[] args) {

        String str = "ABCD";
        reverseString(str);

    }

    public static void reverseString (String str){
        String result  = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        System.out.println("result = " + result);
    }
}
