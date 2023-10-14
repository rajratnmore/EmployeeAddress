package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long addId) {
        return addressRepo.findById(addId).orElse(null);
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "new address added";
    }

    public String updateAddressById(Long addId, Address address) {
        Address currentAddress = addressRepo.findById(addId).orElse(null);
        if(currentAddress == null){
            return "address is not present !";
        }
        addressRepo.save(address);
        return "address updated !";
    }

    public String deleteAddressById(Long addId) {
        Address currentAddress = addressRepo.findById(addId).orElse(null);
        if(currentAddress == null){
            return "address is not present !";
        }
        addressRepo.delete(currentAddress);
        return "address deleted !";
    }
}
