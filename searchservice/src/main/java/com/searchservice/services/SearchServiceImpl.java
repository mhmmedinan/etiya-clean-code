package com.searchservice.services;

import com.searchservice.entities.Customer;
import com.searchservice.repositories.SearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService {

    private final SearchRepository searchRepository;

    @Override
    public void addCustomer(Customer customer) {
          searchRepository.save(customer);
    }
}
