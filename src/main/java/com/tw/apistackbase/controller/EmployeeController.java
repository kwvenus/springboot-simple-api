package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/{userId}",  produces = {"application/json"})
    public Employee getSpecificEmployee(@PathVariable int userId) {

        Employee specificEmployee = employeeService.getSpecificEmployee(userId);
        return specificEmployee;
    }
    

    @PostMapping(produces = {"application/json"})
    public int createEmployee(@RequestBody Employee employee) {

        int userId = employeeService.createEmployee(employee);
        return userId;
    }

    @PutMapping(produces = {"application/json"})
    public void changeEmployee(@RequestBody Employee employee) {

        employeeService.changeEmployee(employee);
    }

    @DeleteMapping(produces = {"application/json"})
    public void deleteEmployee(@RequestBody Employee employee) {
        employeeService.deleteEmployee(employee);
    }
}
