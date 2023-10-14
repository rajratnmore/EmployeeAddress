package com.geekster.EmployeeAddress.repo;

import com.geekster.EmployeeAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Long> {

}
