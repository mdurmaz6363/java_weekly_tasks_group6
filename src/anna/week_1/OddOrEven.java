package anna.week_1;

public class OddOrEven {



 /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */
    public static void main(String[] args) {
        int number = 5;
        oddOrEven(number);
        oddOrEven(6);

        String str = returnTypeOddOrEven(50);
        System.out.println(str);
    }

    public static void oddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
    }

    public static String returnTypeOddOrEven(int num) {
       return (num % 2 == 0)? "Number is odd" : "Number is even";
    }
}