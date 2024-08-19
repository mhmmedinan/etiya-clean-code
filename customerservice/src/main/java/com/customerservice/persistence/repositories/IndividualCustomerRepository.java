package com.customerservice.persistence.repositories;

import com.customerservice.domain.entities.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer, UUID> {
}
