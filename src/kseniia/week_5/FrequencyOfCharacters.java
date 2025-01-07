package kseniia.week_5;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String charscters = "AAABBCDD";
        System.out.println("frequencyOfChars(charscters) = " + frequencyOfChars(charscters));


    }

    public static String frequencyOfChars(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains(String.valueOf(str.charAt(i)))) {
                continue;
            }
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    frequency++;
                }
            }

            result += str.charAt(i) + String.valueOf(frequency);
        }

        return result;
    }

    /*
    //Frequency of Characters
    //Write a return method that can find the frequency of characters
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
}
