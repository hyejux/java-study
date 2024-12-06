package StreamAPI_ex;

import java.util.List;
import java.util.Arrays;

public class StreamAPI_ex8 {
    public static void main(String[] args){

        /**
         List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
         // 출력: 30.0

         */

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        Integer avg = numbers.stream().reduce(0,Integer::sum);

    }
}
