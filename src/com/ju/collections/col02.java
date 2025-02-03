package com.ju.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class col02 {
    public static void main(String[] args){
        Map<String, Integer> product = new HashMap<String, Integer>();

        Scanner scanner = new Scanner(System.in);

        product.put("에어팟", 10000);
        product.put("휴지", 500);

        System.out.println("저장할 항목 이름 >> ");
        String name = scanner.next();
        System.out.println("저장할 항목 가격 >> ");
        int price = scanner.nextInt();

        product.put(name, price);

        System.out.println("저장되어있는 상품 목록");
        System.out.println(product);

        scanner.close();
    }
}
