package ugc.dao.impl;

import java.util.List;

import javax.persistence.Query;

import ugc.dao.api.SolarSystemDao;
import ugc.model.entities.Planet;
import ugc.model.entities.SolarSystem;
import ugc.model.entities.Star;

public class SolarSystemDaoImpl extends AbstractDao implements SolarSystemDao {


	
	public SolarSystem createNewSolarSystem(String solarSystemName) {
		entityManager.getTransaction().begin();
		SolarSystem newSolarSytem = new SolarSystem();
		newSolarSytem.setName(solarSystemName);
		entityManager.persist(newSolarSytem);
		entityManager.getTransaction().commit();
		return newSolarSytem;
	}

	public List<SolarSystem> findAllSolarSystems() {
		Query query = entityManager.createQuery("select ss from SolarSystem ss");
		List<SolarSystem> allSolarSystems = query.getResultList();
		return allSolarSystems;
	}
	
	public Star createAddNewStar (long solarSystemId, String starName) {
		entityManager.getTransaction().begin();
		Star newStar = new Star ();
		SolarSystem solarSystem = entityManager.find(SolarSystem.class, solarSystemId);
		newStar.setSolarSystem(solarSystem);
		newStar.setName(starName);
		entityManager.persist(newStar);
		entityManager.getTransaction().commit();
		return newStar;
	}
	
	public Star createAddNewStar (SolarSystem solarSystem, String starName) {
		entityManager.getTransaction().begin();
		Star newStar = new Star ();
		newStar.setSolarSystem(solarSystem);
		newStar.setName(starName);
		entityManager.persist(newStar);
		entityManager.getTransaction().commit();
		return newStar;
	}

	public Planet createAddNewPlanet(String name, SolarSystem solarSystem, Star sun) {
		entityManager.getTransaction().begin();
		Planet newPlanet = new Planet ();
		newPlanet.setSolarSystem(solarSystem);
		newPlanet.setSun(sun);
		newPlanet.setName(name);
		entityManager.persist(newPlanet);
		entityManager.getTransaction().commit();
		return newPlanet;
	}

}
