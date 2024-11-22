package michael.week_1;

import java.util.Scanner;

public class Odd_Or_Even {

    /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */

    public static void main(String[] args) {


        int number;
        String answer;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("Please enter a number: ");
            number = scanner.nextInt();

            oddOrEven(number);


            System.out.println("Do you want to reuse the method (Y/N)");

            answer = scanner.next();

        } while (answer.equalsIgnoreCase("Y"));


        System.out.println("We can directly pass the argument without using scanner.");
        oddOrEven(21);

        System.out.println("2nd solution with a return type...");


        String str = returnTypeOddOrEven(50);
        System.out.println(str);

        scanner.close();
    }

    public static void oddOrEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Your number " + n + " is even number");
        } else {
            System.out.println("Your number " + n + " is odd number");
        }
    }

    public static String returnTypeOddOrEven(int num) {
        return (num % 2 == 0) ? num + "= Number is even" : num + "= Number is odd";
    }
}
