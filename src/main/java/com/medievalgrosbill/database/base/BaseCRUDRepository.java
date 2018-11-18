package com.medievalgrosbill.database.base;

import com.medievalgrosbill.database.DBItem;
import org.springframework.data.repository.CrudRepository;

public interface BaseCRUDRepository<T extends DBItem> extends CrudRepository<T, Integer> {

}
