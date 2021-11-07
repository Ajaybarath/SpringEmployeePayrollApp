package com.bridgelabz.employeepayrollapp.implementation;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {
    EmployeePayrollData getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

    void deteleEmployeePayrollDataById(int empId);
}
