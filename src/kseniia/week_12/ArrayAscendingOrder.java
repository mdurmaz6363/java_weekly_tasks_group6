package kseniia.week_12;

import java.util.Arrays;

public class ArrayAscendingOrder {

//    ` Array -- Sort Ascending
//    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//    Ex:
//    int[] arr = {10, 9, 8, 7};
//    arr = Sort(arr);         ==>{ 7, 8, 9, 10};

    public static void main(String[] args) {

        int[] arr = {10, 9,10, 9, 7,-1, 8, 7};
        int[] sorted = sortAscendingArray(arr);

        System.out.println(Arrays.toString(sorted));

    }


    public static int[] sortAscendingArray(int[] elements) {

        int[] result = new int[elements.length];

      for (int i = 0; i < elements.length; i++) {
            int min = 0; // will be updated when the smaller value is found.


            for (int j = 0; j < elements.length; j++) {
                if (elements[j] < elements[min]){
                    min = j;
                }
            }
            result[i] = elements[min];// Store the minimum value in result[]
            elements[min] = Integer.MAX_VALUE;
       }
        return result;

    }

}
