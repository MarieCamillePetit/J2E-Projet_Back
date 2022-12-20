package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.AuteursDTO;
import com.univlittoral.projetback.entity.AuteursEntity;

public class AuteurMapper {
	
	public static AuteursDTO map(AuteursEntity entity) {
		AuteursDTO auteur = new AuteursDTO();
		  
		  
		auteur.setId(entity.getId()); 
		auteur.setNom(entity.getNom());
		auteur.setPrenom(entity.getPrenom());
		auteur.setDatedenaissance(entity.getDatedenaissance());

		  return auteur;
		 
	}
	
	//Permet de récupérer les auteurs
	public static List<AuteursDTO> map(List<AuteursEntity> AuteursEntity){
		if(null == AuteursEntity) {
			return null;
		}
		List<AuteursDTO> result = new ArrayList<AuteursDTO>();
		for(final AuteursEntity auteur : AuteursEntity) {
			result.add(AuteurMapper.map(auteur));
		}
		
		return result;
	}

}
