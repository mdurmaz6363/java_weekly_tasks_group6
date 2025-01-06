package roman_l.week_7;

/*
`String -- Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class FindUniqueCharactersTask {
    public static void main(String[] args) {
        String characters = "EAAABBBCCFSECDEFE";
        System.out.println("uniqueCharacters(characters) = " + uniqueCharacters(characters));
    }

    public static String uniqueCharacters(String characters) {
        String uniqueCharacters = "";
        String allCharacters = "";
        for (int i = 0; i < characters.length(); i++) {
            int frequency = 0;
            if (allCharacters.contains(Character.toString(characters.charAt(i)))) {
                continue;
            }
            for (int l = i + 1; l < characters.length(); l++) {
                if (characters.charAt(i) == characters.charAt(l)) {
                    frequency++;
                }
            }
            if (frequency == 0) {
                uniqueCharacters += characters.charAt(i);
            } else {
                allCharacters += characters.charAt(i);
            }
        }
        return uniqueCharacters;
    }
}
