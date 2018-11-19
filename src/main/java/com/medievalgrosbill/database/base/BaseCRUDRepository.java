package com.medievalgrosbill.database.base;

import org.springframework.data.repository.CrudRepository;

import com.medievalgrosbill.database.DBItem;
	
import com.medievalgrosbill.database.DBItem;
import org.springframework.data.repository.CrudRepository;

public interface BaseCRUDRepository<T extends DBItem> extends CrudRepository<T, Integer> {


}
