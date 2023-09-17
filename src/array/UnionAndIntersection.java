package array;

public class UnionAndIntersection {


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        intersection(arr1, arr2);
        union(arr1, arr2);

    }

    private static void union(int[] arr1, int[] arr2) {
//        System.out.println("Union");
//        for(int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]+"");
//
//            for(int j = 0; j< arr2.length; j++) {
//                if(arr1[i] != arr2[j])
//                    System.out.println(arr2[j] +"");
//            }
//        }
    }

    private static void intersection(int[] arr1, int[] arr2) {
        System.out.println("Intersection");

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j< arr2.length; j++) {
                if(arr1[i] == arr2[j])
                    System.out.println(arr1[i]+ "");
            }
        }
    }



}
