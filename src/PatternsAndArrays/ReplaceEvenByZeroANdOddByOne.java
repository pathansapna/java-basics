package PatternsAndArrays;

/**
 * Write a program that takes in a array of integers and replaces all even numbers with 0 and all odd numbers with 1. The function should return a new array with the modified values.
 * <p>
 * Example 1:
 * <p>
 * Input: arr =  [1, 2, 3, 4, 5]
 * Output: [1, 0, 1, 0, 1]
 */
public class ReplaceEvenByZeroANdOddByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        modifyArray(arr);
    }

    public static int[] modifyArray(int[] arr) {
        int[] modifiedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                modifiedArray[i] = 0; // Replace even numbers with 0
            } else {
                modifiedArray[i] = 1; // Replace odd numbers with 1
            }
        }

        return modifiedArray;
    }
}
