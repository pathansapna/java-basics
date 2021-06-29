package array;

public class NegativeElementsOneSide {

    public static void main(String[] args) {
        int[] arr = {3, 2, -1, 4, -3, -4};
        int temp = 0;
        int arr_size = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
//                    shiftall(arr, 0, arr_size- 1);
//                    display(arr, arr_size - 1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
//
//        }




    }

//    private static void display(int[] arr, int right) {
//        for (int i = 0; i < right; i++) {
//            System.out.println(arr[i] + "");
//
//        }
//    }

//    public static void shiftall(int[] arr, int left, int right)
//
//    {
//
//        while (left >= right) {
//            if (arr[left] < 0 && arr[right] < 0) {
//                left++;
//            }else if(arr[left] > 0 && arr[right] > 0){
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//
//            }
//        }
    }
}
