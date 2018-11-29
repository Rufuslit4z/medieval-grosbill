package com.medievalgrosbill.services.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.database.users.UserRepository;
import com.medievalgrosbill.models.User;
import com.medievalgrosbill.services.base.BaseService;

@Service
public class UserService extends BaseService<User> {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	protected BaseCRUDRepository<User> getCRUDRepository() {
		// TODO Auto-generated method stub
		return this.userRepository;
	}

	@Override
	protected List<User> setItemsByCriterias(User item, List<User> result) {
		// TODO Auto-generated method stub
		return null;
	}
	
	User findByUsername(String username) {
		return this.userRepository.findByUsername(username);
	}
	
	User findByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}
	
	List<User> findByActive(Integer active){
		return this.userRepository.findByActive(active);
	}
	
	User findByUsernameAndEmail(String username, String email) {
		return this.userRepository.findByUsernameAndEmail(username, email);
	}
	
}
