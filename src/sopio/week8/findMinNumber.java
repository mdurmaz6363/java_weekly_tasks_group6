package sopio.week8;

import java.util.Arrays;

public class findMinNumber {

    //Find Minimum
    //Write a method that can find the maximum number from an int Array.
    public static void main(String[] args) {

        int [] number = {3, 5, 10, 8, 9};
        int [] result = maxAndMinNumber(number);
        System.out.println("Max "+ result[0]+" , Max: "+result[1]);


    }

    public static int [] maxAndMinNumber (int [] number){
        int maxNumber = number[0];
        int minNumber = number[0];
        for (int i : number) {
            if (i>maxNumber){
                maxNumber = i;
            }
            if (i<minNumber){
                minNumber = i;
            }
        }
        return new int[] {maxNumber, minNumber};
    }
}
