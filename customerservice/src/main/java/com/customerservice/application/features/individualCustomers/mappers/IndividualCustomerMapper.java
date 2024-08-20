package com.customerservice.application.features.individualCustomers.mappers;

import com.customerservice.application.features.individualCustomers.commands.create.CreateIndividualCustomerCommand;
import com.customerservice.application.features.individualCustomers.commands.create.CreateIndividualCustomerResponse;
import com.customerservice.application.features.individualCustomers.queries.getPaginationList.GetPaginationListIndividualCustomerResponse;
import com.customerservice.domain.entities.IndividualCustomer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import com.etiya.corepackage.application.responses.GetListPaginationResponse;

@Mapper
public interface IndividualCustomerMapper {

    IndividualCustomerMapper INSTANCE = Mappers.getMapper(IndividualCustomerMapper.class);

    IndividualCustomer individualCustomerFromCreateIndividualCustomerCommand(CreateIndividualCustomerCommand createIndividualCustomerCommand);

    CreateIndividualCustomerResponse createIndividualCustomerResponseFromIndividualCustomer(IndividualCustomer individualCustomer);

    @Mapping(source = "individualCustomer.content",target = "items")
    GetListPaginationResponse<GetPaginationListIndividualCustomerResponse>
    getPaginationListIndividualCustomerResponseFromIndividualCustomer(Page<IndividualCustomer> individualCustomer);
}
