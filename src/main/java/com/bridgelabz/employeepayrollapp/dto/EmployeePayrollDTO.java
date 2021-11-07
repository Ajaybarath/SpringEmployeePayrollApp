package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDTO {

    String name;
    String salary;

    public EmployeePayrollDTO(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
