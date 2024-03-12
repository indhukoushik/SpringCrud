package com.xadmin.SpringBootCrud.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Subject")

public class Subject {
	@Id
private String id;
private String name;



public Subject() {
	super();
}
public Subject(String id, String name, String email, String department) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.department = department;
}
private String email;
private String department;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

}
