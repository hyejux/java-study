package com.ju.io;

import javax.imageio.IIOException;
import java.io.*;

public class io01 {
    public static void main(String[] args){

        String filename = "hello.txt";
        String content = "hello world";

        try(BufferedWriter w = new BufferedWriter(new FileWriter(filename))){
            w.write(content);
            System.out.println("파일 쓰기 성공");
        }catch (IOException e){
            e.printStackTrace();
        }


        String filename2 = "hello2.txt";

        try(BufferedReader r = new BufferedReader(new FileReader(filename2))) {
            String line;
            while((line = r.readLine()) != null){ //파일의 끝에 도달하면 null
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
