package com.ju.streams.StreamAPI;

import java.util.List;

public class StramAPI5 {
    public static void main(String[] args){

        List<String> names = List.of("John", "Alice", "Bob", "Alex", "Tom");

       long count = names.stream()
               .filter(name -> name.startsWith("A"))
               .count();

        System.out.println(count);
    }
}
