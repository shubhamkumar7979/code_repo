//package com.code.entity;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Employee{
//    int id;
//    String name;
//
//    // Constructor
//    public Employee(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    // toString
//
//
//    public String toString() {
//        return  id + "-" + name;
//    }
//}
//public class EmployeeDetails {
//    public static void main(String[] args){
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(1, "Shubham"));
//        employees.add(new Employee(2, "Monu"));
//        employees.add(new Employee(3, "Sonu"));
//        employees.add(new Employee(4, "Ram"));
//        employees.add(new Employee(5, "Shyam"));
//
//        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
//
//        employees.forEach(System.out::println);
//        }
//
//    }
//}
