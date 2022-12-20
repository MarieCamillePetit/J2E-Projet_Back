package com.univlittoral.projetback.dto;


import java.sql.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.projetback.entity.AuteursEntity;
import com.univlittoral.projetback.enums.GenreEnum;

public class LivresRequestDTO {
	
	private Integer id;
	
	private String nom;
	
	private String editeur;
	
	private Integer nbPages;
	
	private Date dateParution;
	
	private String lieuParution;
	
	private AuteursEntity auteur;
	
	@Enumerated(EnumType.STRING)
	private GenreEnum genre;

	public GenreEnum getGenre() {
		return genre;
	}

	public void setGenre(GenreEnum genre) {
		this.genre = genre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public Integer getNbPages() {
		return nbPages;
	}

	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}


	public Date getDateParution() {
		return dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	public String getLieuParution() {
		return lieuParution;
	}

	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}

	public AuteursEntity getAuteur() {
		return auteur;
	}

	public void setAuteur(AuteursEntity auteur) {
		this.auteur = auteur;
	}





	
	
	
}
