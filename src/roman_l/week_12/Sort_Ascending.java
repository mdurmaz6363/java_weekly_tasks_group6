package roman_l.week_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*` Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order
without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
            arr = Sort(arr);         ==>{ 7, 8, 9, 10};*/
public class Sort_Ascending {
    public static void main(String[] args) {
        //original array
        int[] arr = {10, 9, 8, 7, 5, 4, -1, -1, 5};
        //print result
        System.out.println(Arrays.toString(arraySort(arr)));
    }

    public static int[] arraySort(int[] numbers) {
        //empty result array
        int[] sortedArray = new int[numbers.length];
        //created list and add values from array
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int eachNumber : numbers) {
            listOfNumbers.add(eachNumber);
        }
        //index for array
        int index = 0;
        while (!listOfNumbers.isEmpty()) {
            sortedArray[index] = Collections.min(listOfNumbers);
            int minNumIndex = listOfNumbers.indexOf(Collections.min(listOfNumbers));
            listOfNumbers.remove(minNumIndex);
            index++;
        }
        return sortedArray;
    }

}
