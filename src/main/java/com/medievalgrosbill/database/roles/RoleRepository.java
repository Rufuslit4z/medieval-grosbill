package com.medievalgrosbill.database.roles;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.models.Role;

public interface RoleRepository extends BaseCRUDRepository<Role> {
	Role findByName(String name);
}
