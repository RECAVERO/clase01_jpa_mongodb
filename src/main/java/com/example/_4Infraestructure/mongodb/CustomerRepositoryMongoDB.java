package com.example._4Infraestructure.mongodb;

import com.example._4Infraestructure.Document.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryMongoDB extends CrudRepository<Customer, String>{
}
