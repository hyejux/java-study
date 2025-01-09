package com.ju.streams.StreamAPI_ex;

import java.util.List;
import java.util.Arrays;

public class StreamAPI_ex8 {
    public static void main(String[] args){

        /**
         List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
         // 출력: 30.0

         */

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

//        Integer sum = numbers.stream().reduce(0,Integer::sum);
//        Long count = numbers.stream().count();
//        Double avg = Double.valueOf(sum / count);


        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(average); // 출력: 30.0


    }
}
