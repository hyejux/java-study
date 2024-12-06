package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StramAPI4 {
    public static void main(String[] args){

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum);

    }
}
