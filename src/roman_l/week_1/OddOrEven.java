package roman_l.week_1;

public class OddOrEven {

 /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */

    public static String oddOrEven(int n) {
        return (n % 2 == 0) ? "Number " + n + " is Even" : "Number " + n + " is Odd";
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(5));
    }
}
