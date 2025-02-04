package Anwr_;

    public class ReversedString {
        public static void main(String[] args) {
            String str = "ABCD";
            System.out.println("reverse(str) = " + reversedString(str));
        }



        public static String reversedString(String str) {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        }

    }
/*
`Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */

