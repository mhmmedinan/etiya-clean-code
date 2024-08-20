package com.customerservice.application.features.individualCustomers.commands.create;

import an.awesome.pipelinr.Command;
import com.customerservice.application.features.individualCustomers.mappers.IndividualCustomerMapper;
import com.customerservice.application.messaging.producers.individualCustomers.CreateIndividualCustomerProducer;
import com.customerservice.domain.entities.IndividualCustomer;
import com.customerservice.persistence.repositories.IndividualCustomerRepository;
import com.etiya.common.events.customers.CreateIndividualCustomerEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateIndividualCustomerHandler implements Command.Handler<CreateIndividualCustomerCommand,CreateIndividualCustomerResponse> {

    private final IndividualCustomerRepository individualCustomerRepository;
    private final CreateIndividualCustomerProducer createIndividualCustomerProducer;

    @Override
    public CreateIndividualCustomerResponse handle(CreateIndividualCustomerCommand command) {
        IndividualCustomer mappedIndividualCustomer =
                IndividualCustomerMapper.INSTANCE.individualCustomerFromCreateIndividualCustomerCommand(command);
        IndividualCustomer createIndividualCustomer = individualCustomerRepository.save(mappedIndividualCustomer);
        CreateIndividualCustomerResponse response =
                IndividualCustomerMapper.INSTANCE.createIndividualCustomerResponseFromIndividualCustomer(createIndividualCustomer);

        CreateIndividualCustomerEvent event =
                new CreateIndividualCustomerEvent(
                        createIndividualCustomer.getId(),createIndividualCustomer.getFirstName(),
                        createIndividualCustomer.getLastName(),createIndividualCustomer.getCreatedDate());
        createIndividualCustomerProducer.produce(event);
        return response;

    }
}
