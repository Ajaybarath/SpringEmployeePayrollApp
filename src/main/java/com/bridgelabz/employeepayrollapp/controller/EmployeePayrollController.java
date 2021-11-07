package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @GetMapping(value = {"/", "", "/get"})
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<>("Get call success", HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<>("Get call success for " + empId, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createEmployeePayroll(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return new ResponseEntity<>("Created employee payroll dto", HttpStatus.OK);
    }

    @PutMapping("/update/{empid}")
    public ResponseEntity<String> updateEmployeePayroll(@PathVariable("empId") int empId, @RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return new ResponseEntity<>("Updated employee payroll dto", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empid}")
    public ResponseEntity<String> deleteEmployeePayroll(@PathVariable("empId") int empId) {
        return new ResponseEntity<>("Deleted employee payroll for id " + empId, HttpStatus.OK);
    }
}
