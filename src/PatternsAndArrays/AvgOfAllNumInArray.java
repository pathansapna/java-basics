package PatternsAndArrays;
/**
 * Write a program that calculates the average of all numbers in a given array. The array may contain positive or negative integers, as well as zero. The function should return a float representing the average of all numbers in the array.
 *
 * Example 1:
 *
 * Input: arr = [1, 2, 3, 4, 5]
 * Output: 3.00000*/
public class AvgOfAllNumInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        findAverage(arr);

    }

    private static void findAverage(int[] arr) {
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            avg = (double) sum / arr.length;
        }
        System.out.println(avg);

    }
}
