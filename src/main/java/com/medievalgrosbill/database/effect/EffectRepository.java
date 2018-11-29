package com.medievalgrosbill.database.effect;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.models.Effect;

@Repository
public interface EffectRepository extends BaseCRUDRepository<Effect> {
	
	Effect findByName(String name);
	Effect findByType(String type);
	Effect findByValue(Integer value);
}
