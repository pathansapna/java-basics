package array;

public class WithoutUsingSorting {
    public static void main(String[] args) {
        int[] arr = {2,1,1,0,2};
        int temp = 0;

      for(int i = 0; i < arr.length; i++){
          for(int j = i+1 ; j< arr.length; j++){
              if(arr[i] > arr[j]) {
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;

              }


          }
      }

        System.out.println("Sorting elements");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+"");
        }





        }

}
