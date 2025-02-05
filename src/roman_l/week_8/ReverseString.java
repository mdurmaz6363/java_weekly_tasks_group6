package roman_l.week_8;

/*
`Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */
public class ReverseString {
    public static void main(String[] args) {

        String word = "ABCD";
        System.out.println("reverseWord(word) = " + reverseWord(word));
        System.out.println("reverseWord1(word) = " + reverseWord1(word));

    }

    //method 1 with String builder
    public static String reverseWord(String word) {
        String reversedWord = "";
        StringBuilder sb = new StringBuilder(word);
        reversedWord = sb.reverse().toString();
        return reversedWord;
    }

    //method 2 with loop
    public static String reverseWord1(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }


        return reversedWord;
    }

}
