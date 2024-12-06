package roman_l.week_3;

public class SwapValues {
    /*
    Swap 2 numbers without using a 3rd variable
     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
