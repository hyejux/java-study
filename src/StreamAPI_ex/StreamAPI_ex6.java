package StreamAPI_ex;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamAPI_ex6 {
    public static void main(String[] args){

        /**
         List<String> words = Arrays.asList("java", "javascript", "python", "javabean");
         // 출력: ["java", "javascript", "javabean"]
         */
        List<String> words = Arrays.asList("java", "javascript", "python", "javabean");

        List<String> filteredWords = words.stream().filter(word -> word.contains("java")).collect(Collectors.toList());

        System.out.println(filteredWords);

    }
}
