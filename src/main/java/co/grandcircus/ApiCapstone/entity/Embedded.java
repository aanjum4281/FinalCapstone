package co.grandcircus.ApiCapstone.entity;

import java.util.List;

public class Embedded {

	private List<IndEvent> events;

	public Embedded() {
	}

	public Embedded(List<IndEvent> events) {
		super();
		this.events = events;
	}

	public List<IndEvent> getEvents() {
		return events;
	}

	public void setEvents(List<IndEvent> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Embedded [events=" + events + "]";
	}

	
	
}
