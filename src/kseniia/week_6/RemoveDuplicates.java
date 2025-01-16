package kseniia.week_6;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        removeDuplicates(str);

    }

    public static void removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char charactersOfStr = str.charAt(i);

            if (!result.contains(String.valueOf(charactersOfStr))) {
                result += charactersOfStr;
            }
        }

        System.out.println(result);


    }


    /*
    //`Write a return method that can remove the duplicated values from String
    //Ex:  removeDup("AAABBBCCC")  ==> ABC
     */
}
