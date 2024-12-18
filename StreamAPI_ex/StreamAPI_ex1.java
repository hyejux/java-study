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

        /**
         * List<Integer> evenNumbers = numbers.stream()
         *                                            .filter(n -> n % 2 == 0)
         *                                            .collect(Collectors.toList());
         *
         *         System.out.println(evenNumbers); // 출력: [2, 4, 6, 8, 10]
         */
    }
}
