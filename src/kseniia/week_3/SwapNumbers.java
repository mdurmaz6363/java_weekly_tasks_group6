package kseniia.week_3;

public class SwapNumbers {

    public static void main(String[] args) {

        swapNumbers(10, 12);

    }

    public static void swapNumbers(int num1, int num2){

        System.out.println("num1 before swapping = " + num1);
        System.out.println("num2 before swapping = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1 after swapping = " + num1);
        System.out.println("num2 after swapping = " + num2);

    }

}
