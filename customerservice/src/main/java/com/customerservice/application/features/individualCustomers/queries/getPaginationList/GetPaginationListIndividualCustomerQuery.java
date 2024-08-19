package com.customerservice.application.features.individualCustomers.queries.getPaginationList;

import an.awesome.pipelinr.Command;
import com.customerservice.corepackage.application.responses.GetListPaginationResponse;
import com.customerservice.corepackage.persistence.paging.PageRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetPaginationListIndividualCustomerQuery implements
        Command<GetListPaginationResponse<GetPaginationListIndividualCustomerResponse>> {

    private int page;
    private int size;

}
