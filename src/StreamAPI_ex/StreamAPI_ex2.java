package StreamAPI_ex;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPI_ex2 {
    public static void main(String[] args){

        /**
         * List<String> words = Arrays.asList("apple", "banana", "cherry");
         * // 출력: [5, 6, 6]
         */

        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<String> newWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(newWords);

    }
}
