package ch.masters.model;

/**
 * Model class with all the informations about the departures. Data
 *              from csv file and parsed into this class.
 * @author Elia Perenzin, Chiramet Phong Penglerd
 * @year 2016
 * @version 1.0
 */
public class Departure {
	private String name;
	private String departure;
	private String to;
	private String via;
	private String platform;

	// Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}
