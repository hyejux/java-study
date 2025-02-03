package com.ju.simpleprograms.fileReading;

import java.io.*;

public class FileReading {
    public static void main(String[] args){
        //파일에서 데이터를 읽어 단어 개수, 줄 수, 문자를 세기.

        String filename = "hello2.txt";
        int lineC = 0;
        int wordC = 0;
        int charC = 0;

        try(BufferedReader r = new BufferedReader(new FileReader(filename))){
            String line ;
            while((line = r.readLine()) != null){
                lineC ++;
                String[] words = line.split(" ");
                wordC += words.length;
                charC = line.replaceAll("\\s", "").length();
                // 정규표현식으로 공백문자 제거 후 문자열 길이를 측정해서 문자 개수 알아내기
            }
        }catch (IOException e){
            e.printStackTrace();
        }


        System.out.println("줄" + lineC);
        System.out.println("단어" + wordC);
        System.out.println("문자" + charC);



    }

}
