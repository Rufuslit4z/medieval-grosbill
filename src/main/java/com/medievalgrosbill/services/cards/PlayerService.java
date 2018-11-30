package com.medievalgrosbill.services.cards;

import com.medievalgrosbill.database.cards.PlayerRepository;
import com.medievalgrosbill.database.base.BaseCRUDRepository;
import com.medievalgrosbill.models.cards.Player;
import com.medievalgrosbill.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService extends BaseService<Player> {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    protected BaseCRUDRepository<Player> getCRUDRepository() {
        return playerRepository;
    }

    @Override
    protected List<Player> setItemsByCriterias(Player item, List<Player> result) {
        return null;
    }
}
