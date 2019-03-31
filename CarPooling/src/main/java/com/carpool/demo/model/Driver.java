package com.carpool.demo.model;
import java.io.Serializable;

import javax.persistence.*;
@Entity
public class Driver implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	@Column(unique=true)
	private String username;
	private String name;
	private String email;
	private String password;
	private String phonenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", username=" + username + ", name=" + name + ", email=" + email + ", password="
				+ password + ", phonenumber=" + phonenumber + "]";
	}
	
}
