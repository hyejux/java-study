package com.ju.javabasic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class basic_06 {
    public static void main(String[] args){
        // 나이 계산기 (생년월일 지났는지)

        Scanner sc = new Scanner(System.in);
        System.out.println(" 생년월일 (19990901) >  ");
        String user= sc.next();
        int user_year = Integer.parseInt(user.substring(0,4));
        int user_month = Integer.parseInt(user.substring(4,6));
        int user_day = Integer.parseInt(user.substring(6,8));
        int year =  LocalDate.now().getYear();
        LocalDate test = LocalDate.of(year,user_month,user_day);
        LocalDate test2 = LocalDate.now();

        // 첫번째 날짜가 두번째 날짜보다 이후인지
        if(test.isBefore(test2)){
            // 생일이 지났으니
            System.out.println(year - user_year + 1);
        }else {
            System.out.println(year - user_year);
        }

        sc.close();
    }
}
