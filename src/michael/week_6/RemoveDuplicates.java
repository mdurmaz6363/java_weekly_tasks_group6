package michael.week_6;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    /*
    //`Write a return method that can remove the duplicated values from String
    //Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println("removeDuplicates_1(str) = " + removeDuplicates_1(str));
        System.out.println("removeDuplicates_2(str) = " + removeDuplicates_2(str));

    }


    // Solution_1
    public static  String  removeDuplicates_1( String  str) {
        String result = "";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);

        return result;
    }

    // Solution_2

    public static String removeDuplicates_2 (String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", " ,  "" ).replace("[","").replace("]","");
        return  str;
    }





}
