package sopio.week5;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String word = "ADBACABDBBCCBAC";
        removeDuplicated(word);

    }

    public static void removeDuplicated (String str){
        String noDuplicates = "";

        for (int i = 0; i < str.length(); i++) {
            if (!noDuplicates.contains(String.valueOf(str.charAt(i)))){
                noDuplicates +=str.charAt(i);
            }
        }
        System.out.println(noDuplicates);
    }
}
