package co.grandcircus.ApiCapstone.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)

public class IndEvent {

//	private String id;
	private String name;
//	private String dates;
//	private String classifications;
//	private String images;
//	private String links;
	
	public IndEvent() {
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
