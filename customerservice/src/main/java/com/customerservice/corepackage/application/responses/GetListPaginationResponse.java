package com.customerservice.corepackage.application.responses;

import com.customerservice.application.features.individualCustomers.queries.getPaginationList.GetPaginationListIndividualCustomerResponse;
import com.customerservice.corepackage.persistence.paging.BasePageableModel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class GetListPaginationResponse<T> extends BasePageableModel {

    private List<T> items;

    public List<T> getItems(){
        if (items==null)
            items= new ArrayList<>();
        return items;
    }

    public void setItems(List<T> items){
        this.items=items;
    }
}
