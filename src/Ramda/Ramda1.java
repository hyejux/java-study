package Ramda;

import java.util.List;


public class Ramda1 {
    public static void main(String[] args){

        /**
         * 정수 리스트가 주어졌을 때, 모든 값을 더한 결과를 반환하는 람다식을 작성하세요.
         * 15
         */

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = 0;
        for (int num : numbers){
            sum += num;
        }

        System.out.println(sum);





    }

}
