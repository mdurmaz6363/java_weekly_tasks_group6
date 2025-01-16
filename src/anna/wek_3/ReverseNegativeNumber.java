package anna.wek_3;

public class ReverseNegativeNumber {
    /*
    `2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */


    public static void main(String[] args) {
        int num = -56;
        System.out.println("Reversed number is: " + reverseNumber(num));
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) { //The while loop continues as long as num is not 0.
            reversed = reversed * 10 + num % 10; //num % 10 gives the last digit of the number. This digit is added to reversed after multiplying the current reversed by 10 to shift its digits left.
            num /= 10;//num % 10 gives the last digit of the number.This digit is added to reversed after multiplying the current reversed by 10 to shift its digits left.
        }
        return reversed;
    }
}
