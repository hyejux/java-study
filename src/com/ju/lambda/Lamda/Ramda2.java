package com.ju.lambda.Lamda;

import java.util.ArrayList;
import java.util.List;

public class Ramda2 {
    public static void main(String[] args){

        /**
         * 정수 리스트에서 짝수만 추출하여 새로운 리스트로 반환하세요.
         * [2, 4, 6]
         */

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> newNumbers = new ArrayList<>();

        for(int num : numbers){
            if(num % 2 == 0){
                newNumbers.add(num);
            }
        }

        System.out.println(newNumbers);

//        ---------------
        List<Integer> newNumbers2 = new ArrayList<>();

        numbers.forEach(num -> {
            if (num % 2 == 0){
                newNumbers2.add(num);
            }
        });

        System.out.println(newNumbers2);

    }
}
