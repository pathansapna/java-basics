package array;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] array = {2,6,3,5,7,4};

//     1.   Sorting is O(n*log(n)), finding min/max value is O(n).
        Arrays.sort(array);
        System.out.println("Min value "+array[0]);
        System.out.println("Max value "+array[array.length-1]);

    }
}
