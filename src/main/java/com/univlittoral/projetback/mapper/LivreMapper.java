package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.LivresDTO;
import com.univlittoral.projetback.dto.LivresRequestDTO;
import com.univlittoral.projetback.entity.LivresEntity;




public class LivreMapper {

		public static LivresDTO map(LivresEntity entity) {
			LivresDTO livre = new LivresDTO();
			  
			  
			livre.setId(entity.getId()); 
			livre.setNom(entity.getNom());
			livre.setEditeur(entity.getEditeur());
			livre.setNbPages(entity.getNbPages());
			livre.setDateParution(entity.getDateParution()); 
			livre.setLieuParution(entity.getLieuParution()); 
			livre.setAuteur(entity.getAuteur()); 
			livre.setGenre(entity.getGenre()); 

			  return livre;
			 
		}
		
		//Permet de récupérer les Pokémon
		public static List<LivresDTO> map(List<LivresEntity> LivreEntity){
			if(null == LivreEntity) {
				return null;
			}
			List<LivresDTO> result = new ArrayList<LivresDTO>();
			for(final LivresEntity livre : LivreEntity) {
				result.add(LivreMapper.map(livre));
			}
			
			return result;
		}
		
		//Ajout d'un livre
	    public static LivresEntity addLivre(LivresRequestDTO reqAddLivre) {
	    	
	        LivresEntity livreAdd = new LivresEntity();
	        
	        livreAdd.setNom(reqAddLivre.getNom());
	        livreAdd.setDateParution(reqAddLivre.getDateParution());
	        livreAdd.setEditeur(reqAddLivre.getEditeur());
	        livreAdd.setGenre(reqAddLivre.getGenre());
	        livreAdd.setLieuParution(reqAddLivre.getLieuParution());
	        livreAdd.setNbPages(reqAddLivre.getNbPages());
	        livreAdd.setAuteur(reqAddLivre.getAuteur());

	        return livreAdd;
	    }
	    
	    public static LivresEntity modifLivre(LivresRequestDTO reqModifLivre, LivresEntity livreModif) {
	        
	    	livreModif.setDateParution(reqModifLivre.getDateParution());
	    	livreModif.setEditeur(reqModifLivre.getEditeur());
	    	livreModif.setGenre(reqModifLivre.getGenre());
	    	livreModif.setNom(reqModifLivre.getNom());
	    	livreModif.setLieuParution(reqModifLivre.getLieuParution());
	    	livreModif.setNbPages(reqModifLivre.getNbPages());
	    	livreModif.setAuteur(reqModifLivre.getAuteur());
	    	
	        return livreModif;


	    }
}
