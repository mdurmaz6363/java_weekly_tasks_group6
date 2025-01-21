package michael.week_4;

public class Reverse {
    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);
    }


   // 2nd Solution from Sopio

    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;

    }

    public static void main(String[] args) {
        System.out.println(reverseNum(-125));
        System.out.println("reverse(-125) = " + reverse(-125));
    }
}
