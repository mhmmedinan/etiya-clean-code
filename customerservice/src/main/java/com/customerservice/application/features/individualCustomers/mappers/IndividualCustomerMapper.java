package com.customerservice.application.features.individualCustomers.mappers;

import com.customerservice.application.features.individualCustomers.commands.create.CreateIndividualCustomerCommand;
import com.customerservice.application.features.individualCustomers.commands.create.CreateIndividualCustomerResponse;
import com.customerservice.domain.entities.IndividualCustomer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IndividualCustomerMapper {

    IndividualCustomerMapper INSTANCE = Mappers.getMapper(IndividualCustomerMapper.class);

    IndividualCustomer individualCustomerFromCreateIndividualCustomerCommand(CreateIndividualCustomerCommand createIndividualCustomerCommand);

    CreateIndividualCustomerResponse createIndividualCustomerResponseFromIndividualCustomer(IndividualCustomer individualCustomer);
}
