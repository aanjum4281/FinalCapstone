package co.grandcircus.ApiCapstone.entity;

public class Events {

	private Long id;
	private String name;
	private String dates;
	private String classifications;
	private String images;
	private String links;
	
	public Events() {
	}

	public Events(Long id, String name, String dates, String classifications, String images, String links) {
		super();
		this.id = id;
		this.name = name;
		this.dates = dates;
		this.classifications = classifications;
		this.images = images;
		this.links = links;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}

	public String getClassifications() {
		return classifications;
	}

	public void setClassifications(String classifications) {
		this.classifications = classifications;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}
	
	
	
}
