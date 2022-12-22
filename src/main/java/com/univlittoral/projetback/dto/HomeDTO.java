package com.univlittoral.projetback.dto;

import java.util.List;
import java.util.Map;

public class HomeDTO {
	
	private List<LivresDTO> livre;
	private IndicateursDTO indicateurs;
    private Map<String,Integer> genres;
	private PieChartDTO graphData;
		    
	    
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
		public List<LivresDTO> getLivre() {
			return livre;
		}
		public void setLivre(List<LivresDTO> livre) {
			this.livre = livre;
		}
		public Map<String, Integer> getGenres() {
			return genres;
		}
		public void setGenres(Map<String, Integer> genres) {
			this.genres = genres;
		}
		
		public PieChartDTO getGraphData() {
			return graphData;
		}
		public void setGraphData(PieChartDTO graphData) {
			this.graphData = graphData;
		}
	    
	    

}

