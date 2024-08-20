package com.searchservice.messaging.consumers.customers;

import com.etiya.common.events.customers.CreateIndividualCustomerEvent;
import com.etiya.corepackage.abstractions.messaging.transport.BaseConsumer;
import com.etiya.corepackage.abstractions.messaging.transport.EventBusSubscriber;
import com.searchservice.entities.Customer;
import com.searchservice.services.FilterService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class CreateIndividualCustomerConsumer extends BaseConsumer<CreateIndividualCustomerEvent> {

    private final FilterService searchService;

    public CreateIndividualCustomerConsumer(EventBusSubscriber eventBusSubscriber, FilterService searchService) {
        super(eventBusSubscriber,CreateIndividualCustomerEvent.class);
        this.searchService = searchService;
    }

    @PostConstruct
    @Override
    public void startConsuming() throws Exception {
        super.startConsuming();
    }

    @Override
    public void consume(CreateIndividualCustomerEvent event) {
        Customer customer = new Customer();
        customer.setId(event.getId().toString());
        customer.setFirstName(event.getFirstName());
        customer.setLastName(event.getLastName());
        customer.setCreatedDate(event.getCreatedDate());
        searchService.addCustomer(customer);
    }
}
