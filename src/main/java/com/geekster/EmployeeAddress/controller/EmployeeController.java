package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("employees/{empId}")
    public Employee getEmployeeById(@PathVariable Long empId){
        return employeeService.getEmployeeById(empId);
    }

    @PostMapping("employees")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("employees/{empId}")
    public String updateEmployeeById(@PathVariable Long empId, @RequestBody Employee employee){
        return employeeService.updateEmployeeById(empId, employee);
    }

    @DeleteMapping("employees/{empId}")
    public String deleteEmployeeById(@PathVariable Long empId){
        return employeeService.deleteEmployeeById(empId);
    }



}
