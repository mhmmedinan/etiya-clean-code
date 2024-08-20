package com.etiya.common.events.customers;

import com.etiya.corepackage.abstractions.events.IntegrationEvent;
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
public class CreateIndividualCustomerEvent extends IntegrationEvent {

    private UUID id;
    private String firstName;
    private String lastName;
    private LocalDateTime createdDate;

    @Override
    public String getTopicName() {
        return "created-customer";
    }
}
