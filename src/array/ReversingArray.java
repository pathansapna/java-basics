package array;

import java.util.List;

import java.util.*;

public class ReversingArray {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(array));

//        1. Using for() loop
//            for(int i = array.length - 1; i >= 0; i--){
//            System.out.println(array[i]);
//        }

//        2. Using Collections.reverse()
                List<int[]> list = Arrays.asList(array);
                Collections.reverse(list);

                System.out.println(list);

//        IntStream.rangeClosed(1, array.length)
//                .mapToObj(i -> array[array.length - i])
//                .toArray();


//        Stream.of(list)
//                .collect(Collectors.toCollection(ArrayDeque::new)) // or LinkedList
//                .descendingIterator()
//                .forEachRemaining(System.out::println);


    }



}