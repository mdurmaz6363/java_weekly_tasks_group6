package dragana.practice;

import java.util.Arrays;

public class ReversingArrayElements {
    public static void main(String[] args) {

    int[] arr = {2,5,9,10,15,20};
    int[] reversed = new int[arr.length];

        for (int i = arr.length-1,j=0; i >= 0; i--,j++) {
            reversed[j] = arr[i];
        //  reversed[j]            arr[5]//20

        }

        System.out.println(Arrays.toString(reversed));

}


}
