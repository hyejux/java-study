package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StramAPI3 {
    public static void main(String[] args){

        List<String> names = List.of("John", "Alice", "Bob");

        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames);

    }
}
