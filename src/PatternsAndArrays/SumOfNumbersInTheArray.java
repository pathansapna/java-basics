package PatternsAndArrays;

public class SumOfNumbersInTheArray {
    public static void main(String[] args){
        int[] arr = {1,4,2};
        sumNumbers(arr);
    }

    public static void sumNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i] ;

        }
        System.out.println(sum);


    }
}
