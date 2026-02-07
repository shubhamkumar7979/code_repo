package com.code.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    // Constructor to initialize Employee objects with an id and name.
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // Getter methods for id and name.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    // Override toString() method to provide a string representation of Employee objects.
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        // Create a list of Employee objects.
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John"));
        employees.add(new Employee(2, "Alice"));
        employees.add(new Employee(3, "Bob"));
        employees.add(new Employee(4, "John"));
        employees.add(new Employee(5, "Alice"));

        // Group employees by their names using Java Streams.
        Map<String, List<Employee>> employeesByName = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName));

        // Iterate over the grouped employees.
        for (Map.Entry<String, List<Employee>> entry : employeesByName.entrySet()) {
            String name = entry.getKey();
            List<Employee> employeesWithSameName = entry.getValue();

           // Finding Valid IDs for Employees with the Same Name:
            if (employeesWithSameName.size() > 1) {
                System.out.println("Employees with the same name '" + name + "':");
                for (Employee employee : employeesWithSameName) {
                    System.out.println(employee);
                }

                // Find the valid ID (assuming valid ID is the one with the highest value)
                int validId = employeesWithSameName.stream()
                        .mapToInt(Employee::getId)
                        .max()
                        .orElse(-1);

                System.out.println("Valid ID for '" + name + "': " + validId);
            }
        }
    }
}
