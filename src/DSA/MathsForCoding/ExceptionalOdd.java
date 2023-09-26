package DSA.MathsForCoding;
/**
 * Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.
 * Example 1:
 * Input: arr = [1, 2, 3, 2, 3, 1, 3]
 * Output: 3
 * Explanation: 3 occurs three times.*/
public class ExceptionalOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        getOddOccurrence(arr);
    }
    public static int getOddOccurrence(int[] arr) {
        int odd = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2!=0){
                odd = arr[i];
            }
        }
        return 0;
    }
}
