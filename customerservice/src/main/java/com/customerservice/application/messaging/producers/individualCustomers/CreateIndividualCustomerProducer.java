package com.customerservice.application.messaging.producers.individualCustomers;

import com.etiya.common.events.customers.CreateIndividualCustomerEvent;
import com.etiya.corepackage.abstractions.messaging.transport.EventBusProducer;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateIndividualCustomerProducer {

    private final EventBusProducer eventBusProducer;

    public void produce(CreateIndividualCustomerEvent event){
        eventBusProducer.produce(event);
    }
}
