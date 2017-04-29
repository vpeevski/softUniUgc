package ugc.model.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Anomaly {

	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	private Planet originPlanet;

	@ManyToOne
	private Planet teleportPlanet;

	@ManyToMany
	@JoinTable(name = "anomaly_victims", joinColumns = @JoinColumn(name = "anomaly_id"), inverseJoinColumns = @JoinColumn(name = "victim_id"))
	private Set<Person> victims;

	public Anomaly(Person victim, Planet originPlanet, Planet teleportPlanet) {
		super();
		this.originPlanet = originPlanet;
		this.teleportPlanet = teleportPlanet;
		this.victims = new HashSet<Person>();
		victims.add(victim);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Planet getOriginPlanet() {
		return originPlanet;
	}

	public void setOriginPlanet(Planet originPlanet) {
		this.originPlanet = originPlanet;
	}

	public Planet getTeleportPlanet() {
		return teleportPlanet;
	}

	public void setTeleportPlanet(Planet teleportPlanet) {
		this.teleportPlanet = teleportPlanet;
	}

	public Set<Person> getVictims() {
		return victims;
	}

	public void setVictims(Set<Person> victims) {
		this.victims = victims;
	}

}
