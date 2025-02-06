package Anwr_;

public class Week_03_Swap_Numbers {

        public static void main(String[] args) {

            swapNumbers(5, 10);

        }

        public static void swapNumbers(int num1, int num2){

            System.out.println("before swap num1 = " + num1);
            System.out.println("before swap num2 = " + num2);

            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;

            System.out.println(" after swap num1  = " + num1);
            System.out.println(" after swap num2  = " + num2);

        }

    }

