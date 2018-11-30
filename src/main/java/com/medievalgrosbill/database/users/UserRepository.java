package com.medievalgrosbill.database.users;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.medievalgrosbill.database.DBItem;
import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.models.User;

public interface UserRepository extends BaseCRUDRepository<User>{
	
	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findByActive(Integer active);
	User findByUsernameAndEmail(String username, String email);
}
