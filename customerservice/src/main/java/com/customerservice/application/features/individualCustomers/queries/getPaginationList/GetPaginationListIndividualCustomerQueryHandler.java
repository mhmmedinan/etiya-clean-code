package com.customerservice.application.features.individualCustomers.queries.getPaginationList;

import an.awesome.pipelinr.Command;
import com.customerservice.application.features.individualCustomers.mappers.IndividualCustomerMapper;
import com.customerservice.corepackage.application.responses.GetListPaginationResponse;
import com.customerservice.domain.entities.IndividualCustomer;
import com.customerservice.persistence.repositories.IndividualCustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetPaginationListIndividualCustomerQueryHandler implements
        Command.Handler<GetPaginationListIndividualCustomerQuery, GetListPaginationResponse<GetPaginationListIndividualCustomerResponse>> {

    private final IndividualCustomerRepository individualCustomerRepository;

    @Override
    public GetListPaginationResponse<GetPaginationListIndividualCustomerResponse> handle(GetPaginationListIndividualCustomerQuery command) {
        Pageable pageable = PageRequest.of(command.getPage(),command.getSize());
        Page<IndividualCustomer> individualCustomers = individualCustomerRepository.findAll(pageable);
        GetListPaginationResponse<GetPaginationListIndividualCustomerResponse> responses =
                                IndividualCustomerMapper.INSTANCE.getPaginationListIndividualCustomerResponseFromIndividualCustomer(individualCustomers);
        responses.setHasNext(individualCustomers.hasNext());
        responses.setHasPrevious(individualCustomers.hasPrevious());
        responses.setTotalPages(individualCustomers.getTotalPages());
        responses.setSize(individualCustomers.getSize());
        return  responses;

    }
}
