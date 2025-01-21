package michael.week_7;

import java.util.Arrays;
import java.util.Collections;

public class Find_The_Unique {

    /*
    Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

     */
    public static void main(String[] args) {

String str="AAABBBCCCDEF";
        System.out.println("unique_1(str) = " + unique_1(str));
        System.out.println("unique_2(str) = " + unique_2(str));

    }

//Solution_1
    public static String unique_1(String str) {
        String[ ] arr=str.split("");
        String unique1="";
        for(int j=0; j<arr.length; j++) {
            int num=0;
            for(int i=0; i<arr.length; i++ ) {
                if(arr[i].equals(arr[j]) )
                    num++;
            }
            if(num==1)
                unique1+=arr[j];
        }
        return unique1;
    }


    // Solution_2
    public static String unique_2(String str) {
        String result ="";
        for(String each : str.split(""))
            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";

        return result;
    }


}
