package com.customerservice.webapi.controllers;

import an.awesome.pipelinr.Pipeline;
import com.customerservice.application.features.individualCustomers.commands.create.CreateIndividualCustomerCommand;
import com.customerservice.application.features.individualCustomers.commands.create.CreateIndividualCustomerResponse;
import com.customerservice.application.features.individualCustomers.queries.getPaginationList.GetPaginationListIndividualCustomerQuery;
import com.customerservice.application.features.individualCustomers.queries.getPaginationList.GetPaginationListIndividualCustomerResponse;
import com.customerservice.corepackage.application.responses.GetListPaginationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/individualCustomers")
@RequiredArgsConstructor
public class IndividualCustomersController {

    private final Pipeline pipeline;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public CreateIndividualCustomerResponse add(@RequestBody CreateIndividualCustomerCommand command){
        CreateIndividualCustomerResponse response = command.execute(pipeline);
        return response;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> getListPagination(@RequestParam int page, @RequestParam int pageSize)
    {
        GetPaginationListIndividualCustomerQuery query = new GetPaginationListIndividualCustomerQuery();
        query.setPage(page);
        query.setSize(pageSize);
        GetListPaginationResponse<GetPaginationListIndividualCustomerResponse> response = query.execute(pipeline);
        return ResponseEntity.ok(response);
    }
}
