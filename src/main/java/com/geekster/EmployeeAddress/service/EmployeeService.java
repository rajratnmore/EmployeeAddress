package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long empId) {
        return employeeRepo.findById(empId).orElse(null);
    }

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "new employee added";
    }

    public String updateEmployeeById(Long empId, Employee employee) {
        Employee currentEmployee = employeeRepo.findById(empId).orElse(null);
        if(currentEmployee == null){
            return "employee is not present !";
        }
        employeeRepo.save(employee);
        return "employee updated !";
    }

    public String deleteEmployeeById(Long empId) {
        Employee currentEmployee = employeeRepo.findById(empId).orElse(null);
        if(currentEmployee == null){
            return "employee is not present !";
        }
        employeeRepo.delete(currentEmployee);
        return "employee deleted !";
    }
}
