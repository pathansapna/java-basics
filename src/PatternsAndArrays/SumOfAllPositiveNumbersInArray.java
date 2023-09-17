package PatternsAndArrays;
/**
 * Write a program that calculates the sum of all positive numbers in a given array. The function should return an integer representing the sum of all positive numbers in the array.
 *
 * Example 1:
 *
 * Input: arr = [1, 2, 3, 4, 5]
 * Output: 15*/
public class SumOfAllPositiveNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        findSumOfPositives(arr);
    }

    public static int findSumOfPositives(int[] arr) {
        int sum = 0;
        for (int i = 0; i< arr.length; i++){
            if( arr[i] >= 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
