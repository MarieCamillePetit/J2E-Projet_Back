package com.univlittoral.projetback.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.univlittoral.projetback.entity.LivresEntity;
import com.univlittoral.projetback.enums.GenreEnum;


@Repository
public interface LivresRepository extends JpaRepository<LivresEntity, Integer>{
	
	//Récupère une liste de livres ayant comme type {param}
	@Query(value="SELECT l FROM LivresEntity l where l.genre = :genre")
	List<LivresEntity> findLivresByGenre(@Param("genre") final GenreEnum genre);
	
	//Récupère la liste de livres triée dans l'ordre alphabétique
	@Query(value="SELECT * FROM livres order by nom ASC", nativeQuery=true)
	public List<LivresEntity> findAllLivresRepo();
	
	@Query("SELECT genre as labels FROM LivresEntity l GROUP BY l.genre")
	ArrayList<String> findGenre();

	@Query("SELECT count(genre) as values FROM LivresEntity l GROUP BY l.genre")
	ArrayList<Integer> findGenreNb();
	
}
