package com.ju.streams.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StramAPI6 {
    public static void main(String[] args){

        List<String> fruits = List.of("apple", "banana", "apple", "cherry", "banana");

       List<String> uniqeFruits = fruits.stream()
               .distinct()
               .collect(Collectors.toList());

        System.out.println(uniqeFruits);
    }
}
