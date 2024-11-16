package sopio.week_1;

public class OddAndEven {

    public static String oddOrEven (int n){

        if (n%2==0){
            return "Even";
        }else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(2));
    }
}


 /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */
