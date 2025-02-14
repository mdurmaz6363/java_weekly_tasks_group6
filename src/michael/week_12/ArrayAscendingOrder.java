package michael.week_12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAscendingOrder {
    public static void main(String[] args) {
        int [] numbers_1 = {10,-23,0,8,-9,0,1,0,100};
        int [] numbers_2 = {8,9,5,73,1,-10,-36,-198};

        numbers_1=sortingArrayAsc_1(numbers_1);
        System.out.println(Arrays.toString(numbers_1));

        sortingArrayAsc_2(numbers_2);



    }


// SOLUTION_1
    public static int[] sortingArrayAsc_1(int[] a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int each: a)
            list.add(each);

        for(int i=0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }
    public static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;
        for(int each: a)
            min = Math.min(min, each);
        return min;
    }


    // SOLUTION_2
    public static void sortingArrayAsc_2(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for(int each: arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for(int i=0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }


}
