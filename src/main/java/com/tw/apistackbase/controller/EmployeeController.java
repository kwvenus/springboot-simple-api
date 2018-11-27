package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @GetMapping(produces = {"application/json"})
    public List<Employee> getAllEmployees() {

        List<Employee> employeesList = employeeService.getEmployeesList();
        return employeesList;
    }
}
