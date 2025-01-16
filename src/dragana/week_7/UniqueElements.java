package dragana.week_7;

public class UniqueElements {
    public static void main(String[] args) {
        String str = "FAABBBCCCDEF";
        System.out.println("uniqueElements(str) = " + uniqueElements(str));

    }

    public static String uniqueElements(String str){
       String result = "";

        for (int i = 0; i < str.length(); i++) {
            char eachCharacter = str.charAt(i);
            if (str.indexOf(eachCharacter) == str.lastIndexOf(eachCharacter))
                result += eachCharacter;
        }

        return result;
    }

}
/*
`String -- Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */