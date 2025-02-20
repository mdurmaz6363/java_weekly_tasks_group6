package dragana.week_12;

import java.util.Arrays;

public class ArrayASCOrder {

    //` Array -- Sort Ascending
    //Write a return method that can sort an int array in Ascending order without
    // using the sort method of the Arrays class
    //Ex:
    //            int[] arr = {10, 9, 8, 7};
    //             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

    public static void main(String[] args) {
        int[] array = {2,6,-1,10,15,20};
        System.out.println(Arrays.toString(array));

    }

    public static int[] arrayAscOrder(int[] elements){

        int[] sortedArray = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            int minimum = 0;

            for (int j = 0; j < elements.length; j++) {
                if (elements[j] < elements[minimum]){
                   minimum = j;
                }
            }
            sortedArray[i] = elements[minimum];
            elements[minimum] = Integer.MAX_VALUE;
        }
        return sortedArray;
    }
}
