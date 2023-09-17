package array;

public class LargestSumContiguousSubArray {


    public static void main(String[] args) {
        int[] arr = {-7,1,2,-2,3,4,5,-5,-1,-3,-5,-6};
        int n = arr.length;
        largestSum(arr, n);
        System.out.println("Largest contiguous sum is ");
        System.out.println(largestSum(arr,n));
    }

    private static int largestSum(int[] arr, int n) {
        int temp = 0;
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            temp = temp + arr[i];
            if (i < m) {
                arr[i] = arr[n - 1];
            }
        }
        return temp;
    }


}
