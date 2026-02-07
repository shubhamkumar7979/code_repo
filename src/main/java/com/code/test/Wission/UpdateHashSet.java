//package com.code.test.Wission;
//
//import java.util.HashSet;
//import java.util.Objects;
//public class UpdateHashSet {
//    public static void main(String[] args) {
//        HashSet<Student> studentList = new HashSet<>();
//
//        Student st1 = new Student("Nimit", 1);
//        Student st2 = new Student("Rahul", 3);
//        Student st3 = new Student("Nimit", 2);
//
//        studentList.add(st1);
//        studentList.add(st2);
//        studentList.add(st3);
//
//        System.out.println(studentList.size());
//
//        st1.id = 2;  // changing the id of st1 (which affects hashCode)
//        System.out.println(studentList.size());
//    }}
//
//class Student {
//    int id;
//    String name;
//
//    public Student(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return id == student.id && Objects.equals(name, student.name);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//}