package Sheets.Basics;

public class FindSecondLargestFromArray {
    public static void main(String[] args){
        int[] arr = {2,4,9,6,8};
        int n = arr.length;
        findSecondLargest(n, arr);
    }

    private static int findSecondLargest(int n, int[] arr) {
        int largestEle = arr[0];
        int secondLargest = 0;
       for (int i = 0; i < arr.length; i++){
           if (arr[i] >= largestEle){
               secondLargest = largestEle;
               largestEle = arr[i];

           }
           else if(largestEle>arr[i]&&arr[i]>secondLargest){

               secondLargest=arr[i];

           }

       }

        if( secondLargest!=0){

            return secondLargest;

        }

        return -1;
       }
    }

/**
 * First solution
 * Arrays.sort(arr);
 System.out.println(arr[n- 2]);*/