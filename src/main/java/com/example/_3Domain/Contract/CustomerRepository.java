package com.example._3Domain.Contract;

import com.example._3Domain.models.CustomerDto;
import com.example._4Infraestructure.Document.Customer;

import java.util.List;

public interface CustomerRepository {
    public Iterable<Customer> getCustomer();
    public CustomerDto addCustomer(CustomerDto customerDto);

    public CustomerDto updateCustomer(CustomerDto customerDto);

    public void deleteCustomer(CustomerDto customerDto);
}
