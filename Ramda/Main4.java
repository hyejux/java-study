package Ramda;

import java.util.function.Consumer;

public class Main4 {
    public static void main(String[] args){
        // 기존 방식
        Consumer<String> printConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        printConsumer.accept("Hello, Java!");

        // 람다식
        Consumer<String> printLambda = s -> System.out.println(s);
        printLambda.accept("Hello, Lambda!");
    }
}
