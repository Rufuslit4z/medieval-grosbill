package com.medievalgrosbill.database.base;

import org.springframework.data.repository.CrudRepository;

import com.medievalgrosbill.database.DBItem;

public interface BaseCRUDRepository<T extends DBItem> extends CrudRepository<T, Integer>  {
	
}
