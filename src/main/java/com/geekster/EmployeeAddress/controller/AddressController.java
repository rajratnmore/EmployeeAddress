package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("addresses")
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @GetMapping("addresses/{addId}")
    public Address getAddressById(@PathVariable Long addId){
        return addressService.getAddressById(addId);
    }

    @PostMapping("addresses")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @PutMapping("addresses/{addId}")
    public String updateAddressById(@PathVariable Long addId, @RequestBody Address address){
        return addressService.updateAddressById(addId, address);
    }

    @DeleteMapping("employees/{addId}")
    public String deleteAddressById(@PathVariable Long addId){
        return addressService.deleteAddressById(addId);
    }

}
