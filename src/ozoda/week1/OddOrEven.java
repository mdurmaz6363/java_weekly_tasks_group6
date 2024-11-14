package ozoda.week1;

public class OddOrEven {



    /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"


     */
    public static void oddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }

    }
    public static void main(String[] args) {
        oddOrEven(10);

    }
}
