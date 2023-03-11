package com.example._4Infraestructure.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "Customer")
public class Customer {
    @Id
    private String id;
    private String name;

}
