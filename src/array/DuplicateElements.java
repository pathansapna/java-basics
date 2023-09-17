package array;

import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,4,5,6,5,8,7};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < n; i++){
            for (int j = 1; j < n; j++){

                if(arr[i] != arr[j-1]){

                }
                 else if(arr[i] == arr[j]) {
//                        arr[i] = arr[j];
                        System.out.println(arr[i]);
                        i++;


               }
            }
        }
    }

}
