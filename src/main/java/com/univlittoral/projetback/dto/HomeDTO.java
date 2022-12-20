package com.univlittoral.projetback.dto;

import java.util.List;

public class HomeDTO {
	
	private List<LivresDTO> livre;
	private IndicateursDTO indicateurs;
	//private PieChartDTO pieChart;
		    
	    
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
//		public PieChartDTO getPieChart() {
//			return pieChart;
//		}
//		public void setPieChart(PieChartDTO pieChart) {
//			this.pieChart = pieChart;
//		}
	    
	    

}

