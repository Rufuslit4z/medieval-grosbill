package com.medievalgrosbill.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.database.base.EffectRepository;
import com.medievalgrosbill.models.Effect;
import com.medievalgrosbill.services.base.BaseService;

@Service
public class EffectService extends BaseService<Effect> {

	@Autowired
	private EffectRepository effectRepository;
	
	@Override
	protected BaseCRUDRepository<Effect> getCRUDRepository() {
		// TODO Auto-generated method stub
		return effectRepository;
	}

	@Override
	protected List<Effect> setItemsByCriterias(Effect item, List<Effect> result) {
		// TODO Auto-generated method stub
		return null;
	}

}
