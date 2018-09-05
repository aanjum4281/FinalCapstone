package co.grandcircus.ApiCapstone.entity;

import java.util.List;

public class Embedded {

	private List<Events> events;

	public Embedded() {
	}

	public Embedded(List<Events> events) {
		super();
		this.events = events;
	}

	public List<Events> getEvents() {
		return events;
	}

	public void setEvents(List<Events> events) {
		this.events = events;
	}
	
	
	
}
