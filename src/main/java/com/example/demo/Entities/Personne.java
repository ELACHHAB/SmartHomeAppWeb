package com.example.demo.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	  @NotNull
	private String Username;
	  @Column(unique = true)
	  @NotNull
	private String email;
	  @Column(unique = true)
	  @NotNull
	private String telephone;
	  @Column(unique = true)
	  @NotNull
	private String CIN;
	  @NotNull
	private String password;
	  
	private String type;

	public Personne(@NotNull String username, @NotNull String email, @NotNull String telephone, @NotNull String cIN,
			@NotNull String password, String type) {
		super();
		Username = username;
		this.email = email;
		this.telephone = telephone;
		CIN = cIN;
		this.password = password;
		this.type = type;
	}

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", Username=" + Username + ", email=" + email + ", telephone=" + telephone
				+ ", CIN=" + CIN + ", password=" + password + ", type=" + type + "]";
	}
	

	


	

}
