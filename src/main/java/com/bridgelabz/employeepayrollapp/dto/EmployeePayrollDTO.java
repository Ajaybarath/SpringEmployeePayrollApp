package com.bridgelabz.employeepayrollapp.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

public @Data @ToString class EmployeePayrollDTO {

    @NotEmpty(message = "Employee cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    String name;

    @Min(value = 500, message = "Min salary should be more than 500")
    int salary;

    String gender;
    String startDate;
    String note;
    String profilePic;
    List<String> department;
}
