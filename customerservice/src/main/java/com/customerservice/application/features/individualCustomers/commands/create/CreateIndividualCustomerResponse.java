package com.customerservice.application.features.individualCustomers.commands.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateIndividualCustomerResponse {

    private UUID id;
    private String firstName;
    private String middleName;
    private String gender;
    private String motherName;
    private String fatherName;
    private String nationalityId;
    private String birthDate;
}
