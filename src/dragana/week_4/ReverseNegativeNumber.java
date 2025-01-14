package dragana.week_4;

public class ReverseNegativeNumber {


    public static void main(String[] args) {
        System.out.println(reverse(-123));

    }

    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;

    }

    }
