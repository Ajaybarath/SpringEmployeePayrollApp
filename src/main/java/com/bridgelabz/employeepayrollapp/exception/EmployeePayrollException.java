package com.bridgelabz.employeepayrollapp.exception;

import java.util.function.Supplier;

public class EmployeePayrollException extends RuntimeException {
    public EmployeePayrollException(String message) {
        super(message);
    }
}
