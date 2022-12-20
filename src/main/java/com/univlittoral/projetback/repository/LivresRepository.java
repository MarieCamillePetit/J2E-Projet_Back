package com.univlittoral.projetback.repository;

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
	
}
