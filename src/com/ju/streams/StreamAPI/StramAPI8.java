package com.ju.streams.StreamAPI;

import java.util.List;

public class StramAPI8 {
    public static void main(String[] args){

        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        int maxValue = numbers.stream().max(Integer::compare).orElseThrow();
        System.out.println("최대값" + maxValue);

        int minValue = numbers.stream().min(Integer::compare).orElseThrow();
        System.out.println("최소값" + minValue);
    }
}
