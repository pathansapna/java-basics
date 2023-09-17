package Extra_Problems;

/**
 * Given an array of N integers, You can perform the following operation on the array if all the elements in the array are even:- Divide each element of the array by 2. Can you find the number of operations you can perform.
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [4,64,28,12,28]
 * Output: 2
 */
public class EvenDivision {
    public static void main(String[] args) {
        int[] arr = {4, 64, 28, 12, 28};
        numberOfOperations(arr);
    }

    private static void numberOfOperations(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                 arr[i] /= 2;

            }
            count++;
        }


        System.out.println(count);
    }
}
    /*public static int numberOfOperations(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 ==0){
                int s = arr[i]/2;
                arr[i] = s;
            }
            count++;
        }
        return count;
    }*/

