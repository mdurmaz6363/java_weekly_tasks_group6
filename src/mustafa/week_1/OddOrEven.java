package mustafa.week_1;

public class OddOrEven {
    // This is a Group6 project space.

    public static void main(String[] args) {
        System.out.println(oddOrEven(6)); // Call the method and print the result.
    }

    public static String oddOrEven(int number) {
        if (number % 2 == 1) {
            return "odd"; // Return "odd" if the number is odd.
        } else {
            return "even"; // Return "even" otherwise.
        }
    }
}
