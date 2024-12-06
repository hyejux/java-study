package StreamAPI_ex;

import java.util.List;
import java.util.Arrays;

public class StreamAPI_ex1 {
    public static void main(String[] args){

        /**
         * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
         * // 출력: 2, 4, 6
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

    }
}
