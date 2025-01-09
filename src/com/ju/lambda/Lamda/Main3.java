package com.ju.lambda.Lamda;

import java.util.function.Function;

public class Main3 {
    public static void main(String[] args){
        // 기존 방식
        Function<Integer, String> intToString = new Function<Integer, String>() {
            @Override
            public String apply(Integer value) {
                return "Number: " + value;
            }
        };

        System.out.println(intToString.apply(5));

        // 람다식
        Function<Integer, String> intToStringLambda = value -> "Number: " + value;
        System.out.println(intToStringLambda.apply(10));
    }
}
