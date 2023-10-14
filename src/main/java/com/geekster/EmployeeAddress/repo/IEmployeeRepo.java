package com.geekster.EmployeeAddress.repo;

import com.geekster.EmployeeAddress.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
}
