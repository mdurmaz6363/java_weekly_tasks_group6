package dragana.week_10;

public class FindMinimum {
    public static void main(String[] args) {

    int[] arr = {10, 15, 2, 16, 10, 9};
        System.out.println("findMin(arr) = " + findMin(arr));
    }
    // `Find Minimum
    // Write a method that can find the minimum number from an int Array.


    public static int findMin(int[] numbers) {

        int min = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }


        }
        return min;

    }
}
