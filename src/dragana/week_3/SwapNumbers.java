package dragana.week_3;

public class SwapNumbers {

     /*
    Swap 2 numbers without using a 3rd variable
     */

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        num1 = num1 + num2;
        System.out.println(num1);
        System.out.println(num2);

        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println(num2);
        System.out.println(num1);

        System.out.println("===========================================");

        int num5 = 20;
        int num6 = 40;
        int temp;

        temp=num5;
        num5=num6;
        num6=temp;
        System.out.println(num5);
        System.out.println(num6);

        System.out.println("==============================================");

        swapNumbers(50, 100);

}

        public static void swapNumbers(int num1, int num2) {

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1);
        System.out.println(num2);
    }

}