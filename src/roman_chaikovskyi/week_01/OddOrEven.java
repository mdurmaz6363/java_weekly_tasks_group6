package roman_chaikovskyi.week_01;

import static java.lang.System.*;

public class OddOrEven {

    public static void main(String[] args) {
        out.println(oddOrEven(5));
        out.println(oddOrEven(6));
        out.println(oddOrEven(55));
        out.println(oddOrEven(22));
    }

    public static String oddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }

}

 /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */