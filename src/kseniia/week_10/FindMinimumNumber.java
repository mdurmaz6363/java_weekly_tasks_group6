package kseniia.week_10;

import java.util.Arrays;

public class FindMinimumNumber {

//    `Find Minimum
//    Write a method that can find the maximum number from an int Array.

    public static void main(String[] args) {

        int[] numbers = {13, 8, 21, 1, 90, 132, 4};

        System.out.println("maxNum(numbers) = " + maxNum(numbers));
        System.out.println("minNum(numbers) = " + minNum(numbers));


    }

    public static int maxNum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        int max = numbers[0];
        for (int number : numbers) {

            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int minNum(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;


    }
}


