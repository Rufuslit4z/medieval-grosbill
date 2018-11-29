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
	
	@Column(name="value")
	private Integer value;
	
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
	
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Effect(String name, String type, Integer value) {
		this();
		this.name = name;
		this.type = type;
		this.value = value;
	}
	
	public Effect() {
		super();
	}
	
}