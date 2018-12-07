package com.medievalgrosbill.game.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medievalgrosbill.game.FirebaseGameObserver;

@Controller
@RequestMapping(value=GameController.BASE_URL)
public class GameController {

	public static final String BASE_URL = "/game";
	
	@RequestMapping(value={"","/","/index"})
	public String index(Model model) throws IOException {
		
		model.addAttribute("game",FirebaseGameObserver.getInstance().getFirebaseGame());
		
		return BASE_URL+"/index";
	}
}
