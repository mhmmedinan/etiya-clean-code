package com.customerservice.corepackage.application.responses;

import com.customerservice.corepackage.persistence.paging.BasePageableModel;

import java.util.ArrayList;
import java.util.List;

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
