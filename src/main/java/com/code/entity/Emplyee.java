package com.code.entity;

import java.util.List;

// NAme , Salary, Address
public final class Emplyee {

    private final String name;
    private final double salary;
    private final List<String> address;

    public Emplyee(String name, double salary, List<String> address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public List<String> getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Emplyee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
