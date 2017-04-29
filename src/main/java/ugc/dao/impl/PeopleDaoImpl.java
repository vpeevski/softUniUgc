package ugc.dao.impl;

import ugc.dao.api.PeoplesDao;
import ugc.model.entities.Person;
import ugc.model.entities.Planet;
import ugc.model.entities.SolarSystem;

public class PeopleDaoImpl extends AbstractDao implements PeoplesDao {

	public Person createPerson(String name, Planet homePlanet) {
		entityManager.getTransaction().begin();
		Person newPerson = new Person(name, homePlanet);
		entityManager.persist(newPerson);
		entityManager.getTransaction().commit();
		return newPerson;
	}

}
