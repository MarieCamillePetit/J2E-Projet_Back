package com.univlittoral.projetback.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Antoine
 *
 */

@RestController
@RequestMapping
@Transactional
public class TestBD {
	
	@GetMapping
	public String getMethodtest() {
		return "Partie back du projet 'Ulco'thèque' du module JEE - UE110";	
	}
}
