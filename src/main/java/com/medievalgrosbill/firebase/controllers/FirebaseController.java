package com.medievalgrosbill.firebase.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medievalgrosbill.firebase.FirebaseNotificationObserver;

@Controller
@RequestMapping(value=FirebaseController.BASE_URL)
public class FirebaseController {

	public static final String BASE_URL = "/admins/firebase";
	
	@RequestMapping(value={"","/","/index"})
	public String index(Model model) throws IOException {
		model.addAttribute("notification",FirebaseNotificationObserver.getInstance().getNotification());
		model.addAttribute("player",FirebaseNotificationObserver.getInstance().getNotification());
		return BASE_URL+"/index";
	}
}
