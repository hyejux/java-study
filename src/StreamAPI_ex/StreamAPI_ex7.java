package StreamAPI_ex;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPI_ex7 {
    public static void main(String[] args){

        /**
         List<String> words = Arrays.asList("apple", "banana", "cherry", "fig", "grape");
         // 출력: 3

         */

        List<String> words = Arrays.asList("apple", "banana", "cherry", "fig", "grape");

        List<String> newWords = words.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());

        System.out.println(newWords.stream().count());





    }
}
