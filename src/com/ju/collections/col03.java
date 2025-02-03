package com.ju.collections;

import java.util.*;

public class col03 {
    public static void main(String[] args){
        Set<Integer> num = new HashSet<>();

        num.add(1);
        num.add(2);
        num.add(4);
        num.add(5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("값 추가해도 ... ");
        num.add(1);
        System.out.println(num);
        scanner.close();
    }
}
