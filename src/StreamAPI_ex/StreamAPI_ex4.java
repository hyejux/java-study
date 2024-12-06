package StreamAPI_ex;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class StreamAPI_ex4 {
    public static void main(String[] args){

        /**
         List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);
         // 출력: [1, 2, 3, 4, 5, 6, 9]
         */

        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);

        List<Integer> orderedNumbers = numbers.stream().distinct().sorted().collect(Collectors.toList());

        System.out.println(orderedNumbers);


    }
}
