package com.medievalgrosbill.security.services;

import org.springframework.beans.factory.annotation.Autowired;
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

		// ADD CARD TO DATABASE
		
//		Equipment sword = null;
//		
//		System.out.println("EXISTE DEJA");
//		
//		if ((sword = (Equipment) this.cardService.findByName("Epée de féminisme exacerbé")) == null) {
//		
//			System.out.println("EXISTE DEJA");
//			
//			sword = new Weapon(true);
//			sword.setName("Epée de féminisme exacerbé");
//			sword.setDescription("Réservé aux joueuses (ou aux joueurs qui ont changé de sexe)");
//			sword.setImg("/img");
//			sword.setAttack(3);
//			sword.setCost(400);
//			
//			System.out.println("EXISTE DEJA");
//			
//			this.cardService.save(sword);
//			
//			System.out.println("EXISTE DEJA");
//		}
	}
}
