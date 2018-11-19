package com.medievalgrosbill.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import com.medievalgrosbill.database.DBItem;

@Entity
@Table(name="effect")
@Inheritance
public class Effect extends DBItem {
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="win")
	private Integer win;
	
	@Column(name="lose")
	private Integer lose;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getWin() {
		return win;
	}

	public void setWin(Integer win) {
		this.win = win;
	}

	public Integer getLose() {
		return lose;
	}

	public void setLose(Integer lose) {
		this.lose = lose;
	}
	
	public Effect(String name, String type, Integer win, Integer lose) {
		this();
		this.name = name;
		this.type = type;
		this.win = win;
		this.lose = lose;
	}
	
	public Effect() {
		super();
	}
	
}