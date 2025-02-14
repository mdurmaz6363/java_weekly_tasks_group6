package michael.week_11;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {


       int [] numbers = {10,23,0,8,9,0,1,0,100};

       numbers = moveZeros(numbers);
       System.out.println(Arrays.toString(numbers));

    }


    public static int[] moveZeros( int[]  arr ) {
        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;
        for(int each: arr) {
            list.add(each);
            countZero+= (each==0)?1:0;
        }
        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for(int i=0; i <arr.length-countZero; i++ ) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
