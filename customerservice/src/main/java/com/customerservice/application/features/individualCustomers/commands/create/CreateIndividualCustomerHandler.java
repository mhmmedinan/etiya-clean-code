package com.customerservice.application.features.individualCustomers.commands.create;

import an.awesome.pipelinr.Command;
import com.customerservice.application.features.individualCustomers.mappers.IndividualCustomerMapper;
import com.customerservice.domain.entities.IndividualCustomer;
import com.customerservice.persistence.repositories.IndividualCustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateIndividualCustomerHandler implements Command.Handler<CreateIndividualCustomerCommand,CreateIndividualCustomerResponse> {

    private final IndividualCustomerRepository individualCustomerRepository;

    @Override
    public CreateIndividualCustomerResponse handle(CreateIndividualCustomerCommand command) {
        IndividualCustomer mappedIndividualCustomer =
                IndividualCustomerMapper.INSTANCE.individualCustomerFromCreateIndividualCustomerCommand(command);
        IndividualCustomer createIndividualCustomer = individualCustomerRepository.save(mappedIndividualCustomer);
        CreateIndividualCustomerResponse response =
                IndividualCustomerMapper.INSTANCE.createIndividualCustomerResponseFromIndividualCustomer(createIndividualCustomer);
        return response;

    }
}
