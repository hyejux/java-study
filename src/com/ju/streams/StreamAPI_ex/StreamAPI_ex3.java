package com.ju.streams.StreamAPI_ex;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPI_ex3 {
    public static void main(String[] args){

        /**
         * List<String> words = Arrays.asList("java", "stream", "api");
         * // 출력: [j, s, a]
         */

        List<String> words = Arrays.asList("java", "stream", "api");

        List<Character> firstLetters = words.stream()
                .map(word -> word.charAt(0))
                .collect(Collectors.toList());
        System.out.println(firstLetters); // 출력: [j, s, a]


    }
}
