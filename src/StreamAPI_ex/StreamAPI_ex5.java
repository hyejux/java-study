package StreamAPI_ex;

import java.util.List;
import java.util.Arrays;


public class StreamAPI_ex5 {
    public static void main(String[] args){

        /**
         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
         // 출력: 15
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum); // 출력: 15


    }
}
