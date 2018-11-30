package com.medievalgrosbill.security.configurations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.medievalgrosbill.security.CustomAuthenticationSuccessHandler;
import com.medievalgrosbill.security.controllers.LoginController;

@Configuration
@EnableAutoConfiguration
@EnableGlobalMethodSecurity
(
		  prePostEnabled = true, 
		  securedEnabled = true, 
		  jsr250Enabled = true
)
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
//			.sessionManagement()
//				.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//			.and()
				.authorizeRequests()
					.antMatchers("/", "/index", "/css/**", "/javascript/**"
							,"/registration"
							,"/errors/**")
						.permitAll()
//					.antMatchers("/users/edit/**").access("hasRole('ROLE_ADMIN')")
					.anyRequest()
						.authenticated()
			.and()
				.formLogin()
					.loginPage(LoginController.LOGIN)
					.usernameParameter(LoginController.FORM_USERNAME)
					.passwordParameter(LoginController.FORM_PASSWORD)
					.successHandler(new CustomAuthenticationSuccessHandler())
					.permitAll()
			.and()
				.logout()
					.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
					.logoutSuccessUrl("/login")
			.and()
				.httpBasic()
		;
	}
	
	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
}
