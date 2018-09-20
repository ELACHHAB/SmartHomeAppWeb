package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Utilisateur extends Personne {
	private int max_comptes;

	public Utilisateur(@NotNull String username, @NotNull String email, @NotNull String telephone, @NotNull String cIN,
			@NotNull String password, String type, int max_comptes) {
		super(username, email, telephone, cIN, password, type);
		this.max_comptes = max_comptes;
	}

	public int getMax_comptes() {
		return max_comptes;
	}

	public void setMax_comptes(int max_comptes) {
		this.max_comptes = max_comptes;
	}

	@Override
	public String toString() {
		return "Utilisateur [max_comptes=" + max_comptes + "]";
	}
	
	

}
