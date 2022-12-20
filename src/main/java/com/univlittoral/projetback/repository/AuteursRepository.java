package com.univlittoral.projetback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univlittoral.projetback.entity.AuteursEntity;

@Repository
public interface AuteursRepository extends JpaRepository<AuteursEntity, Integer>{
	
}
