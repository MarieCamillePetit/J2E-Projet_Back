package com.univlittoral.projetback.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.AuteursDTO;
import com.univlittoral.projetback.dto.HomeDTO;
import com.univlittoral.projetback.dto.IndicateursDTO;
import com.univlittoral.projetback.dto.LivresDTO;
import com.univlittoral.projetback.dto.LivresRequestDTO;
import com.univlittoral.projetback.entity.LivresEntity;
import com.univlittoral.projetback.enums.GenreEnum;
import com.univlittoral.projetback.mapper.AuteurMapper;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.service.LivresService;


@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "/rest/bd/") //=> l’URL d’accès à votre controller.
public class HomeController {
	
    @Autowired
    private LivresService service;
    
    @GetMapping(value ="/home")
    public HomeDTO getHome(){
        HomeDTO home = new HomeDTO();
        
        IndicateursDTO indicateur = new IndicateursDTO();
        
        home.setLivres(LivreMapper.map(service.findAllLivres()));        

        List listeGenre = new ArrayList();
        
        
        indicateur.setNbLivres(service.findAllLivres().size());
        indicateur.setNbAuteurs(service.findAllAuteurs().size());
        
        for(final LivresEntity entity : service.findAllLivres()) {
            if(!listeGenre.contains(entity.getGenre())) {
            	listeGenre.add(entity.getGenre());
            }
        }
        
        indicateur.setNbGenres(listeGenre.size());
        
        home.setIndicateurs(indicateur);
        
        return home;
    }
    
    //Retrouver un livre avec son id
    @GetMapping("/livres/{id}")
    public LivresDTO findById(@PathVariable Integer id) {
        return LivreMapper.map(service.findLivreById(id));
    }
    
    //Supprimer un livre
    @DeleteMapping("/livres/{id}")
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }
    
    //Ajout d'un livre
    @PostMapping("/livres")
    public void save(@RequestBody LivresRequestDTO reqAddLivre) {
        LivresEntity livre = LivreMapper.addLivre(reqAddLivre);
        service.saveOrUpdateLivre(livre);
    }
    
    //Modification d'un livre
    @PutMapping("/livres/{id}")
    public void modif(@PathVariable Integer id, @RequestBody LivresRequestDTO reqModifLivre) {
        service.saveOrUpdateLivre(LivreMapper.modifLivre(reqModifLivre, service.findLivreById(id)));
    }
    
    //Trouver les livres du genre
    @GetMapping("livres")
	public List<LivresDTO> findByGenre(@RequestParam GenreEnum genre){
		return LivreMapper.map(service.findByGenre(genre));
	}
    
    
    
  //Retrouver un auteur avec son id
    @GetMapping("/auteurs/{id}")
    public AuteursDTO findAuteurById(@PathVariable Integer id) {
        return AuteurMapper.map(service.findAuteurById(id));
    }
    
	//Obtenir les auteurs
	@GetMapping("/auteurs")
	public List<AuteursDTO> findAllAuteurs(){
		return AuteurMapper.map(service.findAllAuteurs());
	}
    
}