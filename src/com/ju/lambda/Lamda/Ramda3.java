package com.ju.lambda.Lamda;

import java.util.ArrayList;
import java.util.List;

public class Ramda3 {
    public static void main(String[] args){
        /**
         *문자열 리스트가 주어졌을 때, 각 문자열의 길이를 출력하는 람다식을 작성하세요.
         * 5 6 6
         */

        List<String> words = List.of("apple", "banana", "cherry");

        List<Integer> result = new ArrayList<>();

        for(String w : words){
            result.add(w.length());
        }

        System.out.println(result);


    }
}
