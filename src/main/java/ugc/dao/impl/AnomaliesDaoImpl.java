package ugc.dao.impl;

import java.util.List;

import javax.persistence.Query;

import ugc.dao.api.AnomaliesDao;
import ugc.model.entities.Anomaly;
import ugc.model.entities.Person;
import ugc.model.entities.Planet;

public class AnomaliesDaoImpl extends AbstractDao implements AnomaliesDao {

	public boolean teleportPerson(Person p, Planet toPlanet) {
		entityManager.getTransaction().begin();
		Anomaly newAnomaly = new Anomaly(p, p.getHomePlanet(), toPlanet);
		entityManager.persist(newAnomaly);
		entityManager.getTransaction().commit();
		return true;
	}

	public List<Planet> findAllPlanetsWithoutAnomalies() {
		Query query = entityManager.createQuery("select p from Planet p where p not in (select a.teleportPlanet from Anomaly a)");
		List<Planet> planetsWihoutAnomalies =  query.getResultList();
		return planetsWihoutAnomalies;
	}

}
