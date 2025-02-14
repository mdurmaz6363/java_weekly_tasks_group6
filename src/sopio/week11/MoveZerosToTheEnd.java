package sopio.week11;

    /*
    ` Array -- Move Zeros to the End
        Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
        Ex:
        input:  {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {

        int[] num = {1,0,2,0,3,0,4,0};
        int []sorted = zerosToLastIndex(num);
        System.out.println("Arrays.toString(sorted) = " + Arrays.toString(sorted));
    }



    public static int[] zerosToLastIndex (int [] num){
        int [] sorted = new int[num.length];
        for (int i = 0, j=0; i < num.length; i++) {
            if (num[i]!=0){
                sorted[j] = num[i];
                j++;
            }
        }
        return sorted;
    }
}
