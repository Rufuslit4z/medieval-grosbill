package com.medievalgrosbill.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.medievalgrosbill.database.DBItem;

@Entity
@Table(name="user")
public class User extends DBItem {
	
	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;

	@ManyToMany()
	private List<Role> roles;
	
	@Column(name = "active")
	private Integer active;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}
	
	public User(String username, String email, Integer active) {
		this();
		this.username = username;
		this.email = email;
		//this.password = password;
		this.active = active;
	}

	public User() {
		super();
		this.roles = new ArrayList<Role>();
	}
}
