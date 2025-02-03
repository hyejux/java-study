package com.ju.simpleprograms.StudentScoreManage;

import com.ju.oop.classes.Calculator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieManage {
    public static void main(String[] args){

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("공장일기", 5.0));
        movieList.add(new Movie("메모장의세계", 1.3));

        movieList.sort(Comparator.comparing(Movie::getTitle));

        System.out.println("제목으로 정렬----------");

        for(Movie m : movieList){
            System.out.println(m.getTitle());
        }



    }
}
