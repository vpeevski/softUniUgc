package ugc.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String name;

	@ManyToOne
	@JoinColumn(name = "home_planet")
	private Planet homePlanet;

	public Person(String name, Planet homePlanet) {
		super();
		this.name = name;
		this.homePlanet = homePlanet;
	}

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

	public Planet getHomePlanet() {
		return homePlanet;
	}

	public void setHomePlanet(Planet homePlanet) {
		this.homePlanet = homePlanet;
	}

}
