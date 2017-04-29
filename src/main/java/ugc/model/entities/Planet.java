package ugc.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Planet {

	@Id
	@GeneratedValue
	private long id;

	private String name;

	@ManyToOne
	@JoinColumn(name = "sun_id")
	private Star sun;

	@ManyToOne
	@JoinColumn(name = "solar_system_id")
	private SolarSystem solarSystem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Star getSun() {
		return sun;
	}

	public void setSun(Star sun) {
		this.sun = sun;
	}

	public SolarSystem getSolarSystem() {
		return solarSystem;
	}

	public void setSolarSystem(SolarSystem solarSystem) {
		this.solarSystem = solarSystem;
	}
	
	@Override
	public String toString() {
		return "Planet : " + name;
	}

}
