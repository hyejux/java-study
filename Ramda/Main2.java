package Ramda;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // 기존 방식
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println(names);

        // 람다식
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println(names);
    }
}
