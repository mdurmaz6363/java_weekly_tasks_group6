package michael.week_1;

public class Odd_Or_Even {

    /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */

    public static void main(String[] args) {

        int num_1 = 5;
        int num_2 = 6;

        System.out.println("identify Odd Even: " + num_1 + " is " + identifyOddEven(num_1));
        System.out.println("identify Odd Even: " + num_2 + " is " + identifyOddEven(num_2));

    }

    public static String identifyOddEven(int n) {
        return n % 2 == 0 ? "Even" : "odd";
    }



}
