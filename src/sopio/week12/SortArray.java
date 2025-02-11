package sopio.week12;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] num = {10, 8, 9, 5, 3, 11};
        System.out.println(Arrays.toString(sortArray(num)));

    }
    
    public static int [] sortArray (int [] num){
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if (num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1]= temp;
                }
            }
        }
        return num;
    } 
}
