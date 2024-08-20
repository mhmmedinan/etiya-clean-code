package com.customerservice.application.features.individualCustomers.queries.getPaginationList;

import an.awesome.pipelinr.Command;
import com.etiya.corepackage.application.responses.GetListPaginationResponse;
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
