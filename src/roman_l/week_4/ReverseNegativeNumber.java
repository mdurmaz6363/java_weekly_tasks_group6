package roman_l.week_4;

/*2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int*/

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int num = -12345;
        System.out.println("Original number " + num);
        System.out.println("Reversed number " + reverseNumber(num));
    }

    public static int reverseNumber(int number) {
        String reversedNum = "";
        //For positive number scenario
        if (number >= 0) {
            String num = Integer.toString(number);
            for (int i = num.length() - 1; i >= 0; i--) {
                reversedNum += num.charAt(i);
            }
            return Integer.parseInt(reversedNum);
            //For negative number scenario
        } else {
            number = Math.abs(number);
            String num = Integer.toString(number);
            for (int i = num.length() - 1; i >= 0; i--) {
                reversedNum += num.charAt(i);
            }
            return Integer.parseInt(reversedNum) * -1;
        }

    }
}
