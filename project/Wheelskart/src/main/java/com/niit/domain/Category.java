package com.niit.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	@Id
	private string id;
	public string getId() {
		return id;
	}
	public void setId(string id) {
		this.id = id;
	}
	public string getDescription() {
		return description;
	}
	public void setDescription(string description) {
		this.description = description;
	}
	public string getName() {
		return name;
	}
	public void setName(string name) {
		this.name = name;
	}
	private string description;
	private string name;
}
