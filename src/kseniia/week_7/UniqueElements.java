package kseniia.week_7;


public class UniqueElements {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";;
        System.out.println(uniqueChars(str));

    }

    public static String uniqueChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char charactersOfStr = str.charAt(i);
            if (str.indexOf(charactersOfStr) == str.lastIndexOf(charactersOfStr)) {
                result += charactersOfStr;
            }
        }

        return result;
    }

}




/*
`String -- Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
*/
