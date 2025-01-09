package com.ju.javabasic;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class basic_03 {
    public static void main(String[] args){
        
        // 시간 날짜 출력하기
        LocalDateTime time = LocalDateTime.now();
        System.out.println("현재 시간 : " + time);

        LocalDateTime time2 = LocalDateTime.of(2025, 1, 10 , 02 , 54);
        System.out.println("만들어낸 시간 : " + time2);

        LocalDate today = LocalDate.now();
        System.out.println("현재 날짜만 : " + today);


    }
}
