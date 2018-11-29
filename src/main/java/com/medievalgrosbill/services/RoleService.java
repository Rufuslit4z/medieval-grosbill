package com.medievalgrosbill.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.database.roles.RoleRepository;
import com.medievalgrosbill.models.Role;
import com.medievalgrosbill.services.base.BaseService;

@Service
public class RoleService extends BaseService<Role> {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	protected BaseCRUDRepository<Role> getCRUDRepository() {
		// TODO Auto-generated method stub
		return roleRepository;
	}

	@Override
	protected List<Role> setItemsByCriterias(Role item, List<Role> result) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void findByName(String name) {
		this.roleRepository.findByName(name);
	}
}
