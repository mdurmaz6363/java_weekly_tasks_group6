package sopio.week4;

public class ReverseNegativeNumber2 {

    public static void main(String[] args) {

        System.out.println(reverse(-10001235));

    }
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) { //-12->true; -1->true;
            int digit = x % 10; //-3; //-2; //-1;
            reversed = reversed * 10 + digit; //-3; //32;
            x /= 10; //-12;
        }
        return reversed;

    }

}
