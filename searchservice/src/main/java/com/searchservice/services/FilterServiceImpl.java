package com.searchservice.services;

import com.searchservice.entities.Customer;
import com.searchservice.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FilterServiceImpl implements FilterService {

    private final CustomerRepository customerRepository;

    @Override
    public void addCustomer(Customer customer) {
          customerRepository.save(customer);
    }
}
