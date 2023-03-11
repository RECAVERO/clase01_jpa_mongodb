package com.example._1Aplicattion.rest;

import com.example._2Task.interfaces.CustomerService;
import com.example._3Domain.models.CustomerDto;
import com.example._4Infraestructure.Document.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public Iterable<Customer> getListCustomer(){
        return customerService.getCustomer();
    }

    @PostMapping
    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto){
        return customerService.addCustomer(customerDto);
    }
    @PutMapping
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto){
        return customerService.updateCustomer(customerDto);
    }
    @DeleteMapping
    public void deleteCustomer(@RequestBody CustomerDto customerDto){
        customerService.deleteCustomer(customerDto);
    }
}
