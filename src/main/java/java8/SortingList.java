package src.main.java.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortingList {

    public static void main(String[] args) {
//         List list = Arrays.asList(1,2,3,9,7,5);
//
//         List<String> listt = Arrays.asList("Aman","Sagar","Anaira");
//
//         System.out.print(list.stream().sorted().collect(Collectors.toList()));
//
//        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
//
//        System.out.println(list.stream().max(Comparator.naturalOrder()).get());
//
//        System.out.println(listt.stream().max(Comparator.comparingInt(String::length)).get());


//        int[] arr1 = {1,3, 2, 9, 7, 10, 9};
//        int[] arr2 = {1, 5, 2, 6, 8, 9, 10};

        List<Integer> l1 = Arrays.asList(1,3, 2, 9, 7, 10, 9);

        // IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().forEach(x -> System.out.print(x));
        int[] res=Arrays.stream(l1.stream().mapToInt(Integer::intValue).toArray()).distinct().toArray();
        for(int i: res){
            System.out.print(i);
        }





    }
}
