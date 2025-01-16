package roman_l.week_5;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String word = "ABAABBCCCDDA";
        frequencyOfCharacters(word);

    }

    public static void frequencyOfCharacters(String characters) {
        //Creating new empty string to pass result in it
        String result = "";

        //For loop to check each character of the string
        for (int i = 0; i < characters.length(); i++) {
            //Counter that will be added after each unique character
            int count = 0;
            //Inside loop to check frequency of the character
            if (!result.contains(Character.toString(characters.charAt(i)))) {
                //Adding unique characters to result
                result += characters.charAt(i);
                count++;
                for (int j = i + 1; j < characters.length(); j++) {
                    if (characters.charAt(i) == characters.charAt(j)) {
                        count++;
                    }

                }
                //Adding frequency to result
                result += count;
            }
        }
        //Printing result
        System.out.println(result);

    }
}
