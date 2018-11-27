package com.tw.apistackbase.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeesList;

    public EmployeeService(){
        this.employeesList = new ArrayList<>();
        initializeEmployeesList();
    }

    public List<Employee> getEmployeesList(){
        return this.employeesList;
    }

    private void addEmployeesIntoList(Employee employee){
        employeesList.add(employee);
    }

    public void initializeEmployeesList(){
        addEmployeesIntoList(new Employee(0,"Xiaoming",20,"Male"));
        addEmployeesIntoList(new Employee(1,"Xiaohong",19,"Female"));
        addEmployeesIntoList(new Employee(2,"Xiaozhi",15,"Male"));
        addEmployeesIntoList(new Employee(3,"Xiaogang",16,"Male"));
        addEmployeesIntoList(new Employee(4,"Xiaoxia",15,"Female"));
    }
}
