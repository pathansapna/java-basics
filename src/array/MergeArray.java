package array;

import java.util.*;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,4,3,2};
        int n = arr1.length;
        int[] arr2 = {5,8,7,6};
        int m = arr2.length;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Sorting the array");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int c = n + m;

        int[] arr3 = new int[c];
    // Using the pre-defined function array
        System.arraycopy(arr1, 0, arr3, 0, n);
        System.arraycopy(arr2, 0, arr3, n, m);

        System.out.println("Merged the array");
        System.out.println(Arrays.toString(arr3));


//        List list = new ArrayList(Arrays.asList(arr1)); //returns a list view of an array
//        list.addAll(Arrays.asList(arr2));
////        Object[] arr3 =  list.toArray();
//        System.out.println(list.toString());


    }
}
