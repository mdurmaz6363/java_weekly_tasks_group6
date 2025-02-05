package roman_l.week_11;

import java.util.ArrayList;
import java.util.List;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] numbers = {0, 4, 2, 0, 56, 0, 12};
        int[] sortedNumbers = zeroInTheEnd(numbers);
        //printing result
        for (int eachNumber : sortedNumbers) {
            System.out.print(eachNumber+" ");
        }
    }

    public static int[] zeroInTheEnd(int[] numbers) {
        //two lists for zeros and other numbers
        List<Integer> zeroList = new ArrayList<>();
        List<Integer> numbersList = new ArrayList<>();
        //loop to sort those numbers to right lists
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                zeroList.add(numbers[i]);
            }else {
                numbersList.add(numbers[i]);
            }
        }
        //merging two lists
        List<Integer> resultList = new ArrayList<>();
        resultList.addAll(numbersList);
        resultList.addAll(zeroList);
        //converting list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
