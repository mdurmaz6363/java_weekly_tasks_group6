package dragana.week_1;

public class OddOrEven {
    public static void main(String[] args) {
        oddOrEven(9);
    }

            /*
               Write  a method which can identifies given number is even or odd
           EX:
           identify(5) ->  "Odd"
           identify(6) ->  "Even"

                */

    public static void oddOrEven(int n) {
        if(n % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}



