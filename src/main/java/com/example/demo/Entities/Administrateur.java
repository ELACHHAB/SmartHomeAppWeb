package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Administrateur extends Personne {
	private String acces;

	public Administrateur(@NotNull String username, @NotNull String email, @NotNull String telephone,
			@NotNull String cIN, @NotNull String password, String type, String acces) {
		super(username, email, telephone, cIN, password, type);
		this.acces = acces;
	}

	public String getAcces() {
		return acces;
	}

	public void setAcces(String acces) {
		this.acces = acces;
	}
	

}
