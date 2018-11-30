package com.medievalgrosbill.database.cards;

import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.models.cards.Player;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends BaseCRUDRepository<Player> {
}
