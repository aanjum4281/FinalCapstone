package co.grandcircus.ApiCapstone.entity;

import java.util.List;

public class EventResult {

	private List<Embedded> embedded;
	
	public EventResult() {
	}

	public EventResult(List<Embedded> embedded) {
		super();
		this.embedded = embedded;
	}

	public List<Embedded> getEmbedded() {
		return embedded;
	}

	public void setEmbedded(List<Embedded> embedded) {
		this.embedded = embedded;
	}
	
	
	
}
