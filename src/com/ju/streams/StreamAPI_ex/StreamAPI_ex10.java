package com.ju.streams.StreamAPI_ex;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPI_ex10 {
    public static void main(String[] args){

        /**
         List<List<Integer>> nestedList = Arrays.asList(
         Arrays.asList(1, 2, 3),
         Arrays.asList(3, 4, 5),
         Arrays.asList(5, 6, 7)
         );
         // 출력: [1, 2, 3, 4, 5, 6, 7]

         */

        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 4, 5),
                Arrays.asList(5, 6, 7)
        );

        System.out.println(nestedList);

        List<Integer> mergedList = nestedList.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(mergedList); // 출력: [1, 2, 3, 4, 5, 6, 7]


    }
}
