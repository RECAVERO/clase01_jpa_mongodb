package com.example._2Task.services;

import com.example._2Task.interfaces.CustomerService;
import com.example._3Domain.Contract.CustomerRepository;
import com.example._3Domain.models.CustomerDto;
import com.example._4Infraestructure.Document.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Iterable<Customer> getCustomer() {
        return customerRepository.getCustomer();
    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        return customerRepository.addCustomer(customerDto);
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        return customerRepository.updateCustomer(customerDto);
    }

    @Override
    public void deleteCustomer(CustomerDto customerDto) {
        customerRepository.deleteCustomer(customerDto);
    }
}
