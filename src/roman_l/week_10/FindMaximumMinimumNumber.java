package roman_l.week_10;

public class FindMaximumMinimumNumber {
    public static void main(String[] args) {
        int[] numbers = {23, 18, 1, 16, 9, 163, 400};
        System.out.println("maximumNumber(numbers) = " + maximumNumber(numbers));
        System.out.println("minimumNumber(numbers) = " + minimumNumber(numbers));
    }

    public static int maximumNumber(int[] numbers) {
        int maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }

    public static int minimumNumber(int[] numbers) {
        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }
}
