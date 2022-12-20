package com.univlittoral.projetback.dto;

import java.util.List;

public class HomeDTO {
	
	private List<LivresDTO> livre;
	private IndicateursDTO indicateurs;
		    
	    
	    public List<LivresDTO> getLivres() {
	        return livre;
	    }
	    public void setLivres(List<LivresDTO> livre) {
	        this.livre = livre;
	    }
	    
		public IndicateursDTO getIndicateurs() {
			return indicateurs;
		}
		public void setIndicateurs(IndicateursDTO indicateurs) {
			this.indicateurs = indicateurs;
		}
	    
	    

}

