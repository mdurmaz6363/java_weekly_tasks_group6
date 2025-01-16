package roman_l.week_6;

/*`Write a return method that can remove the duplicated values from String
Ex:  removeDup("ABACABDBBCCBAC")  ==> ABC*/

public class RemoveDuplicates {
    public static void main(String[] args) {
        String word = "ADBACABDBBCCBAC";
        removeDuplicatesMethod(word);

    }

    public static void removeDuplicatesMethod(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(Character.toString(word.charAt(i)))) {
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }
}
