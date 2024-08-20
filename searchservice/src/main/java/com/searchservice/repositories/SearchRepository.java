package com.searchservice.repositories;

import com.searchservice.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SearchRepository extends MongoRepository<Customer,String> {
}
