package com.ju.streams.StreamAPI_ex;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class StreamAPI_ex9 {
    public static void main(String[] args){

        /**
         List<Integer> numbers = Arrays.asList(5, 15, 25, 35, 45, 55);
         // 출력: 45

         */

        List<Integer> numbers = Arrays.asList(5, 15, 25, 35, 45, 55);

//      numbers.stream().filter(num -> (num > 10 && num < 50))
//                .sorted()
//                .findFirst();

        int result = numbers.stream()
                .filter(n -> n > 10 && n < 50)
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .orElse(-1);
        System.out.println(result); // 출력: 45


    }
}
