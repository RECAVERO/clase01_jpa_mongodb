package com.example._4Infraestructure.Repository;

import com.example._3Domain.Contract.CustomerRepository;
import com.example._3Domain.models.CustomerDto;
import com.example._4Infraestructure.Document.Customer;
import com.example._4Infraestructure.mongodb.CustomerRepositoryMongoDB;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example._5Util.convert.Convert.dtoToEntity;
import static com.example._5Util.convert.Convert.entityToDto;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private final CustomerRepositoryMongoDB customerRepositoryMongoDB;

    public CustomerRepositoryImpl(CustomerRepositoryMongoDB customerRepositoryMongoDB) {
        this.customerRepositoryMongoDB = customerRepositoryMongoDB;
    }


    @Override
    public Iterable<Customer> getCustomer() {
        return customerRepositoryMongoDB.findAll();
    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        return entityToDto(customerRepositoryMongoDB.save(dtoToEntity(customerDto)));
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        return entityToDto(customerRepositoryMongoDB.save(dtoToEntity(customerDto)));
    }

    @Override
    public void deleteCustomer(CustomerDto customerDto) {
        customerRepositoryMongoDB.delete(dtoToEntity(customerDto));
    }
}
