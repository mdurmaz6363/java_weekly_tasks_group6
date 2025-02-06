package michael.week_10;

import java.util.Arrays;

public class FindMinimumNumber {

//    `Find Minimum
//    Write a method that can find the maximum number from an int Array.

    public static void main(String[] args) {

        int[] numbers = {22, 5, -21, -1, 87, 1132, 41, 38, 35};

        System.out.println("Min value_1 Num(numbers) = " + minValue_1(numbers));
        System.out.println("Min value_2 Num(numbers) = " + minValue_2(numbers));


    }


    // Solution_1
    public static int minValue_1(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int each : n)
            if (each < min)
                min = each;

        return min;
    }


    //Solution_2
    public static int minValue_2(int[] n) {
        Arrays.sort(n);
        return n[0];
    }


}


