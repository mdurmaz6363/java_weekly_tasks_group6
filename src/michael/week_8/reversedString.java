package michael.week_8;

public class reversedString {
    /*
    Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA

     */

    public static void main(String[] args) {
        String str="Hello Grp_6";
        System.out.println("reverse_1(str) = " + reverse_1(str));
        System.out.println("reverse_2(str) = " + reverse_2(str));
    }

    //Solution_1

    public static String reverse_1(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.toCharArray()[i];

        return  reverse;
    }


    // Solution_2
    public  static String  reverse_2(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}
