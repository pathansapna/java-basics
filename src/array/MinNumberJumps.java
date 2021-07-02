package array;

import java.util.Arrays;

public class MinNumberJumps {
    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5, 6};
        int n = A.length;
        minJumps(A, n);
        System.out.println(minJumps(A,n));



//    }
//
//    private static int minjumps(int[] arr, int n) {
//        int i = 0;
//        for (i = 0; i < n; i++){
//            arr[i] =arr[i] + i;
//
//        }
//
////        System.out.println(Arrays.toString(arr));
//
//        return i;
    }

    private static int minJumps(int[] A, int n){

        if (n <= 1)
            return 0;
        int maxReach = A[0];
        int step = A[0];
        int jump = 1;
        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jump;
            if (i + A[i] > maxReach)
                maxReach = i + A[i];
            step--;
            if (step == 0) {
                jump++;
                step = maxReach - i;
            }
        }

        return jump;
    }


}
