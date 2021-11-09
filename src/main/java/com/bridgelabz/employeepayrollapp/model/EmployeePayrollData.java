package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

public @Data @ToString
class EmployeePayrollData {

    int id;
    String name;
    int salary;
    String gender;
    LocalDate startDate;
    String note;
    String profilePic;
    List<String> department;

    public EmployeePayrollData(int id, EmployeePayrollDTO employeePayrollDTO) {
        this.id = id;
        this.name = employeePayrollDTO.getName();
        this.salary = employeePayrollDTO.getSalary();
        this.gender = employeePayrollDTO.getGender();
        this.startDate = employeePayrollDTO.getStartDate();
        this.note = employeePayrollDTO.getNote();
        this.profilePic = employeePayrollDTO.getProfilePic();
        this.department = employeePayrollDTO.getDepartment();
    }

}
