package Method_OOPs_Collections;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int x = 7;
        findElement(arr, x);

    }

    private static boolean findElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return true;
            }
        }
        return false;
    }
}
