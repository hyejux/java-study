package StreamAPI;

import java.util.List;

public class StramAPI7 {
    public static void main(String[] args){

        List<String> words = List.of("apple", "banana", "cherry");

        words.stream()
                .filter(word-> word.startsWith("a"))
                .map(String::length)
                .forEach(System.out::println);
    }
}
