package com.customerservice.application.features.individualCustomers.commands.create;


import an.awesome.pipelinr.Command;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateIndividualCustomerCommand implements Command<CreateIndividualCustomerResponse> {

    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private String motherName;
    private String fatherName;
    private String nationalityId;
    private String birthDate;
}
