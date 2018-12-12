package com.medievalgrosbill.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medievalgrosbill.models.Role;
import com.medievalgrosbill.models.User;
import com.medievalgrosbill.models.cards.Card;
import com.medievalgrosbill.models.cards.Equipment;
import com.medievalgrosbill.models.cards.equipment.Weapon;
import com.medievalgrosbill.services.RoleService;
import com.medievalgrosbill.services.cards.CardService;
import com.medievalgrosbill.services.users.UserService;

@Service
public class PreLaunchService {
	
	@Autowired
	private RoleService serviceRole;
	
	@Autowired
	private UserService serviceUser;
	
	@Autowired
	private CardService cardService;
	
	@Transactional()
	public void createFirstAdmin() {
		
		Role role = null;
		if ((role = this.serviceRole.findByName("ADMIN")) == null) {
			role = new Role("ADMIN");
			this.serviceRole.save(role);
		}
		
		User user = null;
		if ((user = this.serviceUser.findByEmail("admin@site.com")) == null) {
			user = new User("admin", "admin@site.com","admin", 1);
			user.getRoles().add(role);
			this.serviceUser.save(user);
		}
	}
	
	@Transactional()
	public void addUserRoleDatabase() {
		Role role = null;
		if ((role = this.serviceRole.findByName("USER")) == null) {
			role = new Role("USER");
			this.serviceRole.save(role);
		}
	}	
}
