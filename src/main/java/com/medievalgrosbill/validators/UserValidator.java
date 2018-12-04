package com.medievalgrosbill.validators;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

//import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.medievalgrosbill.models.User;
import com.medievalgrosbill.services.users.UserService;

@Component
public class UserValidator implements Validator {
	
    @Autowired
    private UserService userService;

    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        User user = (User) o;

        String regexPassword = "^(?=.*?\\p{Lu})(?=.*?\\p{Ll})(?=.*?\\d)(?=.*?[`~!@#$%^&*()\\-_=+\\\\|\\[{\\]};:'\",<.>/?]).*$";
        String regexEmail = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        
        // ------------------------------ USER ------------------------------ //
        
        // Username vide
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        
        // Username trop court || trop long
        if(user.getUsername().length() < 4 || user.getUsername().length() > 32) {
        	errors.rejectValue("username", "Size.userForm.username", "Username trop court || trop long");
        	
        	System.out.println("Username trop court || trop long");
        } 
        
        // Username déjà existant
        if(this.userService.findByUsername(user.getUsername()) != null) {
        	errors.rejectValue("username", "Duplicate.userForm.username");
        	System.out.println("Username déjà existant");
        }
        
        // ------------------------------ EMAIL ----------------------------- //
        
        // Email vide
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
        
        // Email déjà existante
        if (this.userService.findByEmail(user.getEmail()) != null) {
            errors.rejectValue("email", "Duplicate.userForm.email");
            System.out.println("Email déjà existante");
        }
        
        // Email incorrecte
        if(!user.getEmail().matches(regexEmail)) {
        	errors.rejectValue("email", "Misspelling.userForm.email");
        	System.out.println("Email incorrecte");
        }       
        
        // ------------------------------ PASSWORD -------------------------- //
        
        // MDP vide
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        
        // MDP trop court || trop long
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
            System.out.println("MDP trop court || trop long");
        }
        
        // MDP incorrect
        // Une lettre majuscule/minuscule, un chiffre et un caractère spécial
        if(!user.getPassword().matches(regexPassword)) {
        	errors.rejectValue("password", "Misspelling.userForm.password");
        	System.out.println("MDP incorrect");
        }
    }
}