package com.code.entity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Students {

    static class Student{
        int id;
        String name;
        int score;


        public Student(int id, String name, int score) {
            this.id = id;
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }


    public static  void main(String[] args){
        List<Student> studentList = Arrays.asList(
                new Student(1,"Shubham", 85),
                new Student(2,"Ram", 55),
                new Student(3,"Mohan", 65),
                new Student(4,"Sohan", 23),
                new Student(5,"Shaym", 98),
                new Student(6,"Deepak", 45),
                new Student(7,"Kumal", 75),
                new Student(8,"Kundan", 66),
                new Student(9,"Mohit", 57),
                new Student(10,"Rohit", 29)
        );

        studentList.stream()
                .sorted(Comparator.comparingInt(s -> s.score))
                .limit(3)
                .forEach(System.out::println);
    }
}
