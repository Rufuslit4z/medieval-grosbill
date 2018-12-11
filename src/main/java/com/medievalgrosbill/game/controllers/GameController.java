package com.medievalgrosbill.game.controllers;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.sym.Name;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.medievalgrosbill.game.FirebaseGameObserver;
import com.medievalgrosbill.game.FirebaseOpenHelper;
import com.medievalgrosbill.game.models.FirebaseGame;
import com.medievalgrosbill.game.models.Game;
import com.medievalgrosbill.game.service.GameService;
import com.medievalgrosbill.models.User;
import com.medievalgrosbill.services.users.UserService;

@Controller
@RequestMapping(value=GameController.BASE_URL)
public class GameController {

	public static final String BASE_URL = "/game";
		
	@Autowired private UserService userService;
	
	@Autowired private GameService gameService;
	private Game game;
	private String gameName;
	
	@RequestMapping(value={"","/","/index"})
	public String index(Model model) throws IOException {
		
		SecurityContext context = SecurityContextHolder.getContext();
		//System.out.println(context.getAuthentication().getName());
		
		//System.out.println(gameService);
			
		gameName = gameService.addUser(userService.findByEmail(context.getAuthentication().getName()));
		System.out.println(context.getAuthentication().getName());
		//System.out.println(gameName);
			
//		for(User u : gameService.getGameMap().keySet()) {
//			System.out.println(u.toString()+" ; "+u.getEmail());
//		}
		
//		System.out.println(context.getAuthentication().getName());
		
//		FirebaseGameObserver.getInstance().getGame().addUser(userService.findByEmail(context.getAuthentication().getName()));
//		
//		for(User u : FirebaseGameObserver.getInstance().getGame().getUsers()) {
//			System.out.println("USER CONNECTED : "+u.getUsername());
//		}
//		
//		model.addAttribute("game",FirebaseGameObserver.getInstance().getGame());
		
		return BASE_URL+"/index";
	}
}
