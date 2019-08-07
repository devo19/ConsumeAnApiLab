package co.grandcircus.consumeapi.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsumeApiResponse {
	
	@JsonProperty("tiny")
	private List<Inventor> inventors;
	
	@JsonProperty("complete")
	private List<Innovator> innovators;

	@Override
	public String toString() {
		return "ConsumeApiResponse [inventors=" + inventors + ", innovators=" + innovators + "]";
	}

	public List<Inventor> getInventors() {
		return inventors;
	}

	public void setInventors(List<Inventor> inventors) {
		this.inventors = inventors;
	}

	public List<Innovator> getInnovators() {
		return innovators;
	}

	public void setInnovators(List<Innovator> innovators) {
		this.innovators = innovators;
	}

}
