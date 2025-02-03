package com.ju.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class exception02 {
    public static void main(String[] args){

        try{
            int[] arr = {1,2,3,4};
            arr[5] = 1;
        }catch (ArrayIndexOutOfBoundsException e)  { // 배열 범위 예외
            System.out.println("접근 불가 \n" + e.getMessage());
        }
    }
}
