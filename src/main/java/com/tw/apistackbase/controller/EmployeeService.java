package com.tw.apistackbase.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeesList;
    private int userId = 0;

    public EmployeeService(){
        this.employeesList = new ArrayList<>();
        initializeEmployeesList();
    }

    public List<Employee> getEmployeesList(){
        return this.employeesList;
    }

    private void addEmployeesIntoList(Employee employee){
        employeesList.add(employee);
        employee.setId(userId++);
    }

    public void initializeEmployeesList(){
        addEmployeesIntoList(new Employee("Xiaoming",20,"Male"));
        addEmployeesIntoList(new Employee("Xiaohong",19,"Female"));
        addEmployeesIntoList(new Employee("Xiaozhi",15,"Male"));
        addEmployeesIntoList(new Employee("Xiaogang",16,"Male"));
        addEmployeesIntoList(new Employee("Xiaoxia",15,"Female"));
    }

    public int createEmployee(Employee employee) {
        employee.setId(userId++);
        addEmployeesIntoList(employee);
        return userId;
    }
}
