package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.implementation.IEmployeePayrollService;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Override
    public EmployeePayrollData getEmployeePayrollData() {
        return new EmployeePayrollData(1, new EmployeePayrollDTO("Ajay", 5000));

    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return new EmployeePayrollData(empId, new EmployeePayrollDTO("Ajay", 5000));
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        return new EmployeePayrollData(1, employeePayrollDTO);

    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        return new EmployeePayrollData(empId, employeePayrollDTO);

    }

    @Override
    public void deteleEmployeePayrollDataById(int empId) {

    }
}
