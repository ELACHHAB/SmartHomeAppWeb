package com.example.demo.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class test  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	
	public test() {
		super();
	}
	public test(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "test [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
