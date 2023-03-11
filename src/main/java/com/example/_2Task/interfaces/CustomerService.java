package com.example._2Task.interfaces;

import com.example._3Domain.models.CustomerDto;
import com.example._4Infraestructure.Document.Customer;

public interface CustomerService {
    public Iterable<Customer> getCustomer();
    public CustomerDto addCustomer(CustomerDto customerDto);
    public CustomerDto updateCustomer(CustomerDto customerDto);
    public void deleteCustomer(CustomerDto customerDto);
}
