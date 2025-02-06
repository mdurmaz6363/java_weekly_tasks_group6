package kseniia.week_11;

import java.util.Arrays;

public class MoveZerosToTheEnd {

//    ` Array -- Move Zeros to the End
//    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
//    Ex:
//    input:  {1,0,2,0,3,0,4,0};
//    output: [1, 2, 3, 4, 0, 0, 0, 0]

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 2, 0, 3, 0, 4, 0};
        zeroToTheEnd(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void zeroToTheEnd(int[] nums){

        int notZeroElement = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                int tempContainer = nums[notZeroElement];
                nums[notZeroElement] = nums[i];
                nums[i] = tempContainer;
                notZeroElement ++;
            }

        }

        


    }
}
