package michael.week_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class FrequencyOfCharacters {

     /*
    //Frequency of Characters
    //Write a return method that can find the frequency of characters
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        String charscters = "AAABBCDD";
        System.out.println("frequencyOfChars_1 (charscters) = " + FrequencyOfChars_1(charscters));
        System.out.println("frequencyOfChars_2 (charscters) = " + FrequencyOfChars_2(charscters));
        System.out.println("frequencyOfChars_3 (charscters) = " + FrequencyOfChars_3(charscters));
        System.out.println("frequencyOfChars_4 (charscters) = " + FrequencyOfChars_4(charscters));


    }

    // Solution_1

    public static String FrequencyOfChars_1(String str) {
        String nonDup = "";
        for(int i=0; i < str.length(); i++)
            if(!nonDup.contains(""+str.charAt(i)))
                nonDup+= ""+str.charAt(i);

        String expectedResult = "";
        for( int j=0;j < nonDup.length(); j++) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            expectedResult +=nonDup.charAt(j)+"" + count;
        }
        return expectedResult;
    }


    // Solution_2

    public static String FrequencyOfChars_2 (String str) {
        String expectedResult = "";
        int j=0;
        while( j < str.length()) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult +=str.charAt(j)+"" + count;
            str = str.replace(""+str.charAt(j) ,  "" );
        }
        return expectedResult;
    }

    // Solution_3

    public  static  String  FrequencyOfChars_3 (String str) {

        String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

        b = b.replace(", ","").replace("[","").replace("]","");

        String result="";

        for(int j=0; j<b.length();j++) {
            int count=0;

            for(int i=0; i<str.length(); i++) {

                if (str.substring(i, i + 1).equals("" + b.charAt(j))) {
                    count++;
                }
            }

            result+=b.substring(j, j+1)+count;

        }

        return result;

    }


    // Solution_4

    public static String FrequencyOfChars_4 (String str) {
        String nonDup="", result="";
        for(int i=0; i < str.length(); i++)
            if(! nonDup.contains(""+str.charAt(i)))
                nonDup += ""+str.charAt(i);

        for(int i=0; i < nonDup.length(); i++) {
            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );
            result += ""+nonDup.charAt(i) + num;
        }

        return result;
    }


}
