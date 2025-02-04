

public class OddOrEven {

            /*
               Write  a method which can identifies given number is even or odd
           EX:
           identify(5) ->  "Odd"
           identify(6) ->  "Even"

                */

    // added a comment

    public static void oddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }

    public static void main(String[] args) {

        oddOrEven(6);

    }

}


