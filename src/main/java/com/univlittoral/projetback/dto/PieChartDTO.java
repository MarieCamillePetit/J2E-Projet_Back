package com.univlittoral.projetback.dto;

import java.util.List;

public class PieChartDTO {
	
	private List<String> colors;
	
	private List<String> labels;

	private List<Integer> values;

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public List<Integer> getValues() {
		return values;
	}

	public void setValues(List<Integer> values) {
		this.values = values;
	}	
	
	

}
