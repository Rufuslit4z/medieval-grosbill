package com.medievalgrosbill.database.cards;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.models.cards.Monster;
import org.springframework.stereotype.Repository;

@Repository
public interface MonsterRepository extends BaseCRUDRepository<Monster> {
}
