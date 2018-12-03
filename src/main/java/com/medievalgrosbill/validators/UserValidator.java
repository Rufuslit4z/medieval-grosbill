package com.medievalgrosbill.validators;

//import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import org.springframework.beans.factory.annotation.Autowired;
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

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");        
        if(user.getUsername().length() < 4 || user.getUsername().length() > 32) {
        	errors.rejectValue("username", "Size.userForm.username");
        } 
//        else if (this.userService.findByUsername(user.getUsername()) != null) {
//        	errors.rejectValue("username", "Duplicate.userForm.username");
//        }
        
                
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
        if (this.userService.findByEmail(user.getEmail()) != null) {
            errors.rejectValue("email", "Duplicate.userForm.email");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }
    }
}