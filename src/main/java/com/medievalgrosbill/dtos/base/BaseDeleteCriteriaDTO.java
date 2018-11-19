package com.medievalgrosbill.dtos.base;

import com.medievalgrosbill.database.DBItem;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseDeleteCriteriaDTO <T extends DBItem> {

    List<T> items;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public BaseDeleteCriteriaDTO() {
        this.items = new ArrayList<T>();
    }
}
