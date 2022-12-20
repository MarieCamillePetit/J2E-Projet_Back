package com.univlittoral.projetback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.entity.AuteursEntity;
import com.univlittoral.projetback.entity.LivresEntity;
import com.univlittoral.projetback.enums.GenreEnum;
import com.univlittoral.projetback.repository.AuteursRepository;
import com.univlittoral.projetback.repository.LivresRepository;

@Service
public class LivresService {
	@Autowired
	private LivresRepository repo;
	
	@Autowired
	private AuteursRepository AuteurRepo;
	
	//Utilisation du service "findAll" pour obtenir les livres
	public List<LivresEntity> findAllLivres(){
		return repo.findAllLivresRepo();
	}
	
	//Utilisation du service "findAllAuteurs" pour obtenir les auteurs
		public List<AuteursEntity> findAllAuteurs(){
			return AuteurRepo.findAll();
	}
	
	
	//Utilisation du service "findById" pour obtenir un livre avec Id
    public LivresEntity findLivreById(Integer id){
        return repo.findById(id).orElse(null);
    }
    
  //Utilisation du service "findAuteurById" pour obtenir un auteur avec Id
    public AuteursEntity findAuteurById(Integer id){
        return AuteurRepo.findById(id).orElse(null);
    }
    
	//Utilisation du service "deleteById" pour obtenir les livres
    public void deleteById(Integer id) {
        repo.deleteById(id);
    }
    
    
	//Utilisation du service "saveOrUpdateLivre" pour obtenir les livres
    public void saveOrUpdateLivre(LivresEntity livre) {
        repo.save(livre);
    }
    
	//Utilisation du service "findByType" pour obtenir les livres du genre
    public List<LivresEntity> findByGenre(GenreEnum genre){
		return repo.findLivresByGenre(genre);
	}
    
}

