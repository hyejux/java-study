package com.ju.simpleprograms.BookManage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args){

        /*
         도서 관리 프로그램
         ArrayList 를 활용하여 구현
         기본적인 책 추가, 삭제, 조회 기능 구현
         추가 시 동일 이름이면 들어가지 않도록 설정 (공백 유무)
        */

        List<String> book = new ArrayList<>();

        int num = 0;
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("원하는 작업의 번호를 눌러주세요");
            System.out.println("1번 책 조회 \n 2번 책 추가 \n 3번 책 삭제 \n 4번 프로그램 종료 \n >> " );
            num = sc.nextInt();
            sc.nextLine(); // 개행 문자 처리

            switch (num) {
                case 1 :
                    System.out.println("책 조회");
                    if(book.isEmpty()){
                        System.out.println("등록된 책이 없습니다");
                    }else {
                        System.out.println(book);
                    }
                    break;
                case 2 :
                    System.out.println("책 추가 >> ");
                    String newBook = sc.nextLine();
                    String newBook2 = newBook.replace(" ", "");
                    System.out.println(newBook + newBook2);
                    if(newBook.isEmpty() && newBook2.isEmpty()){
                        book.add(newBook);
                    }else {
                        System.out.println("이미 있는 책");
                    }
                    break;
                case 3 :
                    System.out.println("책 삭제");
                    String bookName = sc.nextLine();
                    if(book.contains(bookName)){
                        book.remove(bookName);
                    }else {
                        System.out.println("존재하지 않는 책");
                    }
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;
            }
        }



        //Book book = new Book();








    }


}
